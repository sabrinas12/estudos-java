package arrays;

import java.util.Scanner;

public class Arrays {
	
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
//	Criação de um código que realiza o cálculo da média dos alunos utilizando arrays e laços de repetição.
	
	double [] notaAluno = new double[3];
	
	System.out.println("Digite a primeira nota: ");
	notaAluno[0] = entrada.nextDouble();
	
	System.out.println("Digite a segunda nota: ");
	notaAluno[1] = entrada.nextDouble();
	
	System.out.println("Digite a terceira nota: ");
	notaAluno[2] = entrada.nextDouble();
	
//	Cálculo da média com utilização o laço de repertição ForEach
	
	double totalNotas = 0;
	for(double notas: notaAluno) {
		System.out.println("Notas do Aluno: " + notas);
		totalNotas += notas;
	}
	
	double mediaFinal = totalNotas / notaAluno.length;
	System.out.println("Média do Aluno: " + mediaFinal);
	
//	Indicador de aprovação (método if/else)
	
	if(mediaFinal >= 6) {
		System.out.println("A média final do aluno é: " + mediaFinal + ". O aluno está aprovado nessa disciplina");
	} else {
		System.out.println("A média final do aluno é: " + mediaFinal + ". O aluno está reprovado nessa disciplina");
	}
	
	entrada.close();
	
	}
}
