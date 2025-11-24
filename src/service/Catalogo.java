package service;

import java.util.ArrayList;

import model.Game;
import view.Atendente;

public class Catalogo {
	ArrayList<Game> listaJogos;
	
	public Catalogo() {
		listaJogos = new ArrayList<Game>();
	}
	
	public void gerenciarCatalogo(int opcao, Atendente atendente) {
		switch(opcao) {
			case 1 -> {
				String titulo = atendente.tituloJogo();
				String plataforma = atendente.plataformaJogo();
				String faixa_etaria = atendente.classificacao_etariaJogo();
				double preco = atendente.precoJogo();
				
				Game game = new Game(titulo, plataforma, faixa_etaria, preco);
				listaJogos.add(game);
			}
			case 2 -> {
				for (Game game : listaJogos) {
					atendente.vizualizar(game);
				}
			}
			case 3 -> {
				String titulo = atendente.removerJogo();
				boolean removido = false;
				
				for (int i = 0; i < listaJogos.size(); i++) {
					if (listaJogos.get(i).getTitulo().equalsIgnoreCase(titulo)){
						listaJogos.remove(i);
						removido = true;
					}
				}
				
				if (removido) {
					atendente.mensagemJogoRemovido(titulo);
				} else {
					atendente.mensagemNaoEncontrado();
				}
			}
			case 4 -> {
				String titulo = atendente.buscarJogo();
				boolean encontrar = false;
				
				for (Game game : listaJogos) {
					if (game.getTitulo().equalsIgnoreCase(titulo)) {
						atendente.mensagemJogoEncontrado(titulo);
						encontrar = true;
					}
				}
				
				if (!encontrar) {
					atendente.mensagemNaoEncontrado();
				}
			}
		}
	}
}
