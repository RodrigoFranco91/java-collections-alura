package br.com.alura.modelo;

public class Aula implements Comparable<Aula>{

    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo)  {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return "Aula : " + this.titulo + " - Tempo: " + this.tempo;
    }

    //Ordenando pelo titulo da aula, ou seja, ordem alfabetica do titulo!
    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.titulo);
    }
}
