package bean;

public class Chatbot {

    private String nome;
    private String arvoreDialogo;

    public Chatbot(String nome, String arvoreDialogo) {
        this.nome = nome;
        this.arvoreDialogo = arvoreDialogo;
    }
    

    public Chatbot() {
		super();
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

    public String retornarChatbot() {
		String Chatbot = "\n---- Seus dados - Chatbot ----" + "\n\n Nome: " + nome + "\n Arvore Dialogo (Pergunta): " + arvoreDialogo;
		
		return Chatbot;

    }
    
    
}