package tst;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteRendimentoBruto {

	@SuppressWarnings("deprecation")
	@Test
	public void testeRendimentoBruto() {
		Calculadora calculadora = new Calculadora(60,1000.00f,8.5f,22.5f);
		assertEquals(13.97f, calculadora.getRendimentoBruto());
		fail("Not yet implemented");
	}

}
