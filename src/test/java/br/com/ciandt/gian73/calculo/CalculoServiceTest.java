package br.com.ciandt.gian73.calculo;

import org.junit.Assert;
import org.junit.Test;

import br.com.ciandt.gian73.service.CalculoService;

public class CalculoServiceTest {
    CalculoService calculo = new CalculoService();

    @Test
    public void DivisaoPorZero() {
	Assert.assertEquals(0, calculo.dividir(4, 0), 0);

    }

    @Test
    public void divisaoQualquerNumero() {
	Assert.assertEquals(3, calculo.dividir(6, 2), 0.1);
    }

    @Test
    public void divisaoNegativa() {
        Assert.assertEquals(-6, calculo.dividir(-6,1), 0);
    }
    @Test
    public void SomarPorZero() {
	Assert.assertEquals(4, calculo.somar(4, 0), 0);

    }

    @Test
    public void SomarQualquerNumero() {
	Assert.assertEquals(8, calculo.somar(6, 2), 0.1);
    }

    @Test
    public void SomarNegativa() {
        Assert.assertEquals(-1, calculo.somar(-2,1), 0);
    }
}


