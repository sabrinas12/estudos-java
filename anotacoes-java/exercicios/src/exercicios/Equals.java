package exercicios;

import java.util.Scanner;

public class Equals {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo n�mero: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Digite o operador: ");
		String operador = entrada.next();
		
//		L�gica
//		Nesse exercicio, o ser� utilizado o m�todo equals para definir o tipo de operador que o usu�rio deseja.
		
		if(operador.equals("+")) {
			System.out.println("O resultado da soma �: " + (num1 + num2));
			
		} else if (operador.equals("-")) {
			System.out.println("O resultado da subtra��o �: " + (num1 - num2));
			
		} else if (operador.equals("*")) {
			System.out.println("O resultado da multiplica��o �: "+ (num1 * num2));
			
		} else if (operador.equals("/")) {
			System.out.println("O resultado da divis�o �: " + (num1 / num2));
				
		} else if (operador.equals("%")) {
			System.out.println("O resto da divis�o dos valores "+ num1 + " e " + num2 + " �: " + (num1 % num2));
			
		}
		
		entrada.close();
	}
}
