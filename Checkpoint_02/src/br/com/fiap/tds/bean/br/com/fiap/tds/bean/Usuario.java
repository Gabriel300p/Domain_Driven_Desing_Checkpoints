package br.com.fiap.tds.bean;

import Cadastro;

public class Usuario {

    private Cadastro nome;
    private Cadastro codigo;
    private Cadastro dataNascimento;
    private Cadastro profissao;

    public void setarUsuario(Cadastro nome, Cadastro codigo, Cadastro dataNascimento, Cadastro profissao) {
        this.nome = nome;
        this.codigo = codigo;
        this.dataNascimento = dataNascimento;
        this.profissao = profissao;
    }

    public Cadastro getNome() {
        return this.nome;
    }

    public void setNome(Cadastro nome) {
        this.nome = nome;
    }

    public Cadastro getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Cadastro codigo) {
        this.codigo = codigo;
    }

    public Cadastro getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(Cadastro dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Cadastro getProfissao() {
        return this.profissao;
    }

    public void setProfissao(Cadastro profissao) {
        this.profissao = profissao;
    }
    
}