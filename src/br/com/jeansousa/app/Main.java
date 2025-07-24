package br.com.jeansousa.app;

import br.com.jeansousa.model.Task;

public class Main {
    public static void main(String[] args) {

    // Criação da Tarefa
    Task FirstTask = new Task("Acadêmia", "Treinar 1:30", false);

    // Mostrar os dados da tarefa criada
     System.out.println("id: " + FirstTask.getId());
     System.out.println("Título: " + FirstTask.getTitle());
     System.out.println("Descrição: " + FirstTask.getDescription());
     System.out.println("Concluído? " + (FirstTask.isDone() ? "Sim" : "Não"));
    }
}
