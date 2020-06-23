package applicantion;

import java.util.Scanner;

import entities.ContaBancaria;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContaBancaria conta;

		System.out.println("Enter account number:");
		int numeroConta = sc.nextInt();
		System.out.println("Enter account holder:");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Is there na initial deposit (y/n)?");
		char op = sc.nextLine().charAt(0);
		double saldo = 0;
		if (op == 'y') {
			System.out.println("Enter initial deposit value:");
			saldo = sc.nextDouble();
			conta = new ContaBancaria(numeroConta, nome, saldo);
		} else {
			conta = new ContaBancaria(numeroConta, nome);
		}

		System.out.println("Account data:");
		System.out.println(conta);
		System.out.println();

		System.out.println("Enter a deposit value:");
		conta.deposita(sc.nextDouble());
		System.out.println("Update account data:");
		System.out.println(conta);
		System.out.println();

		System.out.println("Enter a withdraw value:");
		conta.sacar(sc.nextDouble());
		System.out.println("Update account data:");
		System.out.println(conta);

		sc.close();
	}

}
