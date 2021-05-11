package bean;

public class Cadastro {
	
	private String nome;
	private String sobrenome;
	private int idade;
	private int rm;
	private float altura;
	private String materiaFavorita;
	
	public void setarCadastro(String nome, String sobrenome, int idade, int rm, float altura, String materiaFavorita) {
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.rm = rm;
		this.altura = altura;
		this.materiaFavorita = materiaFavorita;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}

	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public String getMateriaFavorita() {
		return materiaFavorita;
	}
	public void setMateriaFavorita(String materiaFavorita) {
		this.materiaFavorita = materiaFavorita;
	}
	
	public String retornarCadastro() {
		String cadastro = "\n---- Seus dados ----" + "\n\n Nome: " + nome + "\n Sobrenome: " + sobrenome + "\n idade: "
		+ idade + "\n RM: " + rm + "\n Altura: " + altura + "\n Matéria Favorita: " + materiaFavorita;
		
		return cadastro;
	
	}

}
