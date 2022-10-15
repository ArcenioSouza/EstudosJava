package ResolveEquacao;

import java.util.Scanner;

public class EquacaoApp {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Bem vindo ao App Equação do 2° grau!!!");
		// int laco = 0;

		// do {
		System.out.print("Digite o valor de a:");
		int a = entrada.nextInt();
		System.out.print("Digite o valor de b:");
		int b = entrada.nextInt();
		System.out.print("Digite o valor de c:");
		int c = entrada.nextInt();

		double delta = (b * b) - 4 * a * c;
		System.out.println("-----------------------------------------------------");
		System.out.printf("Valor de delta: %.0f\n", delta);
		System.out.println("-----------------------------------------------------");
		if (delta > 0) {
			double xPositivo = (-b + Math.sqrt(delta)) / (2 * a);
			double xNegativo = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.printf("X¹ = %.0f\n", xPositivo);
			System.out.printf("X² = %.0f", xNegativo);

		} else {
			System.out.println("Delta menor que zero não possue solução real");
		}

		// }while(laco != 0);

	}
}
