package br.edu.univas.vo;

import java.util.Objects;

public class Player extends Titulo{
	
	private String nome;
    private String url;
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nome, url);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(url, other.url);
	}
	
    
	

}
