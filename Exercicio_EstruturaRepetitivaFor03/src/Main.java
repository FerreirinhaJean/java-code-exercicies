import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double valor1;
		double valor2;
		double valor3;
		for (int i = 0; i < N; i++) {
			valor1 = sc.nextDouble();
			valor2 = sc.nextDouble();
			valor3 = sc.nextDouble();

			double media = (valor1 * 0.2) + (valor2 * 0.3) + (valor3 * 0.5);

			System.out.println(media);
		}

		sc.close();

	}

}
