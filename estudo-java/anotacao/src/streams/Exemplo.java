package exercicio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Exemplo {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 3000.00, 30.00);
		Produto p2 = new Produto("Caneta", 2.00, 0);
		Produto p3 = new Produto("Celular", 1500.00, 15.00);
		Produto p4 = new Produto("Televisão", 4500.99, 30.00);
		Produto p5 = new Produto("Caderno", 15.00, 0);
		Produto p6 = new Produto("Livro", 50.00, 0);
		Produto p7 = new Produto ("Kindle", 500.00, 0);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
		
//		Filter, filter, map
		Predicate <Produto> valorAlto = p -> p.preco >= 1000;
		Predicate<Produto> freteAlto = p -> p.frete >= 30;
		
		produtos.stream()
		.filter(valorAlto)
		.filter(freteAlto)
		.map(p -> "Produto: " + p.produto + " Preço: " + p.preco)
		.forEach(System.out::println);
	}
}
