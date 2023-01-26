package classe.atribuicao;

public class Pessoa {
	
	String nomeDaPessoa;
	double pesoDaPessoa;
	
	Pessoa (String nomeDaPessoa, double pesoDaPessoa) {
		this.nomeDaPessoa = nomeDaPessoa;
		this.pesoDaPessoa = pesoDaPessoa;
	}
	
	double comer(double pesoDaComida) {
		return pesoDaComida += this.pesoDaPessoa;
	}
	
	String apresentar() {
	return "Olá! meu nome é " + nomeDaPessoa + " e tenho " + pesoDaPessoa + " Kgs.";
	
	}
}
