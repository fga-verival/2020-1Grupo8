package tst;

import static org.junit.Assert.*;

import org.junit.Test;

import calculadora.Calculadora;

public class TesteRendimentoBruto {

	@SuppressWarnings("deprecation")
	@Test
	public void testeRendimentoBruto() {
		Calculadora calculadora = new Calculadora(240,3000.00f,9.0f,20.0f);
		assertEquals(177.53f, calculadora.getRendimentoBruto(), 0.01f);
	}

}
