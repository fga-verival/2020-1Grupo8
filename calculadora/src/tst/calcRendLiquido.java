package tst;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import calculadora.Calculadora;

public class calcRendLiquido {
	private Calculadora calc;
	
	@Test
	public void rendimentoLiquido() {
		calc = new Calculadora(60, 1000.00f, 8.5f, 22.5f);
		//System.out.printf("%.4f", calc.getRendimentoLiquido());
		assertEquals(1.0829f, calc.getRendimentoLiquido(), 0);
	}

}