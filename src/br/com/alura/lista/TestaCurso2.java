package br.com.alura.lista;

import br.com.alura.modelo.Aula;
import br.com.alura.modelo.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {

        //Criando objeto Cuso
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo SIlveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando as Coleçoes", 24));

        List<Aula> aulasImutaeis = javaColecoes.getAulas();
        System.out.println(aulasImutaeis);

        //Se eu tentar ordenar a lista de aulas (Collections.sort(aulasImutaeis);), vou ter uma exception, pois estamos retornando uma
        // Collections.unmodifiableList(aulas), ou seja, uma lista imutavel!
        //A solução é crimar uma nova lista, só que agora mutavel. Para criar essa nova lista, use o construtor do ArrayList!!!
        List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaeis);
        Collections.sort(aulasMutaveis);
        System.out.println(aulasMutaveis);

        //Como poderei obter o tempo total de um curso? Basta somar o tempo de cada aula!
        //Ao inves de fazer um for aqui e somar, vou criar um método na classe Aula e depois chamá-lo
        System.out.println(javaColecoes.getTempoTotal());

        //Chamando o toString da classe Curso
        System.out.println(javaColecoes);
    }
}
