package br.com.teste.desafio;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ValorFinalCompraTest {
	
	private CalculoFinalCompra calculoFinalCompra;
	
	@Before
	public void setUp(){
		calculoFinalCompra = new CalculoFinalCompra();
	}
	
	@Test
	public void calculaValorFinalSpAte3Itens(){
		List<Item> listaItem = new ArrayList<Item>();
		listaItem.addAll(new ItemBuilder()
				.cria("Item 1", 10d, 1)
				.cria("Item 2", 10d, 1)
				.cria("Item 3", 10d, 1)
				.create());
		
		Cliente cliente = new Cliente("Erick", "SP");
		Compra compra = new Compra(cliente, listaItem);
		
		double valorFinal = calculoFinalCompra.totalFinal(compra);
		
		assertEquals(38.5, valorFinal, 0.001);
	}
	
	@Test
	public void calculaValorFinalSp4Itens(){
		List<Item> listaItem = new ArrayList<Item>();
		listaItem.addAll(new ItemBuilder()
				.cria("Item 1", 35d, 1)
				.cria("Item 2", 150d, 1)
				.cria("Item 3", 112d, 1)
				.cria("Item 4", 254d, 1) 
				.create());
		
		Cliente cliente = new Cliente("Erick", "SP");
		Compra compra = new Compra(cliente, listaItem);
		double valorFinal = calculoFinalCompra.totalFinal(compra);
		
		assertEquals(512.9, valorFinal, 0.001);
	}
	
	@Test
	public void calculaValorFinalRJAte4Itens(){
		List<Item> listaItem = new ArrayList<Item>();
		listaItem.addAll(new ItemBuilder()
				.cria("Item 1", 35d, 1)
				.cria("Item 2", 150d, 1)
				.cria("Item 3", 112d, 1)
				.cria("Item 4", 254d, 1) 
				.create());
		
		Cliente cliente = new Cliente("Erick", "RJ");
		Compra compra = new Compra(cliente, listaItem);
		double valorFinal = calculoFinalCompra.totalFinal(compra);
		
		assertEquals(506.9, valorFinal, 0.001);
	}
	
	@Test
	public void calculaValorFinalRJMais4Itens(){
		List<Item> listaItem = new ArrayList<Item>();
		listaItem.addAll(new ItemBuilder()
				.cria("Item 1", 35d, 1)
				.cria("Item 2", 150d, 1)
				.cria("Item 3", 12d, 1)
				.cria("Item 4", 25d, 1) 
				.cria("Item 5", 14d, 1) 
				.create());
		
		Cliente cliente = new Cliente("Erick", "RJ");
		Compra compra = new Compra(cliente, listaItem);
		double valorFinal = calculoFinalCompra.totalFinal(compra);
		
		assertEquals(239.2, valorFinal, 0.001);
	}
	
	@Test
	public void calculaValorFinalRegiaoSul(){
		List<Item> listaItem = new ArrayList<Item>();
		listaItem.addAll(new ItemBuilder()
				.cria("Item 1", 3500d, 1)
				.cria("Item 2", 150d, 1)
				.cria("Item 3", 12d, 1)
				.cria("Item 4", 25d, 1) 
				.cria("Item 5", 14d, 1) 
				.create());
		
		Cliente cliente = new Cliente("Erick", "SC");
		Compra compra = new Compra(cliente, listaItem);
		double valorFinal = calculoFinalCompra.totalFinal(compra);
		
		assertEquals(3167.85, valorFinal, 0.001);
	}
	
	@Test
	public void calculaValorFinalRestantePais(){
		List<Item> listaItem = new ArrayList<Item>();
		listaItem.addAll(new ItemBuilder()
				.cria("Item 1", 3500d, 1)
				.cria("Item 2", 150d, 1)
				.cria("Item 3", 12d, 1)
				.cria("Item 4", 25d, 1) 
				.cria("Item 5", 14d, 1) 
				.create());
		
		Cliente cliente = new Cliente("Erick", "GO");
		Compra compra = new Compra(cliente, listaItem);
		double valorFinal = calculoFinalCompra.totalFinal(compra);
		
		assertEquals(3170.85, valorFinal, 0.001);
	}

}
