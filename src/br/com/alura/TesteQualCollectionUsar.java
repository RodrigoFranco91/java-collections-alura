package br.com.alura;

import br.com.alura.modelo.Aluno;

import java.util.Collection;
import java.util.HashSet;

public class TesteQualCollectionUsar {

    public static void main(String[] args) {

        /*
        O que é collection? Todas classes/interfaces que implementa/herdam a collection que é uma interface que tem funções básicas como
(adicionar elemento, verificar se elemento encontra-se na estrutura, remover elemento e saber quantidade de elementos). Aprendemos
até agora: Set e List que são interfaces que herdam a interface collection. ArrayList, LinkedList, HashSet são classes que implementam
interfaces collection.

        Saber qual usar vai depender muito da sua necessidade! Caso esteja em duvida comece usando o mais genérico
que no caso será Collection, pois desta forma você poderá mudar futuramente sem problemas!

         */
        Collection<Aluno> alunos = new HashSet<>();
        //Toda collection sabe retornar seu tamanho e adicionar item:
        alunos.size();
        alunos.add(null);
        //Mas nem toda collection sabe pegar item via index, isso já é para List!
        //alunos.get(1);
    }
}
