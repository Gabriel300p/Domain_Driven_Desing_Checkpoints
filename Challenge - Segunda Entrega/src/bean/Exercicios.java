package bean;

public class Exercicios {

    private String nome;
    private String descricao;
    private float pontuacao;

    public Exercicios(String nome, String descricao, float pontuacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.pontuacao = pontuacao;
    }
    
    public Exercicios() {
		super();
	}

	public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPontuacao() {
        return this.pontuacao;
    }

    public void setPontuacao(float pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String retornarExercicios() {
		String Exercicios = "\n---- Seus dados - Exercicios ----" + "\n\n Nome do Exercício: " + nome + "\n Descrição: " + descricao
		+ "\n Total de pontos: " + pontuacao;
		
		return Exercicios;
    }
    
}