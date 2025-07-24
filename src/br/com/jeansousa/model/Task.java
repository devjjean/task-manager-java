package br.com.jeansousa.model;

public class Task {

    // Variáveis da Task
    private static int idCounter = 1; // Contador de ID único e automático

    private int id;                   // Identificador único
    private String title;            // Texto com título da tarefa
    private String description;      // Texto com a descrição da tarefa
    private boolean done;            // Indica se a tarefa está feita

    // Construtor da Task sem ID (ID será gerado automaticamente)
    public Task(String title, String description, boolean done) {
        this.id = idCounter++; // ID gerado automaticamente
        this.title = title;
        this.description = description;
        this.done = done;
    }

    // Getters
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

    // Setters (exceto ID, que agora é automático)
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