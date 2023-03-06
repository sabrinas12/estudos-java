package exemplos;

import java.util.Scanner;

/**
 * Classe que demonstra o uso do try / catch.
 */

public class ExemploTryCatch {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("Digite um valor inteiro: ");
			int numero1 = input.nextInt();
			
			System.out.println("Digite um valor inteiro: ");
			int numero2 = input.nextInt();
			
			System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
		} catch(Exception ex) {
			System.out.println("ERRO - Um dos valores digitados não é um número inteiro!");
		}
		
		input.close();
	}
}
