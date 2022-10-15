package ConversaoCelsiusFahrenheit;

import java.util.Scanner;

public class ConverteTemperatura {
	public static void main(String[] args) {
		int laco = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Bem vindo ao conversor de temperatura!!!");
		
		do {			
			System.out.println("Digite 0: Para sair\n" + "Digite 1: Para converter de Fahrenheit para Celsius\n"
					+ "Digite2: Para converter de Celsius para Fahrenheit");
			int opcao = entrada.nextInt();
			switch (opcao) {
				case 0: {
					laco = 0;
					System.out.println("Obrigado por usar o nosso conversor");
					break;
				}
				case 1: {
					System.out.print("Digite o valor da temperatura em Fahrenheit que deseja converter:");
					double temperatura = entrada.nextDouble();
					double resultado = (temperatura - 32) / 1.8;
					System.out.printf("A temperatura %.2f convertida em Celsius é igual a: %.2f °C\n", temperatura, resultado);
					System.out.println("Deseja continuar?\nDigite 1: Sim | Digite 2: Não");
					opcao = entrada.nextInt();
					if(opcao == 1) {
						laco = 1;
						break;
					} else {
						System.out.println("Obrigado por usar o nosso conversor");
						laco = 0;
						break;
					}
					
				}
				case 2: {
					System.out.print("Digite o valor da temperatura em Celsius que deseja converter:");
					double temperatura = entrada.nextDouble();
					double resultado = (temperatura / 1.8) + 32;
					System.out.printf("A temperatura %.2f convertida em Celsius é igual a: %.2f °F\n", temperatura, resultado);
					System.out.println("Deseja continuar?\nDigite 1: Sim | Digite 2: Não");
					opcao = entrada.nextInt();
					if(opcao == 1) {
						laco = 1;
						break;
					} else {
						System.out.println("Obrigado por usar o nosso conversor");
						laco = 0;
						break;
					}
				}
				default:{
					System.out.println("Opção inválida!");
					laco = 1;
				}			
			}
		} while(laco != 0);
	}
}
