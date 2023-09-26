package listaTarefas;

public class Main {
    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O numero total de elementos na lista e: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("listaTarefas.Tarefa 1");
        listaTarefa.adicionarTarefa("listaTarefas.Tarefa 2");
        listaTarefa.adicionarTarefa("listaTarefas.Tarefa 3");

        System.out.println("O numero total de elementos na lista e: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("listaTarefas.Tarefa 1");

        System.out.println("O numero total de elementos na lista e: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("listaTarefas.Tarefa 1");

        listaTarefa.obterDescricoesTarefas();
    }
}