package br.com.jeansousa.model;

public class Task {


    // Variáveis da Task
    private int id;     // Identificador único
    private String title;   // Texto com titulo da tarefa
    private String description;     // Texto com a descrição da tarefa
    private boolean done;       // Verdadeiro ou Falso indicando se a tarefa esta feita ou não

    // Construtor da Task
    public Task(int id, String title, String description, boolean done) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.done = done;
    }
}
