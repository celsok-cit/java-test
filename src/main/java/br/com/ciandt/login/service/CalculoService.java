package br.com.ciandt.login.service;

import br.com.ciandt.login.calculo.Divisao;
import br.com.ciandt.login.calculo.Soma;

public class CalculoService {
	
	public double somar(double primeiroNumero, double segundoNumero) {
		
		Soma soma = new Soma();
		double resultado = soma.calcular(primeiroNumero, segundoNumero);
		
		return resultado;
	}
	
	public double dividir(double dividendo, double divisor) {
		
		Divisao divisao = new Divisao();
		double resultado = divisao.calcular(dividendo, divisor);
		
		return resultado;
	}
	
	

}
