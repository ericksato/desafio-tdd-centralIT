package br.com.teste.desafio;

import java.util.List;

public class Compra {
	
	private List<Item> listaItem;
	private Cliente cliente;
	private double valorTotalCompra;
	
	
	public Compra(Cliente cliente, List<Item> listaItem) {
		this.listaItem = listaItem;
		this.cliente = cliente;
	}
	
	public List<Item> getListaItem() {
		return listaItem;
	}
	public void setListaItem(List<Item> listaItem) {
		this.listaItem = listaItem;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	public double getValorTotalCompra() {
		this.valorTotalCompra = 0;
		for (Item item : listaItem) {
			this.valorTotalCompra +=item.getValor();
		}
		return valorTotalCompra;
	}

}
