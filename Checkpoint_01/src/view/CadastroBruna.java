package view;

import bean.Cadastro;

public class CadastroBruna {
	
	public static void main(String[] args) {
		
		Cadastro cadBruna =  new Cadastro();
		
		cadBruna.setNome("Bruna");
		cadBruna.setSobrenome("Luz");
		cadBruna.setIdade(21);
		cadBruna.setRm(88456);
		cadBruna.setAltura((float)1.63);
		cadBruna.setMateriaFavorita("Computal Thinking Using Python");
		
		cadBruna.setarCadastro(cadBruna.getNome(),
				cadBruna.getSobrenome(),
				cadBruna.getIdade(),
				cadBruna.getRm(),
				cadBruna.getAltura(),
				cadBruna.getMateriaFavorita());
		
		String bruna = cadBruna.retornarCadastro();
		System.out.println(bruna);
	}
		
}