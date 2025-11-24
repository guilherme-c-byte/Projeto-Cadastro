package model;

public class Game {
	private String titulo;
	private String plataforma;
	private String classificacao_etaria;
	private double preco;
	
	public Game() {
		this.titulo = "";
		this.plataforma = "";
		this.classificacao_etaria = "";
		this.preco = 0.0;
	}
	
	public Game(String titulo, String plataforma, String classificacao_etaria, double preco) {
		this.titulo = titulo;
		this.plataforma = plataforma;
		this.classificacao_etaria = classificacao_etaria;
		this.preco = preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getClassificacao_etaria() {
		return classificacao_etaria;
	}

	public void setClassificacao_etaria(String classificacao_etaria) {
		this.classificacao_etaria = classificacao_etaria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
