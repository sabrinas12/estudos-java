package exercicio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

// Exercício utilizando Collection e ArrayList;
// As Collections são um conjunto bem definido de interfaces e classe para representar e tratar grupos de dados como uma única unidade.
public class RegistroChamada {

	public static void main(String[] args) {
		Collection<Nome> nomes = new ArrayList<>();
		
		System.out.println("### Lista de presença dos alunos ###");
		
		try(Scanner input = new Scanner(System.in)) {
			String continuar = "s";
			
//	Laço de repetição criado caso do usuário responda "s"		
			while("s".equalsIgnoreCase(continuar)) {
				System.out.println("Nome: ");
				String nome = input.nextLine();
				
				System.out.println("RA: ");
				int registro = input.nextInt();
				input.nextLine(); // Consumir quebra de linha deixada pelo nextInt()
				
				Nome registros = new Nome(nome, registro);
				if(nomes.contains(registros)) {
					System.out.println("Esse aluno já foi inserido no sistema. Digite outro nome: ");
				} else {
					nomes.add(registros);
					System.out.println("Aluno adicionado");
				}
				
				System.out.println("Deseja adicionar mais nomes? (s/n)");
				continuar = input.nextLine();
			}
		}
		
//		Caso o usuário digite "n", o programa irá mostrar todos os registros e irá terminar o programa.
		nomes.forEach(System.out::println);
		
		System.out.println("### Fim do Programa ###");
	}
}
