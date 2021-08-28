package br.com.alura;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestePercorrendoModoAntigo {

    public static void main(String[] args) {

        //Antes do java 8 tinhamso que percorrer lista, conjunto ou qualquer outro collection utilizando
        // o iterator. Veja:

        Set<String> alunos = new HashSet<>();

        alunos.add("Rodrigo TUrini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");

        //Percorrendo com iterator:
        Iterator<String> iterator = alunos.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
