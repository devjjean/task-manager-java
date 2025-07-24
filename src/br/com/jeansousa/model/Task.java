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

    // Getters (Pegar Valor)
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public boolean isDone() {
        return done;
    }

    // Setters (Mudar Valor)
    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setDone(boolean done) {
        this.done = done;
    }
}
