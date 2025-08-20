package principal;

import java.util.Scanner;

import controllers.PessoaController;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("(1) Cadastrar pessoa");
		System.out.println("(2) Atualizar pessoa");
		System.out.println("(3) Excluir pessoa");
		System.out.println("(4) COnsultar pessoas");
		
		System.out.print("\nInforme a opção desejada: ");
		var opcao = scanner.nextLine();
		
		var pessoaController = new PessoaController();
		
		switch(opcao) {
		case "1": pessoaController.cadastrarPessoa(); break;
		case "2": pessoaController.atualizarPessoa(); break;
		case "3": pessoaController.excluirPessoa();break;
		case "4": pessoaController.consultar(); break;
		}
	}

}
