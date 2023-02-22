package tratamento de erros;

import java.util.Scanner;

public class TratamentoErros {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		
		if(nota1 < 0) {
			throw new RuntimeException("O número digitado é menor do que 0. ");
		}
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		if(nota2 < 0) {
			throw new RuntimeException("O número digitado é menor do que 0. ");
		} else {
			double media = (nota1 + nota2) / 2;
		System.out.println("Média do aluno: " + media);		
	}
		
		entrada.close();
	}
}
