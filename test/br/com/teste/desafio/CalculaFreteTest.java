package br.com.teste.desafio;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculaFreteTest {
	
	private CalculaFrete calculaFrete;
	
	@Before
	public void setUp(){
		calculaFrete = new CalculaFrete();
	}
	
	@Test
	public void calculaFreteSP3Itens(){
		List<Item> listaItem = new ArrayList<Item>();
		
		listaItem.addAll(new ItemBuilder()
				.cria("Item 1", 10d, 1)
				.cria("Item 2", 10d, 1)
				.cria("Item 3", 10d, 1)
				.create());
		
		Cliente cliente = new Cliente("Erick", "SP");
		Compra compra = new Compra(cliente, listaItem);
		
		double valorFrete = calculaFrete.calculaFrete(compra);
		
		assertEquals(10, valorFrete, 0.001);
	}
	
	@Test
	public void calculaFreteSPMaisDe3Itens(){
		List<Item> listaItem = new ArrayList<Item>();
		
		listaItem.addAll(new ItemBuilder()
				.cria("Item 1", 10d, 1)
				.cria("Item 2", 10d, 1)
				.cria("Item 3", 10d, 1)
				.cria("Item 4", 10d, 1)
				.create());
		
		Cliente cliente = new Cliente("Erick", "SP");
		Compra compra = new Compra(cliente, listaItem);
		
		double valorFrete = calculaFrete.calculaFrete(compra);
		
		assertEquals(17, valorFrete, 0.001);
	}
	
	@Test
	public void calculaFreteRJAte4Itens(){
		List<Item> listaItem = new ArrayList<Item>();
		
		listaItem.addAll(new ItemBuilder()
				.cria("Item 1", 10d, 1)
				.cria("Item 2", 10d, 1)
				.cria("Item 3", 10d, 1)
				.cria("Item 4", 10d, 1)
				.create());
		
		Cliente cliente = new Cliente("Erick", "RJ");
		Compra compra = new Compra(cliente, listaItem);
		
		double valorFrete = calculaFrete.calculaFrete(compra);
		
		assertEquals(11, valorFrete, 0.001);
	}
	
	@Test
	public void calculaFreteRJMais4Itens(){
		List<Item> listaItem = new ArrayList<Item>();
		
		listaItem.addAll(new ItemBuilder()
				.cria("Item 1", 10d, 1)
				.cria("Item 2", 10d, 1)
				.cria("Item 3", 10d, 1)
				.cria("Item 4", 10d, 1)
				.cria("Item 5", 10d, 1)
				.create());
		
		Cliente cliente = new Cliente("Erick", "RJ");
		Compra compra = new Compra(cliente, listaItem);
		
		double valorFrete = calculaFrete.calculaFrete(compra);
		
		assertEquals(15, valorFrete, 0.001);
	}
	
	@Test
	public void calculaFreteRegiaoSul(){
		List<Item> listaItem = new ArrayList<Item>();
		
		listaItem.addAll(new ItemBuilder()
				.cria("Item 1", 10d, 1)
				.cria("Item 2", 10d, 1)
				.cria("Item 3", 10d, 1)
				.cria("Item 4", 10d, 1)
				.cria("Item 5", 10d, 1)
				.create());
		
		Cliente cliente = new Cliente("Erick", "SC");
		Compra compra = new Compra(cliente, listaItem);
		
		double valorFrete = calculaFrete.calculaFrete(compra);
		
		assertEquals(22, valorFrete, 0.001);
	}
	
	@Test
	public void calculaFreteDemaisRegiao(){
		List<Item> listaItem = new ArrayList<Item>();
		
		listaItem.addAll(new ItemBuilder()
				.cria("Item 1", 10d, 1)
				.cria("Item 2", 10d, 1)
				.cria("Item 3", 10d, 1)
				.cria("Item 4", 10d, 1)
				.cria("Item 5", 10d, 1)
				.create());
		
		Cliente cliente = new Cliente("Erick", "GO");
		Compra compra = new Compra(cliente, listaItem);
		
		double valorFrete = calculaFrete.calculaFrete(compra);
		
		assertEquals(25, valorFrete, 0.001);
	}
	

}
