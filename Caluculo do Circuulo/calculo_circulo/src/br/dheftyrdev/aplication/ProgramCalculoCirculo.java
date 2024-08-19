package br.dheftyrdev.aplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramCalculoCirculo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, pi = 3.14159, area = 0;
		
		System.out.println("Digite o valor do raio:");
		raio = sc.nextDouble();
		
		area = pi * raio * raio;
		
		System.out.printf("\nA area do raio: %.2f", area);
		sc.close();
	}

}
