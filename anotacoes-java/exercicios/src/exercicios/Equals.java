package exercicios;

import java.util.Scanner;

public class Equals {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Digite o operador: ");
		String operador = entrada.next();
		
//		Lógica
//		Nesse exercicio, o será utilizado o método equals para definir o tipo de operador que o usuário deseja.
		
		if(operador.equals("+")) {
			System.out.println("O resultado da soma é: " + (num1 + num2));
			
		} else if (operador.equals("-")) {
			System.out.println("O resultado da subtração é: " + (num1 - num2));
			
		} else if (operador.equals("*")) {
			System.out.println("O resultado da multiplicação é: "+ (num1 * num2));
			
		} else if (operador.equals("/")) {
			System.out.println("O resultado da divisão é: " + (num1 / num2));
				
		} else if (operador.equals("%")) {
			System.out.println("O resto da divisão dos valores "+ num1 + " e " + num2 + " é: " + (num1 % num2));
			
		}
		
		entrada.close();
	}
}
