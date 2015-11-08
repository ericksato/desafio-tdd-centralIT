package br.com.teste.desafio;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class DescontoDesafioTest {
	
	private DescontoCompra descontoCompra;
	
	@Before
	public void setUp(){
		descontoCompra = new DescontoCompra();
	}
	
	@Test
	public void descontoCompraMenor500(){
		List<Item> listaItem = new ArrayList<Item>();
		
		listaItem.addAll(new ItemBuilder()
				.cria("Item 1", 10d, 1)
				.cria("Item 2", 10d, 1)
				.cria("Item 3", 10d, 1)
				.create());
		
		Cliente cliente = new Cliente("Erick", "SP");
		Compra compra = new Compra(cliente, listaItem);
		
		double valorDesconto = descontoCompra.calculaDesconto(compra);
		
		assertEquals(1.5, valorDesconto, 0.001);
	}
	
	@Test
	public void descontoCompraEntre501a2000(){
		List<Item> listaItem = new ArrayList<Item>();
		
		listaItem.addAll(new ItemBuilder()
				.cria("Item 1", 500d, 1)
				.cria("Item 2", 400d, 1)
				.cria("Item 3", 200d, 1)
				.create());
		
		Cliente cliente = new Cliente("Erick", "SP");
		Compra compra = new Compra(cliente, listaItem);
		
		double valorDesconto = descontoCompra.calculaDesconto(compra);
		
		assertEquals(110, valorDesconto, 0.001);
	}
	
	@Test
	public void descontoCompraAcima2000(){
		List<Item> listaItem = new ArrayList<Item>();
		
		listaItem.addAll(new ItemBuilder()
				.cria("Item 1", 500d, 1)
				.cria("Item 2", 1700d, 1)
				.cria("Item 3", 500d, 1)
				.create());
		
		Cliente cliente = new Cliente("Erick", "SP");
		Compra compra = new Compra(cliente, listaItem);
		
		double valorDesconto = descontoCompra.calculaDesconto(compra);
		
		assertEquals(405, valorDesconto, 0.001);
	}

}
