package br.com.alura.lista;

import br.com.alura.modelo.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

    public static void main(String[] args) {

        //Criando os itens da lista. Serão do tipo Aula
        Aula a1 = new Aula("Revistando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        //Adicionando itens na lista
        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        //Desta maneira vamos rodar o toString() de cada item que está na lista
        //Sobrescrevendo toString() na classe Aula
        System.out.println(aulas);

        //Ordenando itens da lista
        //Mas agora os itens da lista é do tipo Aula, e não existe um padrão paro ordernar esse tipo
        //Temos que definir a ordenação (o que faz uma Aula ser primeiro que a outra), para isso
        // temos que fazer Aula implementar a interface: Comparable<Aula> e implementar seu metodo
        Collections.sort(aulas);
        System.out.println(aulas);

        //Outra maneira de orderar a lista, sem ter que fazer a classe do item implementar a interface Comparable
        //Ordenando agora pelo tempo de cada aula.
        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);

        //Outra maneira de ordernar a lista. Sem usar Collections, pois agora a própria lista se ordena
        //Ordenando agora pelo tempo de cada aula.
        aulas.sort(Comparator.comparing(Aula::getTempo));
    }
}
