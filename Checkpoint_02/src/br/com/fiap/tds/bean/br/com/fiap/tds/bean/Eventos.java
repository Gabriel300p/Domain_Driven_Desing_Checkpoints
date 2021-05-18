package br.com.fiap.tds.bean;

public class Eventos {

    private String tipo;
    private int data;
    private String cosmeticos;

    public void setarEvento(String tipo, int data, String cosmeticos) {
        
        this.tipo = tipo;
        this.data = data;
        this.cosmeticos = cosmeticos;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getCosmeticos() {
        return this.cosmeticos;
    }

    public void setCosmeticos(String cosmeticos) {
        this.cosmeticos = cosmeticos;
    }
    
}