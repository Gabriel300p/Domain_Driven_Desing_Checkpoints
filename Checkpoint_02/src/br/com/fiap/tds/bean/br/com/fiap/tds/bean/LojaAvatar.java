package br.com.fiap.tds.bean;

public class LojaAvatar {

    private String cosmeticos;
    private float preco;
    private Eventos eventos;

    public void setarCadastro(String cosmeticos, float preco, Eventos eventos) {

        this.cosmeticos = cosmeticos;
        this.preco = preco;
        this.eventos = eventos;

    }

    public String getCosmeticos() {
        return this.cosmeticos;
    }

    public void setCosmeticos(String cosmeticos) {
        this.cosmeticos = cosmeticos;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Eventos getEventos() {
        return this.eventos;
    }

    public void setEventos(Eventos eventos) {
        this.eventos = eventos;
    }
    
}