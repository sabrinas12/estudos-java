package exercicio;

public class Nome {

	private String nome;
	private int registro;
	
	public Nome (String nome, int registro) {
		this.nome = nome;
		this.registro = registro;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + " RA: " + registro;
		
	}
}
