package br.com.ciandt.mshen.calculo;

import org.junit.Assert;
import org.junit.Test;

import br.com.ciandt.mshen.service.CalculoService;

public class CalculoServiceTest {
    CalculoService calculo = new CalculoService();
    private double resultado;

    @Test
    public void calculoPorZero() {
	resultado = calculo.dividir(1, 0);
	Assert.assertEquals(0, resultado, 0);
    }

    @Test
    public void dividendoIgualZero() {
	resultado = calculo.dividir(0, 1);
	Assert.assertEquals(0, resultado, 0);
    }

    @Test
    public void calculoDeNumeroQualquer() {
	resultado = calculo.dividir(4, 2);
	Assert.assertEquals(2, resultado, 0.1);
    }

    @Test
    public void calculoComCasasDecimais() {
	resultado = calculo.dividir(7.1, 3);
	Assert.assertEquals(2.3, resultado, 0.1);
    }

    @Test
    public void calculoComNegativo() {
	resultado = calculo.dividir(-4, 2);
	Assert.assertEquals(-2, resultado, 0.1);
    }

    @Test
    public void somaNegativo() {
	resultado = calculo.somar(-1, -2);
	Assert.assertEquals(-3, resultado, 0);
    }

    @Test
    public void somaComZero() {
	resultado = calculo.somar(0, 2);
	Assert.assertEquals(2, resultado, 0);
    }

    @Test
    public void somaComDecimal() {
	resultado = calculo.somar(1.5, 2);
	Assert.assertEquals(3.5, resultado, 0.1);
    }
}
