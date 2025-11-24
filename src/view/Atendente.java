package view;

import java.util.Scanner;

import model.Game;

public class Atendente {
	Scanner scanf;
	
	public Atendente() {
		scanf = new Scanner(System.in);
	}
	
	public int menuPrincipal() {
		System.out.println("+----------------------------+");
		System.out.println("|     OPÇÕES DISPONÍVEIS     |");
		System.out.println("+----------------------------+");
		System.out.println("| 1 - Cadastrar Jogo         |");
		System.out.println("| 2 - Listar Jogos           |");
		System.out.println("| 3 - Remover Jogo           |");
		System.out.println("| 4 - Buscar Jogo            |");
		System.out.println("| 0 - Sair                   |");
		System.out.println("+----------------------------+");
		System.out.print("Insira o comando: ");
		int opcao = scanf.nextInt();
		scanf.nextLine();
		return opcao;
	}
	
	public void vizualizar(Game game) {
		System.out.println("+---------------------*");
		System.out.println("| Título: " + game.getTitulo());
		System.out.println("| Plataforma: " + game.getPlataforma());
		System.out.println("| Classificação: " + game.getClassificacao_etaria());
		System.out.println("| Preço: " + game.getPreco());
	}
	
	public String tituloJogo() {
		System.out.print("\nDigite o título do jogo: ");
		return scanf.nextLine();
	}
	
	public String plataformaJogo() {
		System.out.print("\nDigite a plataforma do jogo: ");
		return scanf.nextLine();
	}
	
	public String classificacao_etariaJogo() {
		System.out.print("\nInforme a faixa etária do jogo: ");
		return scanf.nextLine();
	}
	
	public double precoJogo() {
		System.out.print("\nInforme o preço do jogo: ");
		return scanf.nextDouble();
	}
	
	public String removerJogo() {
		System.out.println("+------------------------+");
		System.out.println("|      REMOVER JOGO      |");
		System.out.println("+------------------------+");
		System.out.print("Digite o título do jogo que deseja remover: ");
		return scanf.nextLine();
	}
	
	public void mensagemJogoRemovido(String titulo) {
		System.out.println("\nO jogo '" + titulo + "' foi removido.");
	}
	
	public void mensagemNaoEncontrado() {
		System.out.println("\nJogo não encontrado.");
	}
	
	public String buscarJogo() {
		System.out.println("+----------------------+");
		System.out.println("|     BUSCAR JOGO      |");
		System.out.println("+----------------------+");
		System.out.print("Digite o título do jogo que deseja buscar: ");
		return scanf.nextLine();
	}
	
	public void mensagemJogoEncontrado(String titulo) {
		System.out.println("\nO jogo '" + titulo + "' foi encontrado.");
	}
	
	public void saindoDoSistema() {
		System.out.println("\nSaindo do sistema\n\nAté mais...");
	}
}
