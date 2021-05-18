package br.com.fiap.tds.bean;

public class Avatar {

    private Cadastro nome;
    private float pontuacao;
    private String camisa;
    private String calca;
    private String tenis;
    private String bone;
    private String pet;

    public void setarAvatar(Cadastro nome, float pontuacao, String camisa, String calca, String tenis, String bone, String pet) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.camisa = camisa;
        this.calca = calca;
        this.tenis = tenis;
        this.bone = bone;
        this.pet = pet;
    }

    public Cadastro getNome() {
        return this.nome;
    }

    public void setNome(Cadastro nome) {
        this.nome = nome;
    }
    
    public float getPontuacao() {
        return this.pontuacao;
    }

    public void setPontuacao(float pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getCamisa() {
        return this.camisa;
    }

    public void setCamisa(String camisa) {
        this.camisa = camisa;
    }

    public String getCalca() {
        return this.calca;
    }

    public void setCalca(String calca) {
        this.calca = calca;
    }

    public String getTenis() {
        return this.tenis;
    }

    public void setTenis(String tenis) {
        this.tenis = tenis;
    }

    public String getBone() {
        return this.bone;
    }

    public void setBone(String bone) {
        this.bone = bone;
    }

    public String getPet() {
        return this.pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }
}