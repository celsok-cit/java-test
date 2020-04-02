package br.com.ciandt.mshen.calculo;

import org.junit.Assert;
import org.junit.Test;

public class DivisaoTest {
    Divisao divisao = new Divisao();
    private double resultado;

    @Test
    public void divisaoPorZero() {
	resultado = divisao.calcular(1, 0);
	Assert.assertEquals(0, resultado, 0);
    }

    @Test
    public void dividendoIgualZero() {
	resultado = divisao.calcular(0, 12);
	Assert.assertEquals(0, resultado, 0);
    }

    @Test
    public void divisaoDeNumeroQualquer() {
	resultado = divisao.calcular(4, 2);
	Assert.assertEquals(2, resultado, 0.1);
    }

    @Test
    public void divisaoComCasasDecimais() {
	resultado = divisao.calcular(7.1, 3);
	Assert.assertEquals(2.3, resultado, 0.1);
    }

    @Test
    public void divisaoComNegativo() {
	resultado = divisao.calcular(-4, 2);
	Assert.assertEquals(-2, resultado, 0.1);
    }
}
