package br.com.ciandt.mshen.calculo;

import org.junit.Assert;
import org.junit.Test;

import br.com.ciandt.mshen.calculo.Soma;

public class SomaTest {

    @Test
    public void calcularTest() {
	Soma soma = new Soma();

	double resultado = soma.calcular(1.11d, 2d);

	Assert.assertEquals(3.11, resultado, 0.0001);
    }
}
