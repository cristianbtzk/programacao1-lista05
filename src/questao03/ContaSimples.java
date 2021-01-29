package questao03;

public class ContaSimples extends Conta{
	private double saldoPoupanca;
	
	public ContaSimples() {
		setSaldoPoupanca(0);
	}
	
	public ContaSimples(String banco, int agencia, int numeroConta) {
		super(banco,agencia,numeroConta);
	}
	
	public boolean depositoPoupanca(double valor) {
		setSaldoPoupanca(saldoPoupanca + valor);
		
		return true;
	}
	
	public boolean saquePoupanca(double valor) {
		if(saldoPoupanca < valor) {
			return false;
		}else {
			setSaldoPoupanca(saldoPoupanca - valor);
			return true;
		}
	}

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
