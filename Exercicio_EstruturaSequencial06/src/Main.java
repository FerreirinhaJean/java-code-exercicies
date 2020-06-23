import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e
mostre:
a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
b) a �rea do c�rculo de raio C. (pi = 3.14159)
c) a �rea do trap�zio que tem A e B por bases e C por altura.
d) a �rea do quadrado que tem lado B.
e) a �rea do ret�ngulo que tem lados A e B*/
public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double areaTrianguloRetangulo = (A*C)/2;
		double circuloRaio = 3.14159 * Math.pow(C, 2);
		double trapezio = (A+B)*C/2;
		double quadrado = B*B;
		double retangulo = A*B;
		
		System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f",areaTrianguloRetangulo,circuloRaio,trapezio,quadrado,retangulo);
		
		sc.close();
		
	}

}