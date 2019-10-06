package br.com.ciandt.enovais.calculo;

public class Divisao {
	
	public double calcular(double dividendo, double divisor) {
		
		if (dividendo == 0 || divisor == 0) {
			return 0;
		}
		
		return dividendo/divisor;
	}

}
