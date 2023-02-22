package exercicios;

import java.util.Scanner;

public class Arrays {
	
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
//	Cria��o de um c�digo que realiza o c�lculo da m�dia dos alunos utilizando arrays e la�os de repeti��o.
	
	double [] notaAluno = new double[3];
	
	System.out.println("Digite a primeira nota: ");
	notaAluno[0] = entrada.nextDouble();
	
	System.out.println("Digite a segunda nota: ");
	notaAluno[1] = entrada.nextDouble();
	
	System.out.println("Digite a terceira nota: ");
	notaAluno[2] = entrada.nextDouble();
	
//	C�lculo da m�dia com utiliza��o o la�o de reperti��o ForEach
	
	double totalNotas = 0;
	for(double notas: notaAluno) {
		System.out.println("Notas do Aluno: " + notas);
		totalNotas += notas;
	}
	
	double mediaFinal = totalNotas / notaAluno.length;
	System.out.println("M�dia do Aluno: " + mediaFinal);
	
//	Indicador de aprova��o (m�todo if/else)
	
	if(mediaFinal >= 6) {
		System.out.println("A m�dia final do aluno �: " + mediaFinal + ". O aluno est� aprovado nessa disciplina");
	} else {
		System.out.println("A m�dia final do aluno �: " + mediaFinal + ". O aluno est� reprovado nessa disciplina");
	}
	
	entrada.close();
	
	}
}
