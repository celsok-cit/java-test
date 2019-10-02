package br.com.ciandt.login.service;

import br.com.ciandt.login.texto.RetornaTexto;

public class RetornaTextoService {
	
	public String obtemTexto() {
		RetornaTexto retornaTexto = new RetornaTexto();
		
		String resultado = retornaTexto.retornar();
		
		return resultado;
	}

}
