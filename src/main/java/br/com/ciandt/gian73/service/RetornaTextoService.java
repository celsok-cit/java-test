package br.com.ciandt.gian73.service;

import br.com.ciandt.gian73.texto.RetornaTexto;

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
