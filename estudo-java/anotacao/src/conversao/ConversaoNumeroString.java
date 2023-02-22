package conversao;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		
//		Métodos que convertem um número inteiro para String;
//		O método length mostra quantas caracteres estão contidas na variável.
	
		Integer num1 = 100;
		System.out.println(num1.toString().length());
		
		Integer num2 = 1000;
		System.out.println(Integer.toString(num2).length());
		
//		Método de concatenação que auxilia na conversão de inteiro para String.
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
		
		
	}
}
