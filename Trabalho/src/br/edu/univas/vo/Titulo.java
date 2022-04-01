package br.edu.univas.vo;

import java.util.ArrayList;

public class Titulo {
	
	private String tipo;
	private String titulo;
	private String elenco;
	private String descricao;
	private String genero;
	private String diretor;
	private int classificacao;
	private ArrayList<String> plataforma;
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getElenco() {
		return elenco;
	}

	public void setElenco(String elenco) {
		this.elenco = elenco;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getDiretor() {
		return diretor;
	}
	
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	public int getClassificacao() {
		return classificacao;
	}
	
	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}
	
	public ArrayList<String> getPlataforma() {
		return plataforma;
	}
	
	public void setPlataforma(ArrayList<String> plataforma) {
		this.plataforma = plataforma;
	}

	

	
}
