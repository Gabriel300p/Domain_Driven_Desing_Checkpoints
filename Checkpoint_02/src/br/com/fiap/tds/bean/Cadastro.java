

public class Cadastro {

    private String nome;
    private int codigo;
    private int dataNascimento;
    private String senha;
    private String profissao;
    private boolean estadoLogin;
    private int dataCadastro;

    public void setarCadastro(String nome, int codigo, int dataNascimento, String senha, String profissao, boolean estadoLogin, int dataCadastro) {

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

    public int getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
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

    public int getDataCadastro() {
        return this.dataCadastro;
    }

    public void setDataCadastro(int dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

}