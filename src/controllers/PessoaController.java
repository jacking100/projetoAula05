package controllers;

import java.util.Scanner;

import entities.Pessoa;
import repositories.PessoaRepository;

public class PessoaController {
	
	private PessoaRepository pessoaRepository = new PessoaRepository();
	
	private Scanner scanner = new Scanner(System.in);
	
	public void cadastrarPessoa() {
		
		try {
			
			System.out.println("\nCadastro de pessoa:\n");
			
			var pessoa = new Pessoa();
			
			System.out.print("Informe o nome......: ");
			pessoa.setNome(scanner.nextLine());
			
			System.out.println("Informe o cpf.....: ");
			pessoa.setCpf(scanner.nextLine());
			
			pessoaRepository.inserir(pessoa);
			
			System.out.println("\nPessoa cadastrado com sucesso!");
			
		}
		catch(Exception e) {
			System.out.println("\nErro: " + e.getMessage());
		}
	}
	
	public void atualizarPessoa() {
		try {
			
			System.out.println("\nAtualização de pessoa:\n");
			
			var pessoa = new Pessoa();
			
			System.out.print("Informe o id.........: ");
			pessoa.setId(Integer.parseInt(scanner.nextLine()));
			
			System.out.print("Informe o nome.....: ");
			pessoa.setNome(scanner.nextLine());
			
			System.out.print("Informe o cpf......: ");
			pessoa.setCpf(scanner.nextLine());
			
			if(pessoaRepository.atualizar(pessoa)) {
				System.out.println("\nPessoa atualizado com secesso!");
			}
			else {
				System.out.println("\nNenhum registro foi atualizado. Verifique o Id informado!");
			}
		}
		catch(Exception e) {
			System.out.println("\nErro: " + e.getMessage());
		}
		
	}
	
	public void excluirPessoa() {
		
		try {
			
			System.out.println("\nExclusão de pessoa:\n");
			
			System.out.println("Informe o id.........: ");
			var id = Integer.parseInt(scanner.nextLine());
			
			if(pessoaRepository.excluir(id)) {
				System.out.println("\nPessoa excluido com sucesso!");
			}
			else {
				System.out.println("\nNenhum registro foi excluído. Verifique o Id informado!");
			}
			
		}
		catch(Exception e) {
			System.out.println("\nErro: " + e.getMessage());
		}
	}
	
	public void consultar() {
		
		try {
			
			System.out.println("\nConsulta de pessoas:\n");
			
			var lista = pessoaRepository.consultar();
			
			for(var pessoa : lista) {
				System.out.println("Id.......: " + pessoa.getId());
				System.out.println("Nome.....: " + pessoa.getNome());
				System.out.println("Cpf......: " + pessoa.getCpf());
				System.out.println("...");
			}
			
		}
		catch(Exception e) {
			System.out.println("\nErro: " + e.getMessage());
		}
	}

}
