package br.com.teste.desafio;

public class Cliente {
	
	private String nome;
	private String estado;
	
	
	public Cliente(String nome, String estado) {
		this.nome = nome;
		this.estado = estado;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

}
