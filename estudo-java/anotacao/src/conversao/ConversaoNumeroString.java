package exercicios;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		
//		M�todos que convertem um n�mero inteiro para String;
//		O m�todo length mostra quantas caracteres est�o contidas na vari�vel.
	
		Integer num1 = 100;
		System.out.println(num1.toString().length());
		
		Integer num2 = 1000;
		System.out.println(Integer.toString(num2).length());
		
//		M�todo de concatena��o que auxilia na convers�o de inteiro para String.
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
		
		
	}
}
