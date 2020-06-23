import java.util.Scanner;

/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas*/
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int inicio = sc.nextInt();
		int fim = sc.nextInt();

		if (inicio < fim)
			System.out.println("Duracao do jogo = " + (fim - inicio));
		else
			System.out.println("Duracao do jogo = " + (24 -inicio + fim));

		sc.close();

	}

}
