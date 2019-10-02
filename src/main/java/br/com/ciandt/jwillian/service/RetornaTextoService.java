package br.com.ciandt.jwillian.service;

import br.com.ciandt.jwillian.texto.RetornaTexto;

public class RetornaTextoService {
	
	private RetornaTexto retornaTexto;
	
	public RetornaTextoService() {
		this.retornaTexto = new RetornaTexto();
	}
	
	public String obtemTexto() {
		String resultado = retornaTexto.retornar();
		
		return resultado;
	}

}
