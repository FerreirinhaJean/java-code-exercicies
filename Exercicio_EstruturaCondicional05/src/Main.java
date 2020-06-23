import java.util.Locale;
import java.util.Scanner;

/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.*/
public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double total = 0;
		if (codigo == 1)
			total = quantidade * 4;
		else if (codigo == 2)
			total = quantidade * 4.50;
		else if (codigo == 3)
			total = quantidade * 5;
		else if (codigo == 4)
			total = quantidade * 2;
		else if (codigo == 5)
			total = quantidade * 1.50;

		System.out.println("Total: R$" + total);

		sc.close();

	}

}
