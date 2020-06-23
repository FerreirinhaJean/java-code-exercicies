import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcao = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		while (opcao != 4) {
			switch (opcao) {
			case 1:
				alcool++;
				opcao = sc.nextInt();
				break;
			case 2:
				gasolina++;
				opcao = sc.nextInt();
				break;
			case 3:
				diesel++;
				opcao = sc.nextInt();
				break;
			case 4:
				break;
			default:
				opcao = sc.nextInt();
				break;
			}

		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}

}
