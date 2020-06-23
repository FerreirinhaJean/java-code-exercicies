import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
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
