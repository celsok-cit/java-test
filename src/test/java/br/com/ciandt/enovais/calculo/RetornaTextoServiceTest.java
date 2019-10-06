package br.com.ciandt.enovais.calculo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.ciandt.enovais.service.RetornaTextoService;
import br.com.ciandt.enovais.texto.RetornaTexto;

@RunWith(MockitoJUnitRunner.class)
public class RetornaTextoServiceTest {
	
		@InjectMocks
		RetornaTextoService service;
		
		@Mock
		RetornaTexto retornoTexto;
		
		@Test
		public void testRetornarTexto() {
			
			String valueReturn = "MOCK";
			
			Mockito.when(retornoTexto.retornar()).thenReturn(valueReturn);
			
			String result = service.obtemTexto();			
			
			Assert.assertEquals(valueReturn, result);
		}
		
}
