package view;

import java.util.Scanner;

import bean.*;

public class Teste {

    public static void main (String [] args) {
    	
    	Scanner leitor = new Scanner(System.in);
    	
    	//Inicio teste Cadastro
    	Cadastro testeCadastro = new Cadastro();
        
        System.out.println("--- Cadastro ---");
        
        System.out.print("Qual o nome? ");
        testeCadastro.setNome(leitor.next() + leitor.nextLine());

        System.out.print("Qual o código? ");
        testeCadastro.setCodigo(leitor.nextInt());

        System.out.print("Qual a data de nascimento? ");
        testeCadastro.setDataNascimento(leitor.next() + leitor.nextLine());
        
        System.out.print("Qual a senha? ");
        testeCadastro.setSenha(leitor.next() + leitor.nextLine());
        
        System.out.print("Qual a profissão? ");
        testeCadastro.setProfissao(leitor.next() + leitor.nextLine());
        
        System.out.print("O login esta ativo ou inativo (True/False)? ");
        testeCadastro.setEstadoLogin(leitor.nextBoolean());
        
        System.out.print("Qual foi a data do cadastro? ");
        testeCadastro.setDataCadastro(leitor.next() + leitor.nextLine());

        String Cadastro = testeCadastro.retornarCadastro();
        System.out.println(Cadastro);
        //Final teste Cadastro
    	
    	//inicio Teste Avatar
        Avatar testeAvatar = new Avatar();
        
        System.out.print("\n \n --- Avatar ---");

        testeAvatar.setNome(testeCadastro.getNome());

        System.out.print("\n\n Qual a pontuação? ");
        testeAvatar.setPontuacao(leitor.nextFloat());

        System.out.print("Qual a cor da camisa usada? ");
        testeAvatar.setCamisa(leitor.next() + leitor.nextLine());

        System.out.print("Qual o tipo de calça usada? ");
        testeAvatar.setCalca(leitor.next() + leitor.nextLine());

        System.out.print("Qual a marca do tênis usado? ");
        testeAvatar.setTenis(leitor.next() + leitor.nextLine());

        System.out.print("Qual o tipo de boné usado? ");
        testeAvatar.setBone(leitor.next() + leitor.nextLine());

        System.out.print("Qual o pet? ");
        testeAvatar.setPet(leitor.next() + leitor.nextLine()); 

        String Avatar = testeAvatar.retornarAvatar();
        System.out.println(Avatar);
        //Final Teste Avatar
        
        
        //inicio Teste Usuario
        Usuario testeUsuario = new Usuario();
        
        testeUsuario.setNome(testeCadastro.getNome());
        testeUsuario.setCodigo(testeCadastro.getCodigo());
        testeUsuario.setDataNascimento(testeCadastro.getDataNascimento());
        testeUsuario.setProfissao(testeCadastro.getProfissao());
       
        String Usuario = testeUsuario.retornarUsuario();
        System.out.println(Usuario);
        //Final Teste Usuario
        
        //inicio Teste Exercicios
        System.out.println("\n \n --- Exercícios ---");
        
        Exercicios testeExercicios = new Exercicios();
        
        System.out.print("Qual o nome do exercício? ");
        testeExercicios.setNome(leitor.next() + leitor.nextLine());

        System.out.print("Qual a descrição do exercício? ");
        testeExercicios.setDescricao(leitor.next() + leitor.nextLine());

        System.out.print("Qual a pontuação? ");
        testeExercicios.setPontuacao(leitor.nextFloat());

        String Exercicio = testeExercicios.retornarExercicios();
        System.out.println(Exercicio);
        //Final Teste Exercicios
        
        
        //Inicio Teste Eventos
        System.out.println("\n \n --- Eventos ---");
        
        Eventos testeEventos = new Eventos();
        
        System.out.print("Qual a estação do Evento? ");
        testeEventos.setTipo(leitor.next() + leitor.nextLine());

        System.out.print("Qual a data do evento? ");
        testeEventos.setData(leitor.next() + leitor.nextLine());

        System.out.print("Qual o cosmeticos adicionado? ");
        testeEventos.setCosmeticos(leitor.next() + leitor.nextLine());

        String Eventos = testeEventos.retornarEventos();
        System.out.println(Eventos);
        //Final Teste Eventos
        
        
        //Inicio Teste Questionario
        System.out.println("\n \n --- Questionário ---");
        
        Questionario testeQuestionario = new Questionario();
        
        System.out.print("Qual o nome do questionário? ");
        testeQuestionario.setNome(leitor.next() + leitor.nextLine());

        System.out.print("Qual a quantidade de questões? ");
        testeQuestionario.setQuantidadeQuestoes(leitor.nextInt());

        System.out.print("Qual o tema? ");
        testeQuestionario.setTemaQuestoes(leitor.next() + leitor.nextLine());
        
        System.out.print("Digite uma questão: ");
        testeQuestionario.setQuestoes(leitor.next() + leitor.nextLine());

        String Questionario = testeQuestionario.retornarQuestionario();
        System.out.println(Questionario);
        //Final Teste Questionario
        
        
        //Inicio Teste Chatbot
        System.out.println("\n \n --- Chatbot ---");
        
        Chatbot testeChatbot = new Chatbot();
        
        System.out.print("Qual o nome do bot? ");
        testeChatbot.setNome(leitor.next() + leitor.nextLine());
        
        System.out.print("Digite uma pergunta para o bot: ");
        testeChatbot.setArvoreDialogo(leitor.next() + leitor.nextLine());
        
        String Chatbot = testeChatbot.retornarChatbot();
        System.out.println(Chatbot);
        //Final Teste Chatbot

        leitor.close();
    }

}