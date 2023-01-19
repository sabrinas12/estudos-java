package classe.atribuicao;

public class Jantar {
	
	public static void main(String[] args) {
		
//		Método de atribuição de classes.
		
		Comida c1 = new Comida("Arroz", 0.600);
		Comida c2 = new Comida("Feijão", 0.500);
		
		Pessoa p = new Pessoa("Maria", 60.100);
		
		System.out.println(p.apresentar());
		
		System.out.println("Acabei de comer " + c1.nomeDaComida + ". Ele possui " + c1.pesoDaComida);
		System.out.println("Meu peso atual após comer o " + c1.nomeDaComida + " é " + p.comer(c1.pesoDaComida));
		
		System.out.println("Acabei de comer " + c2.nomeDaComida + ". Ele possui " + c2.pesoDaComida);
		System.out.println("Meu peso atual após as refeições é " + p.comer(c1.pesoDaComida + c2.pesoDaComida));
		
		
	}
	
}
