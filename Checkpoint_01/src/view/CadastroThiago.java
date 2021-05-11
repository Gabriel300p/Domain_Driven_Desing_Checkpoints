package view;

import bean.Cadastro;

public class CadastroThiago {
	
	public static void main(String[] args) {
		
		Cadastro cadThiago =  new Cadastro();
		
		cadThiago.setNome("Thiago");
		cadThiago.setSobrenome("Enninger");
		cadThiago.setIdade(28);
		cadThiago.setRm(86664);
		cadThiago.setAltura((float)1.75);
		cadThiago.setMateriaFavorita("Responsive Web Development");
		
		cadThiago.setarCadastro(cadThiago.getNome(),
				cadThiago.getSobrenome(),
				cadThiago.getIdade(),
				cadThiago.getRm(),
				cadThiago.getAltura(),
				cadThiago.getMateriaFavorita());
		
		String thiago = cadThiago.retornarCadastro();
		System.out.println(thiago);
		
	}
		
}