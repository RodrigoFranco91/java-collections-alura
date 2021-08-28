package br.com.alura.lista;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {

        //Criando os itens do tipo string
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";
        String aula4 = "Aprendendo AWS";

        //Criando uma lista que guarda itens do tipo String
        ArrayList<String> aulas = new ArrayList<>();

        //Adicionando itens na lista
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        aulas.add(aula4);

        //Quando printamos a referencia de uma lista o que será mostrado é o seu metodo toString()
        System.out.println(aulas);

        //Removendo elemento via index (posição)
        aulas.remove(0);

        //Percorrendo uma lista através do foreach
        for (String aula: aulas) {
            System.out.println("Aula : " + aula);
        }

        //Percorrendo lista, incrementando o index. Evite fazer desta maneira
        for (int i = 0; i < aulas.size(); i++){
            System.out.println("Aula : " + aulas.get(i));
        }

        //Percorrendo lista, atraves de uma função lambda!
        aulas.forEach(aula -> {
            System.out.println("Aula : " + aula);
        });

        //Ordenando itens da lista via classe Collections
        //Como os itens dessa lista é do tipo String a ordenação padrão é em ordem alfabetica
        Collections.sort(aulas);
        System.out.println(aulas);
    }
}
