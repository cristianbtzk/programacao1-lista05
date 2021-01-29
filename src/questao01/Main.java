package questao01;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("João","São Paulo");
		
		PessoaFisica pessoaFisica = new PessoaFisica("Marcos", "Rio de Janeiro", "000.000.000-00", "Solteiro");
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica("Pedro", "Florianópolis", "00.000.000/0001-??", "Sociedade simples");
		System.out.println(pessoa);
		System.out.println(pessoaFisica);
		System.out.println(pessoaJuridica);
	}
}
