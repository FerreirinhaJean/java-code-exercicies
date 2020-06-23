package applicantion;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Pessoa> listaPessoa = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char op = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Anual income: ");
			double rendaAnual = sc.nextDouble();
			if (op == 'i') {
				System.out.print("Health expenditures: ");
				double gastosSaude = sc.nextDouble();
				listaPessoa.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			}
			if (op == 'c') {
				System.out.print("Number of employees: ");
				int numeroFuncionarios = sc.nextInt();
				listaPessoa.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		double totalImposto = 0;
		for (int i = 0; i < listaPessoa.size(); i++) {
			System.out.println(
					listaPessoa.get(i).getNome() + " $" + String.format("%.2f", listaPessoa.get(i).calculoImpostos()));
			totalImposto += listaPessoa.get(i).calculoImpostos();
		}
		System.out.println("TOTAL IMPOST: " + String.format("%.2f", totalImposto));

		sc.close();

	}

}
