package br.com.ciandt.mshen.calculo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.ciandt.mshen.service.RetornaTextoService;
import br.com.ciandt.mshen.texto.RetornaTexto;


@RunWith(MockitoJUnitRunner.class)
public class RetornaTextoServiceTest {
    @InjectMocks
    RetornaTextoService service;
    @Mock
    RetornaTexto repository;
    
    @Test
    public void retornaTexto() {
	Mockito.when(repository.retornar()).thenReturn("Mock");
	String resultado = service.obtemTexto();
	assertEquals("Mock", resultado);
    }
}
