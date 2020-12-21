package br.com.ciandt.gian73.calculo;

import org.junit.Assert;
import org.junit.Test;

public class DivisaoTest {
    Divisao div = new Divisao();
    double resultado;

    @Test
    public void divisaoPorZero() {
	resultado = div.calcular(4, 0);
	Assert.assertEquals(0, resultado, 0);

    }

    @Test
    public void divisaoQualquerNumero() {
	resultado = div.calcular(10, 2);
	Assert.assertEquals(5, resultado, 0);
    }

    @Test
    public void divisaoNegativa() {
	resultado = div.calcular(-6, 1);
	Assert.assertEquals(-6, resultado, 0);
    }
}
