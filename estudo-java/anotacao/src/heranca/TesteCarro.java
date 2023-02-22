package herança;

public class TesteCarro {
	
	public static void main(String[] args) {

	Civic civic = new Civic();
	Opala opala = new Opala();
	
	civic.acelerar(); // 15
	civic.acelerar(); // 30
	civic.acelerar(); // 45
	civic.acelerar(); // 60
	civic.acelerar(); // 75
	civic.acelerar(); // 90
	
	System.out.println(civic.velocidadeAtual); // 90
	
	civic.frear(); // 75
	civic.frear(); // 60
	civic.frear(); // 45
	
	System.out.println(civic.velocidadeAtual); // 45
	
	opala.acelerar(); // 5
	opala.acelerar(); // 10
	opala.acelerar(); // 15
	opala.acelerar(); // 20
	opala.acelerar(); // 25
	opala.acelerar(); // 30
	
	System.out.println(opala.velocidadeAtual);
	
	opala.frear(); // 25
	opala.frear(); // 20
	opala.frear(); // 15
	opala.frear(); // 10
	opala.frear(); // 05
	opala.frear(); // 00
	opala.frear(); // 00 --> Abaixo de zero, o valor năo irá diminuir devido ao método if criado
	opala.frear(); // 00
	
	System.out.println(opala.velocidadeAtual);
	}
}
