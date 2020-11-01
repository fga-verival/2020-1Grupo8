package tst;

import static org.junit.Assert.*;

import calculadora.Calculadora;

import org.junit.Test;

public class TesteImpostoRenda {
	
	private Calculadora imposto;
	@Test
	public void testeImpostoRenda() {
		Calculadora imposto  = new Calculadora(240,3000.00f,9.0f,20.0f);
		assertEquals(35.51f, imposto.getImpostoRenda(),0.1f);
	}

}
