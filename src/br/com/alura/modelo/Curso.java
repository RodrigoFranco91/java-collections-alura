package br.com.alura.modelo;

import br.com.alura.modelo.Aula;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;

    //Lembvre-se de sempre usar a interface e não a classe para criar a lista!
    private List<Aula> aulas = new LinkedList<>();

    //Criando um conjunto/set que terá alunos
    private Set<Aluno> alunos = new HashSet<>();

    //Criando um mapa, onde chave será a matricula e o valor será o objeto aluno!
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();


    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public String getNome() {
        return nome;
    }

    //A lista retornada não permite que itens sejam adicionados, ou seja, ñ vamos acessar o add desta lista!
    //Não estamos criando uma nova lista, a referencia aponta para mesma lista, mas sem opcão de add
    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

//    public int getTempoTotal() {
//        int tempoTotal = 0;
//        for (Aula aula : aulas) {
//            tempoTotal += aula.getTempo();
//        }
//        return tempoTotal;
//    }

    public int getTempoTotal() {
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "Curso: " + this.nome + " - Tempo total: " + this.getTempoTotal();
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    //O conjunto retornado não permite que itens sejam adicionados, ou seja, ñ vamos acessar o add deste conjunto!
    //Não estamos criando um novo conjunto, a referencia aponta para mesmo conjunto, mas sem opcão de add
    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno){
        return this.alunos.contains(aluno);
    }

    public Aluno buscaMatriculado(int matricula) {
        for(Aluno aluno : alunos){
            if(aluno.getNumeroMatricula() == matricula){
                return aluno;
            }
        }
        throw new NoSuchElementException("Aluno com matricula " + matricula + " não encontrado!");
    }

    public Aluno buscaMatriculadoMapa(int matricula) {
        if(!matriculaParaAluno.containsKey(matricula)){
            throw new NoSuchElementException("Aluno com matricula " + matricula + " não encontrado!");
        }
        return matriculaParaAluno.get(matricula);
    }
}
