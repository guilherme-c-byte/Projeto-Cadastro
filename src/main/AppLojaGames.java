package main;

import service.Catalogo;
import view.Atendente;

public class AppLojaGames {

	public static void main(String[] args) {
		Atendente atendente = new Atendente();
		Catalogo catalogo = new Catalogo();
		
		int opcaoEscolhida = 1;
		
		do {
			opcaoEscolhida = atendente.menuPrincipal();
			catalogo.gerenciarCatalogo(opcaoEscolhida, atendente);
		} while (opcaoEscolhida != 0);
		
		atendente.saindoDoSistema();
	}

}
