package exemplos;

import java.util.Scanner;

/**
 * Classe que demonstra o uso do bloco finally.
 * A palavra-chave finally representa um techo de c�digo que ser� sempre executado,
 * independentemente se uma exce��o ocorrer. 
 */

public class ExemploFinally {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		try {
			int dividendo, divisor;
			System.out.println("Digite o valor do dividendo: ");
			dividendo = input.nextInt();
			
			System.out.println("Digite o valor do dividor: ");
			divisor = input.nextInt();
			
			if(divisor == 0) {
				throw new Exception("N�o � permitido fazer uma divis�o por zero!");
			}
			
			System.out.println(dividendo + " / " + divisor + " = " + (dividendo / divisor));
		} catch (Exception ex) {
			System.out.println("ERRO: " + ex.getMessage());
		} finally {
			System.out.println("Bloco Finally. ");
		}
		
		input.close();
	}
}
