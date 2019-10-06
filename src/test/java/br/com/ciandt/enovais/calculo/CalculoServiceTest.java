package br.com.ciandt.enovais.calculo;

import org.junit.Assert;
import org.junit.Test;

import br.com.ciandt.enovais.service.CalculoService;

public class CalculoServiceTest {
	
	@Test
	public void somarTest() {
		CalculoService calc = new CalculoService();
		double resultado = calc.somar(20, 4);
		Assert.assertEquals(24, resultado, 0.1);
	}
	
	@Test
	public void dividirComZeroTest() {
		CalculoService calc = new CalculoService();
		double resultado = calc.dividir(13, 0);
		Assert.assertEquals(0, resultado, 0.1);
	}

	@Test
	public void dividirTest() {
		CalculoService calc = new CalculoService();
		double resultado = calc.dividir(13, 2);
		Assert.assertEquals(6.5, resultado, 0.1);
	}
	
}
