package applicantion;

import java.util.Scanner;

import entities.Quartos;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Quartos[] quartos = new Quartos[10];

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			quartos[room] = new Quartos(nome, email, room);
		}

		for (int i = 0; i < N; i++) {
			System.out.println(quartos[i]);
		}

	}

}
