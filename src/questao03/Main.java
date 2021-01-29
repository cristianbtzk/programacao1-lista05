package questao03;

public class Main {
	public static void main(String[] args) {
		Conta conta = new Conta("Banco do Brasil", 6931, 12345);
		conta.deposito(200);
		conta.saque(50);
		
		ContaSimples contaSimples = new ContaSimples("Bradesco", 1000, 1111);
		contaSimples.deposito(100);
		contaSimples.saque(200); // O saque não deve ser efetuado, pois não há dinheiro em caixa
		contaSimples.depositoPoupanca(1000);
		contaSimples.saquePoupanca(500);
		
		ContaEspecial contaEspecial = new ContaEspecial("Caixa", 2000, 2222, 5, 3000);
		contaEspecial.deposito(5000);
		contaEspecial.saque(3000);
		
		System.out.println(conta);
		System.out.println(contaSimples);
		System.out.println(contaEspecial);
	}
}
