package applicantion;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int notas = sc.nextInt();
		int aux = notas;
		int notas100 = aux / 100;
		aux -= notas100 * 100;
		int notas50 = aux / 50;
		aux -= notas50 * 50;
		int notas20 = aux / 20;
		aux -= notas20 * 20;
		int notas10 = aux / 10;
		aux -= notas10 * 10;
		int notas5 = aux / 5;
		aux -= notas5 * 5;
		int notas2 = aux / 2;
		aux -= notas2 * 2;
		int notas1 = aux / 1;
		aux -= notas1 * 1;

		System.out.println(notas);
		System.out.println(notas100 + " nota(s) de R$ 100,00");
		System.out.println(notas50 + " nota(s) de R$ 50,00");
		System.out.println(notas20 + " nota(s) de R$ 20,00");
		System.out.println(notas10 + " nota(s) de R$ 10,00");
		System.out.println(notas5 + " nota(s) de R$ 5,00");
		System.out.println(notas2 + " nota(s) de R$ 2,00");
		System.out.println(notas1 + " nota(s) de R$ 1,00");

		sc.close();
	}

}
