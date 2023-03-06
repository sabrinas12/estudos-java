package streams2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Utilização de filtro de fluxo que consiste em retornar um fluxo 
 * nos elementos que correspondem ao predicado fornecido.
 */
public class Teste {
	
	public static void main(String[] args) {
		
	Nacionalidade p1 = new Nacionalidade("Maria", "Brasil", "F");
	Nacionalidade p2 = new Nacionalidade("Marcos", "Argentina", "M");
	Nacionalidade p3 = new Nacionalidade("Roberta", "Colombia", "F");
	Nacionalidade p4 = new Nacionalidade("João", "Brasil", "M");
	Nacionalidade p5 = new Nacionalidade("Leonardo", "Brasil", "M");
	Nacionalidade p6 = new Nacionalidade("Pietro", "Costa Rica", "M");
	Nacionalidade p7 = new Nacionalidade("Marta", "Brasil", "F");
	Nacionalidade p8 = new Nacionalidade("Fernanda", "Estados Unidos", "F");
	Nacionalidade p9 = new Nacionalidade("Jorge", "Brasil", "M");
	Nacionalidade p10 = new Nacionalidade("Enzo", "Portugal", "M");
	
	List<Nacionalidade> nacionalidade = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
	
	Predicate<Nacionalidade> brasileiro = b -> b.nacionalidade.equalsIgnoreCase("Brasil");
	Predicate<Nacionalidade> genero = g -> g.genero.equalsIgnoreCase("M");
	
	
	nacionalidade.stream().
	filter(brasileiro)
	.filter(genero)
	.map(n -> "Nome: " + n.nome + " Nacionalidade: " + n.nacionalidade + 
			" Gênero: " + n.genero)
	.forEach(System.out::println);
	
	}
}
