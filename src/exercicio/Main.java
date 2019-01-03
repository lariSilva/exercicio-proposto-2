package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Olá!");
		System.out.println("Vamos calcular a área de uma circunferência!");
		System.out.println("Digite o valor do raio da circunferência em mm:");
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		sc.close();
		double pi = 3.14159;
		double area = pi * (raio * raio);
		System.out.printf("A área desta circunferência é: %.4f mm2%n", area);
	}

}
