package br.com.teste.desafio;

public class Item {
	
	private String nomeItem;
	private double valor;
	private int qtd;

	public Item(String nomeItem, double valor, int qtd) {
		this.nomeItem = nomeItem;
		this.valor = valor;
		this.qtd = qtd;
		
	}

	public String getNomeItem() {
		return nomeItem;
	}

	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
}
