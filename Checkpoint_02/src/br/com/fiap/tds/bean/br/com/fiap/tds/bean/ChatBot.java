package br.com.fiap.tds.bean;

public class ChatBot {

    private String nome;
    private String arvoreDialogo;

    public ChatBot(String nome, String arvoreDialogo) {
        this.nome = nome;
        this.arvoreDialogo = arvoreDialogo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArvoreDialogo() {
        return this.arvoreDialogo;
    }

    public void setArvoreDialogo(String arvoreDialogo) {
        this.arvoreDialogo = arvoreDialogo;
    }
    
}