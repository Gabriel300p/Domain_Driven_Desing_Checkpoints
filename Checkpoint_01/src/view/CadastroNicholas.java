package view;

import bean.Cadastro;

public class CadastroNicholas {
	
	public static void main(String[] args) {
		
		Cadastro cadNicholas =  new Cadastro();
		
		cadNicholas.setNome("Nicholas");
		cadNicholas.setSobrenome("Ghendov");
		cadNicholas.setIdade(17);
		cadNicholas.setRm(89239);
		cadNicholas.setAltura((float)2.04);
		cadNicholas.setMateriaFavorita("Responsive Web Development");
		
		cadNicholas.setarCadastro(cadNicholas.getNome(),
				cadNicholas.getSobrenome(),
				cadNicholas.getIdade(),
				cadNicholas.getRm(),
				cadNicholas.getAltura(),
				cadNicholas.getMateriaFavorita());
		
		String nicholas = cadNicholas.retornarCadastro();
		System.out.println(nicholas);
	}
		
}