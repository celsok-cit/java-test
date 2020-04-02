package br.com.ciandt.mshen.service;

import br.com.ciandt.mshen.texto.RetornaTexto;

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
