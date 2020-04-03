package br.com.ciandt.gian73.calculo;

import org.junit.Assert;
import org.junit.Test;

import br.com.ciandt.gian73.calculo.Soma;

public class SomaTest {

	@Test
	public void calcularTest() {
		Soma soma = new Soma();
		
		double resultado = soma.calcular(1.111d, 2d);
		
		Assert.assertEquals(3.11, resultado, 0.0001);
	}
}
