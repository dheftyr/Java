package br.dheftyrdev.aplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramCalculoProdutos {

	public static void main(String[] args) {		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idPro1, idPro2, quantPro1, quantPro2;
		double valorPro1, valorPro2, valor;
		
		
		System.out.println("Digite o id do produto 1:");
		idPro1 = sc.nextInt();
		System.out.println("Digite a quantidade do produto 1:");
		quantPro1 = sc.nextInt();
		System.out.println("Digite o valor do produto 1:");
		valorPro1 = sc.nextDouble();
		
		System.out.println("\nDigite o id do produto 2:");
		idPro2 = sc.nextInt();
		System.out.println("Digite a quantidade do produto 2:");
		quantPro2 = sc.nextInt();
		System.out.println("Digite o valor do produto 2:");
		valorPro2 = sc.nextDouble();
		
		valor = (quantPro1 * valorPro1) + (quantPro2 * valorPro2);
		
		System.out.printf("\nValor total a pagar: %.2f", valor);
		
		sc.close();
	}

}
