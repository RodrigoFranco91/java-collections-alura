package br.com.alura.conjunto;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TesteOutroConjuntos {

    public static void main(String[] args) {

        //Um Set não guarda a ordem de inserção, mas existe uma implementação que sim
        //A implementação LinkedHashSet guarda a ordem
        //Mas ainda não é possivel consultar via index!
        Set<String> nomes = new LinkedHashSet<>();
        nomes.add("Rodrigo");
        nomes.add("Ana");
        nomes.add("Pedro");
        nomes.add("Gabriella");

        System.out.println(nomes);

        //Existe outra implementação
        //Ela só aceita objetos que implementa comparable ou via construtor receber um comparator!
        //Usa a arvore negra por baixo dos panos!
        Set<String> nomes2 = new TreeSet<>();
    }
}
