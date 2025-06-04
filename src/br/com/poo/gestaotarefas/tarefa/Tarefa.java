package br.com.poo.gestaotarefas.tarefa;

public class Tarefa {
    private int id;
    private String descricao;
    private boolean concluida;

    public Tarefa(int id, String descricao, boolean concluida) {
        this.id = id;
        this.descricao = descricao;
        this.concluida = concluida;
    }

    public String obterDados(){
        return String.format("ID: %d | Descricao: %s | Status: %s", this.id, this.descricao, this.concluida ? "Concluida" : "Em aberto");
    }

}
