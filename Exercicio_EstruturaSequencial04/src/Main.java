import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
decimais*/
public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numFuncionario = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorHorasTrabalhadas =sc.nextDouble();
		double salario = horasTrabalhadas*valorHorasTrabalhadas;
		
		System.out.printf("Numero funcionario = %d%nSalario = %.2f",numFuncionario,salario);
		
		sc.close();
	}

}
