import java.util.Scanner;

/*Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros com uma
mensagem explicativa, conforme exemplos*/

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		int soma = valor1+valor2;
		
		System.out.println("Soma dos valores = "+soma);
		
		sc.close();
		

	}

}
