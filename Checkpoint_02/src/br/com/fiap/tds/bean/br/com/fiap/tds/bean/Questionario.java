package br.com.fiap.tds.bean;

public class Questionario {

    private String nome;
    private int quantidadeQuestoes;
    private String temaQuestoes;
    private String questoes;

    public Questionario(String nome, int quantidadeQuestoes, String temaQuestoes, String questoes) {
        this.nome = nome;
        this.quantidadeQuestoes = quantidadeQuestoes;
        this.temaQuestoes = temaQuestoes;
        this.questoes = questoes;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeQuestoes() {
        return this.quantidadeQuestoes;
    }

    public void setQuantidadeQuestoes(int quantidadeQuestoes) {
        this.quantidadeQuestoes = quantidadeQuestoes;
    }

    public String getTemaQuestoes() {
        return this.temaQuestoes;
    }

    public void setTemaQuestoes(String temaQuestoes) {
        this.temaQuestoes = temaQuestoes;
    }

    public String getQuestoes() {
        return this.questoes;
    }

    public void setQuestoes(String questoes) {
        this.questoes = questoes;
    }

    
}