package bean;

public class Usuario {

    private String nome;
	private int codigo;
    private String dataNascimento;
    private String profissao;   
    
    public Usuario(String nome, int codigo, String dataNascimento, String profissao) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.dataNascimento = dataNascimento;
		this.profissao = profissao;
	}
     


	public Usuario() {
		super();
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCodigo() {
		return codigo;
	}

	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getProfissao() {
		return profissao;
	}


	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}


	public String retornarUsuario() {
		String Usuario = "\n---- Seus dados - Usuário ----" + "\n\n Nome: " + nome + "\n Código: "
		+ codigo + "\n Data de nascimento: " + dataNascimento + "\n Profissão: " + profissao;
		
		return Usuario;	
    }
    
    
}