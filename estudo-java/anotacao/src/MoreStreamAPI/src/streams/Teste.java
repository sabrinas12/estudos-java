package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Teste {
	
	public static void main(String[] args) {
	
	Cadastro pessoa1 = new Cadastro("Maria", "01/01/1990", true);
	Cadastro pessoa2 = new Cadastro("João", "30/12/2010", false);
	Cadastro pessoa3 = new Cadastro("Paulo", "10/02/1977", true);
	Cadastro pessoa4 = new Cadastro("Sandra", "02/04/2020", false);
	Cadastro pessoa5 = new Cadastro("Manuel", "31/12/1997", true);
	Cadastro pessoa6 = new Cadastro("Miguel", "14/11/2015", false);
	Cadastro pessoa7 = new Cadastro("Pedro", "02/02/1999", true);
	Cadastro pessoa8 = new Cadastro("Joana", "05/09/2012", false);
	
	List<Cadastro> cadastros = Arrays.asList(pessoa1, pessoa2, pessoa3, pessoa4, 
			pessoa5, pessoa6, pessoa7, pessoa8);

	Predicate <Cadastro> maiorDe18 = c -> c.maiorDeIdade != false;
		
		cadastros.stream()
		.filter(maiorDe18)
		.map(c -> "Nome: " + c.nome + "\n Data de nascimento: " + c.nascimento)
		.forEach(System.out::println);
		
	}
}
