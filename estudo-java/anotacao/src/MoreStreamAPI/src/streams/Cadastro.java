package streams;

public class Cadastro {

	String nome;
	String nascimento;
	protected boolean maiorDeIdade = false;
	
	Cadastro (String nome, String nascimento, boolean maiorDeIdade) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.maiorDeIdade = maiorDeIdade;
		
	}
	
	public static boolean MaiorDeIdade(boolean Adulto) {
	    return Adulto;
	}
}
