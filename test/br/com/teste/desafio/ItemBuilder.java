package br.com.teste.desafio;

import java.util.ArrayList;
import java.util.List;

public class ItemBuilder {

	private List<Item> lista = new ArrayList<Item>();

	public ItemBuilder cria(String nomeItem, double valor, int qtd) {
		lista.add(new Item(nomeItem, valor, qtd));
		return this;
	}

	public List<Item> create() {
		return lista;
	}

}
