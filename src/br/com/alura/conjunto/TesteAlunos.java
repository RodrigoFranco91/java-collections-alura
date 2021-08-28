package br.com.alura.conjunto;

import java.lang.reflect.AnnotatedType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteAlunos {

    public static void main(String[] args) {

        //Criando um conjunto, cujo itens será do tipo String
        Set<String> alunos = new HashSet<>();

        //Adicionando alunos/itens no conjunto
        alunos.add("Rodrigo TUrini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");
        alunos.add("Mauricio Aniche");
        alunos.add("Mauricio Aniche");
        alunos.add("Mauricio Aniche");

        //Chamando o toString dos elementos/itens do conjunto
        //Veremos que conjunto não mantem a oderm de inserção, logo não tem métodos que usam index
        //Conjunto elimina a repetição!
        System.out.println(alunos);

        //Vendo quantidade de itens no conjunto, lembre-se repetição é eliminado.
        System.out.println(alunos.size());

        //Acessando os itens de um conjunto com um for:
        for(String aluno: alunos){
            System.out.println(aluno);
        }

        //Acessando os itens do conjunto através de lambda.
        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

        //Toda Collection tem o metodo contains(), que verifica se o valor está na estrutura, neste caso conjunto
        // Conjunto é muito rápido com contains()
        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
        System.out.println(pauloEstaMatriculado);

        //Removendo um item  do conjunto, no conjunto o remove() é muito rápido!
        alunos.remove("Sergio Lopes");

        //Podemos criar uma lista com os itens de um conjunto, basta passar o conjunto no construtor da lista
        List<String> alunosEmLista = new ArrayList<>(alunos);
        System.out.println(alunosEmLista);

    }
}
