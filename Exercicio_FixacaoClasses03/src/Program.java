import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student estudante = new Student();

		String nome = sc.nextLine();
		estudante.nota1 = sc.nextDouble();
		estudante.nota2 = sc.nextDouble();
		estudante.nota3 = sc.nextDouble();

		System.out.printf("FINAL GRADE = %.2f%n", estudante.media());

		if (estudante.media() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", estudante.pontosRestantes());
		} else {
			System.out.println("PASS");
		}

		sc.close();

	}

}
