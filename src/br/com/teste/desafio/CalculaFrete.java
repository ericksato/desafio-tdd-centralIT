package br.com.teste.desafio;

public class CalculaFrete {

	public double calculaFrete(Compra compra) {
		if(compra.getCliente().getEstado().equals("SP")){
			if (compra.getListaItem().size() <= 3) return 10d;
			if (compra.getListaItem().size() > 3) return 17d;
		}
		else if(compra.getCliente().getEstado().equals("RJ")){
			if (compra.getListaItem().size() <= 4) return 11d;
			if (compra.getListaItem().size() > 4) return 15d;
		}
		else if(compra.getCliente().getEstado().equals("SC") || 
				compra.getCliente().getEstado().equals("PR") ||
				compra.getCliente().getEstado().equals("RS")){
			return 22d;
		}
		return 25;
	}

}
