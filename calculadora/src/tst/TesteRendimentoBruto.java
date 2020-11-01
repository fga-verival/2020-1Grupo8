package tst;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import calculadora.Calculadora;

@RunWith(Parameterized.class)
public class TesteRendimentoBruto {
	
	private Integer qtdDias;
	private Float aplicacaoInicial;
	private Float taxaJurosAnual;
	private Float aliquota;
	private Float resultadoEsperado;
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {     
			{60,1000f,8.5f, 22.5f,13.97f},
			{270,2000f,8.5f, 20.0f, 125.75f},
		    {1000, 100.00f, 7.5f, 15.0f, 20.55f}
		 });
	}
	 
	private int a;
	private float b;
	private float c;
	private float d;
	private float e;

	public TesteRendimentoBruto(int a, float b, float c ,float d, float e) {
	   this.qtdDias = a;
	   this.aplicacaoInicial = b;
	   this.taxaJurosAnual = c;
	   this.aliquota = d;
	   this.resultadoEsperado = e;
	 }

	/*@SuppressWarnings("deprecation")
	@Test
	public void testeRendimentoBruto1() {
		Calculadora calculadora = new Calculadora(60,1000.00f,8.5f,22.5f);
		assertEquals(13.97f, calculadora.getRendimentoBruto(), 0.01f);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testeRendimentoBruto2() {
		Calculadora calculadora = new Calculadora(240,3000.00f,9.0f,20.0f);
		assertEquals(177.53f, calculadora.getRendimentoBruto(), 0.01f);
	}*/
	
	@SuppressWarnings("deprecation")
	@Test
	public void testeRendimentoBruto3() {
		Calculadora calculadora = new Calculadora(qtdDias,aplicacaoInicial,taxaJurosAnual,aliquota);
		assertEquals(resultadoEsperado, calculadora.getRendimentoBruto(), 0.01f);
	}

}
