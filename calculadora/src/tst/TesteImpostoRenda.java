package tst;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import calculadora.Calculadora;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TesteImpostoRenda {
	
	private Calculadora imposto;
	
    private Integer qtdDias;
    private Float aplicacaoInicial;
    private Float taxaJurosAnual;
    private Float aliquota;
    private Float resEsperado;
    @Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {     
			{60, 1000f, 8.5f, 22.5f, 3.14f},
			{120, 500.0f, 8.0f, 22.5f, 2.96f},
			{270, 2000f, 8.5f, 20.0f, 25.15f},
			{700, 2500f, 9.0f, 17.5f, 75.51f},
		    {1000, 100.00f, 7.5f, 15.0f, 3.08f}
		 });
	}
	
	private int dias;
	private float aplicacao;
	private float juros;
	private float ali;
	private float esperado;
	
	public TesteImpostoRenda(int dias, float aplicacao, float juros, float ali, float esperado) {
		this.qtdDias = dias;
		this.aplicacaoInicial = aplicacao;
		this.taxaJurosAnual = juros;
		this.aliquota = ali;
		this.resEsperado = esperado;
	} 
	
//	@Test
//	public void testeImpostoRenda() {
//		Calculadora imposto  = new Calculadora(240,3000.00f,9.0f,20.0f);
//		assertEquals(35.51f, imposto.getImpostoRenda(),0.1f);
//	}
//	
//	@Test
//	public void testeImpostoRenda2(){
//		Calculadora imposto = new Calculadora(550,400.00f,8.0f,17.5f); 
//		assertEquals(8.44f, imposto.getImpostoRenda(),0.1f);
//	}
	@Test
	public void testeImpostoRenda3(){
		Calculadora imposto = new Calculadora(qtdDias,aplicacaoInicial,taxaJurosAnual,aliquota); 
		assertEquals(resEsperado, imposto.getImpostoRenda(),0.1f);
	}
	
}
