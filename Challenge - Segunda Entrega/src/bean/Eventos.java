package bean;

public class Eventos {

    private String tipo;
    private String data;
    private String cosmeticos;

    public void setarEvento(String tipo, String data, String cosmeticos) {
        
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

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCosmeticos() {
        return this.cosmeticos;
    }

    public void setCosmeticos(String cosmeticos) {
        this.cosmeticos = cosmeticos;
    }

    public String retornarEventos() {
		String Eventos = "\n---- Seus dados - Eventos ----" + "\n\n Tipo do Evento: " + tipo + "\n Data: " + data + 
		"\n Cosméticos: " + cosmeticos;
		
		return Eventos;
    }
}