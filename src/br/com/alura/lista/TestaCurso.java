package br.com.alura.lista;

import br.com.alura.modelo.Aula;
import br.com.alura.modelo.Curso;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {

        //Criando objeto Cuso
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo SIlveira");

        //Pegando do curso sua lista de aulas
        List<Aula> aulas = javaColecoes.getAulas();

        //LIsta está vazia, pois na classe Curso o atributo aulas já demos new na lista, mas não
        // adicionamos nada nela.
        System.out.println(aulas);

        //Dando getAulas() podemos adicionar itens na lista:
        //Não é bom adicionarmos itens na lista da maneira a seguir.
        //O ideal é ter um método para adicionar
        aulas.add(new Aula("Trabalhando com ArrayList", 21));
        System.out.println(aulas);
        System.out.println(javaColecoes.getAulas());
        System.out.println(aulas == javaColecoes.getAulas());

        //Maneira ideal de adicionar itens na lista:
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));

        //Podemos bloquear que o método NÃO IDEAL de adicionar itens.
        //Para isso basta ir na classe Curso, no metodo getAulas() fazer seu retorno ser:
        // Collections.unmodifiableList(aulas)


        /*
        Diferença de ArrayList x LinkedList:

        ArrayList é boa pra consultar o item diretamente pelo index, mas é ruim para adicionar e
        remover item, pois sua organização é lenta.

        LinkedList já é ruim para ser consultada pelo index, mas ja adicionar e remover itens é
        muito bom! É rápida para isso!

         */
    }
}
