package view;

import bean.Cadastro;

public class CadastroGabriel {
	
	public static void main(String[] args) {
		
		Cadastro cadGabriel =  new Cadastro();
		
		cadGabriel.setNome("Gabriel");
		cadGabriel.setSobrenome("Andrade");
		cadGabriel.setIdade(20);
		cadGabriel.setRm(87564);
		cadGabriel.setAltura((float)1.83);
		cadGabriel.setMateriaFavorita("Computal Thinking Using Python");
		
		cadGabriel.setarCadastro(cadGabriel.getNome(),
				cadGabriel.getSobrenome(),
				cadGabriel.getIdade(),
				cadGabriel.getRm(),
				cadGabriel.getAltura(),
				cadGabriel.getMateriaFavorita());
		
		String gabriel = cadGabriel.retornarCadastro();
		System.out.println(gabriel);
	}	
}