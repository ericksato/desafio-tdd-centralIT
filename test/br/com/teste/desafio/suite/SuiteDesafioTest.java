package br.com.teste.desafio.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import br.com.teste.desafio.CalculaFreteTest;
import br.com.teste.desafio.DescontoDesafioTest;
import br.com.teste.desafio.ValorFinalCompraTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
   CalculaFreteTest.class,
   DescontoDesafioTest.class,
   ValorFinalCompraTest.class
})

public class SuiteDesafioTest{
	
}

