package bean;

public class Cadastro {

    private String nome;
    private int codigo;
    private String dataNascimento;
    private String senha;
    private String profissao;
    private boolean estadoLogin;
    private String dataCadastro;

    public void setarCadastro(String nome, int codigo, String dataNascimento, String senha, String profissao, boolean estadoLogin, String dataCadastro) {

        this.nome = nome;
        this.codigo = codigo;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        this.profissao = profissao;
        this.estadoLogin = estadoLogin;
        this.dataCadastro = dataCadastro;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public boolean isEstadoLogin() {
        return this.estadoLogin;
    }

    public boolean getEstadoLogin() {
        return this.estadoLogin;
    }

    public void setEstadoLogin(boolean estadoLogin) {
        this.estadoLogin = estadoLogin;
    }

    public String getDataCadastro() {
        return this.dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    public String retornarCadastro() {
		String Cadastro = "\n---- Seus dados - Cadastro ----" + "\n\n Nome: " + nome + "\n Código: " + codigo + "\n Data de Nascimento: "
    + dataNascimento + "\n senha: " + senha + "\n Profissão: " + profissao + "\n Estado do Login: " + estadoLogin 
    + "\n dataCadastro: " + dataCadastro;
		
		return Cadastro;

    }
}