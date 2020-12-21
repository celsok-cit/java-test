package br.com.ciandt.gian73.calculo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.ciandt.gian73.service.RetornaTextoService;
import br.com.ciandt.gian73.texto.RetornaTexto;

@RunWith(MockitoJUnitRunner.class)
public class RetornaTextoServiceTest {

    @InjectMocks
    RetornaTextoService retorna;
    
    @Mock
    RetornaTexto texto;
    @Test
    public void retorna() {
	Mockito.when(texto.retornar()).thenReturn("Mock");
	String resultado = retorna.obtemTexto();
	assertEquals("Mock", resultado);
    }
   
    
}
