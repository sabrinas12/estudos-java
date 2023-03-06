package exemplos;

import java.util.Scanner;

/**
 * Classe utilizada para demostrar o uso da palavra chave throw,
 * utilizada quando queremos lançar uma exceção.
 */

public class ExemploThrow {

	public static final String SENHASECRETA = "123456";
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		try {
			
			System.out.println("Digite a senha: ");
			String senha = input.nextLine();
			
			if(!senha.equals(SENHASECRETA)) {
				throw new Exception("Senha invalida!");
			}
			System.out.println("Senha correta! \n Seja bem vindo(a)!");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		input.close();
	}
}
