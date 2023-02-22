package heranca;

public class Civic extends Carro {
	
//	super: usada pra referenciar uma classe pai da classe em questão;
//	No caso desse exercício, a classe pai é a classe Carro. 

	boolean acelerar() {
		boolean acelera1 = super.acelerar();
		boolean acelera2 = super.acelerar();
		boolean acelera3 = super.acelerar();
		return acelera1 || acelera2 || acelera3;
		
	}
	
	boolean frear() {
		boolean freia1 = super.frear();
		boolean freia2 = super.frear();
		boolean freia3 = super.frear();
		return freia1 || freia2 || freia3;
	}
	
}
