package bean;

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
    
    public String retornarLojaAvatar() {
		String LojaAvatar = "\n---- Seus dados - Loja Avatar ----" + "\n\n Nome do cosm�tico: " + cosmeticos + "\n Pre�o do Cosm�tico: " + preco + 
		"\n Evento do cosm�tico: " + eventos;
		
		return LojaAvatar;
    }
    
}