package br.com.ciandt.enovais.calculo;

import org.junit.Assert;
import org.junit.Test;

public class DivisaoTest {
	
	@Test
	public void calcularDivisaoQuandoDivisorForZeroTest() {
		
		Divisao divisao = new Divisao();
		
		Double resultado = divisao.calcular(12, 0);
		
		Assert.assertEquals(0d, resultado.doubleValue(), 0.1);
		
	}

	@Test
	public void calcularDivisaoQuandoDivisorNaoForZeroTest() {
		
		Divisao divisao = new Divisao();
		
		Double resultado = divisao.calcular(12, 2);
		
		Assert.assertEquals(6d, resultado.doubleValue(), 0.1);
		
	}
	
}
