import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int numero = sc.nextInt();
			int numero1 = sc.nextInt();

			if (numero1 == 0) {
				System.out.println("divisao impossivel");
			} else {
				double divisao = (double) numero / numero1;
				System.out.println(divisao);
			}
		}

		sc.close();

	}

}
