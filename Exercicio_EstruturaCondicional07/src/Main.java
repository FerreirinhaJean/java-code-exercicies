import java.util.Locale;
import java.util.Scanner;

/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se est� sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem �Origem�.
Se o ponto estiver sobre um dos eixos escreva �Eixo X� ou �Eixo Y�, conforme for a
situa��o*/
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double X = sc.nextDouble();
		double Y = sc.nextDouble();
		
		if(X>0 && Y>0)
			System.out.println("Q1");
		else if(X>0 && Y<0)
			System.out.println("Q4");
		else if(X<0 && Y>0)
			System.out.println("Q2");
		else if(X<0 && Y<0)
			System.out.println("Q3");
		else
			System.out.println("Origem");
		
		sc.close();
	}

}
