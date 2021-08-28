package br.com.alura.conjunto;

import br.com.alura.modelo.Aluno;
import br.com.alura.modelo.Aula;
import br.com.alura.modelo.Curso;

public class TesteCursoComAlunos {

    public static void main(String[] args) {

        //Criando objeto Curso
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo SIlveira");

        //Adicionando aula no curso.
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando as Coleçoes", 24));

        Aluno a1 = new Aluno("Rodigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio ANiche", 17645);

        //Vamos adicionar aluno no curso, logo podemos criar um metodo para isso na classe Curso
        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        //Percorrendo o conjunto
        System.out.println("Alunos matriculados:");
        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });

        //Verificando se o aluno está matriculado no curso.
        //Lembre-se que ao implementar o equals() no aluno o código abaixo resultará em false,
        // pois cada item de um SET ganha um número identificador.
        //Para corrigir isso basta sobrescrever o método hashCode() na classe aluno.
        System.out.println(javaColecoes.estaMatriculado(a1));

        //Agora vamos fazer a comparação de objetos
        //Pense que em outro trecho de código uma pessoa vai digitar o nome de aluno e depois verificar se o mesmo está matriculado
        //Por padrão vai dar false, pois ao comparar dois objetos por padrão vamos comparar endereço de memória.
        //Cada new gera um novo objeto, com um novo endereço de memoria.
        //Para funcionar temos que sobrescrever o metodo equals() na classe Aluno e configurar do jeito desejado,
        // no nosso caso dois alunos serão o mesmo quando tem o msm nome e a msm matricula
        Aluno turini = new Aluno("Rodigo Turini", 34672);
        System.out.println(a1.equals(turini));

        //Lembre-se que o código abaixo vai comparar endereço de memória.
        System.out.println(a1 == turini);
    }
}
