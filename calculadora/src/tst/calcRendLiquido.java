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

	@Test
	public void rendimentoLiquido2() {
		calc = new Calculadora(120, 500.00f, 8.0f, 22.5f);
		//System.out.printf("%.4f", calc.getRendimentoLiquido());
		assertEquals(2.0384f, calc.getRendimentoLiquido(), 0);
	}
	
	@Test
	public void rendimentoLiquido3() {
		calc = new Calculadora(900, 4200.00f, 9.5f, 15.0f);
		//System.out.printf("%.4f", calc.getRendimentoLiquido());
		assertEquals(19.9110f, calc.getRendimentoLiquido(), 0);
	}
