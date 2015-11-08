package br.com.teste.desafio;

public class CalculoFinalCompra {

	public double totalFinal(Compra compra) {
		CalculaFrete calculaFrete = new CalculaFrete();
		DescontoCompra descontoCompra = new DescontoCompra();
		return compra.getValorTotalCompra()  + calculaFrete.calculaFrete(compra) - descontoCompra.calculaDesconto(compra);
	}
	
	

}
