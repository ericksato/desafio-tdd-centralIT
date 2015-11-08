package br.com.teste.desafio;

public class DescontoCompra {

	public double calculaDesconto(Compra compra) {
		
		if(compra.getValorTotalCompra() <= 500) return compra.getValorTotalCompra() * 0.05;
		if(compra.getValorTotalCompra() > 500 && compra.getValorTotalCompra() <= 2000) return compra.getValorTotalCompra() * 0.1;
		
		return compra.getValorTotalCompra() * 0.15;
	}
	
	

}
