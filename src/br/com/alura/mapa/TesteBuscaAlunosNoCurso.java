package br.com.alura.mapa;

import br.com.alura.modelo.Aluno;
import br.com.alura.modelo.Aula;
import br.com.alura.modelo.Curso;

import java.sql.SQLOutput;

public class TesteBuscaAlunosNoCurso {

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

        //Pensa agora que queremos pegar um aluno através de sua matricula!
        //Vamos criar um método para isso!
        System.out.println("Buscando aluno com matricula: " + 5617);
        Aluno aluno = javaColecoes.buscaMatriculado(5617);
        System.out.println(aluno);
        //O metodo buscaMatriculado() teve que fazer um foreach no conjunto alunos e ficar verificando
        // se o aluno da vez tem a matricula desejada!
        //Existe uma estrutura de dados para isso! Que organiza os itens com Chave e Valor! É O MAP
        //Neste exemplo a matrícula poderia ser a chave o valor seria o objeto aluno!
        //Tenha em mente que MAP NÃO IMPLMEENTA/HERDA DE Collection!

        //Usando mapa:
        //Na classe Curso criamos um atributo do tipo mapa que vai ter os alunos matriculados.
        //No metodo matricula() está adicionando itens nesse mapa!
        //Agora para buscar um aluno atraves da matricula, basta cosultar o mapa (o metodo buscaMatriculadoMapa faz isso)!
        //A busca de um mapa é muito rápida!
        Aluno alunoBusca = javaColecoes.buscaMatriculadoMapa(5617);
        System.out.println(alunoBusca);
    }
}
