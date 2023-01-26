package oo.heranca.desafio;

public class Carro {

	int velocidadeAtual = 0;
	
	boolean acelerar() {
		velocidadeAtual += 5;
		return true;
	}
	
	boolean frear() {
		if (velocidadeAtual <= 0) {
			velocidadeAtual = 0;
		} else {
			velocidadeAtual -=5;
		}
		return true;
	}
	
}