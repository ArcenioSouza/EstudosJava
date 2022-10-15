package DesafioMediaNotas;

import java.util.Scanner;

public class MediaDeNotas {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a quantidade de notas que serão utilizadas: ");
		int qtdNotas = entrada.nextInt();
		double[] notas = new double[qtdNotas];
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("Informe a nota %d: ", (i + 1));
			notas[i] = entrada.nextDouble();
		}
		
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		System.out.printf("A média das notas é: %.2f!", media);
		entrada.close();
	}
}
