package entities;

public class ContaBancaria {
	private int numeroConta;
	private String nome;
	private double saldo;

	public ContaBancaria(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}

	public ContaBancaria(int numeroConta, String nome, double deposito) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		deposita(deposito);
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void deposita(double deposito) {
		saldo += deposito;
	}

	public void sacar(double saque) {
		saldo -= saque + 5;
	}

	public String toString() {
		return "Account " + numeroConta + ", Holder: " + nome + ", Balance: $ " + String.format("%.2f", saldo);
	}

}
