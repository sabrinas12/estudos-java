package polimorfismo;

public class Jantar {

	public static void main(String[] args) {
//		Aplicação de Polimorfismo Dinâmico;
//		acontece na herança, quando a subclasse sobrepõe o método original.
		
		Pessoa convidado = new Pessoa(99.65);
		
		Arroz ingrediente1 = new Arroz(0.200);
		Feijao ingrediente2 = new Feijao(0.100);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		
		System.out.println(convidado.getPeso());
		
		Sorvete sobremesa = new Sorvete(0.4);
		
		convidado.comer(sobremesa);
		System.out.println(convidado.getPeso());
	}
}
