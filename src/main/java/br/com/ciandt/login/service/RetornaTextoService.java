package br.com.ciandt.login.service;

import br.com.ciandt.login.texto.RetornaTexto;

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
