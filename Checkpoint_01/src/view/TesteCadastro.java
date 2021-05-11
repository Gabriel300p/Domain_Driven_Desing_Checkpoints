package view;

import java.util.Scanner;

import bean.Cadastro;

public class TesteCadastro {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Cadastro cad =  new Cadastro();
		
		System.out.println("Qual seu nome? ");
		cad.setNome(leitor.next() + leitor.nextLine());
		
		System.out.println("Qual seu sobrenome? ");
		cad.setSobrenome(leitor.next() + leitor.nextLine());
		
		System.out.println("Qual sua idade? ");
		cad.setIdade(leitor.nextInt());
		
		System.out.println("Qual seu Rm? ");
		cad.setRm(leitor.nextInt());
		
		System.out.println("Qual sua altura? ");
		cad.setAltura(leitor.nextFloat());
		
		System.out.println("Qual sua Máteria Favorita? ");
		cad.setMateriaFavorita(leitor.next() + leitor.nextLine());
		
		String cadastro = cad.retornarCadastro();
		System.out.println(cadastro);

		leitor.close();
	}
		
}
