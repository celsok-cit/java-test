package br.com.ciandt.jwillian.calculo;

public class Divisao {
	
	public double calcular(double dividendo, double divisor) {
		
		if (divisor == 0) {
			return 0;
		}
		
		return dividendo/divisor;
	}

}
