package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Ol�!");
		System.out.println("Vamos calcular a �rea de uma circunfer�ncia!");
		System.out.println("Digite o valor do raio da circunfer�ncia em mm:");
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		sc.close();
		double pi = 3.14159;
		double area = pi * (raio * raio);
		System.out.printf("A �rea desta circunfer�ncia �: %.4f mm2%n", area);
	}

}
