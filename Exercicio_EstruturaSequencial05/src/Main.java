import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.*/
public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codPeca1 = sc.nextInt();
		int numPeca1 = sc.nextInt();
		double valorPeca1 = sc.nextDouble();
		int codPeca2 = sc.nextInt();
		int numPeca2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();

		double valorPagar = (valorPeca1 * numPeca1 + valorPeca2 * numPeca2);
		
		System.out.printf("VALOR A PAGAR = %.2f",valorPagar);
		
		sc.close();
	}

}
