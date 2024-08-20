package br.dheftyrdev.aplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramDiferenca {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferenca = 0;
		
		
		System.out.println("Digite o valor A:");
		a = sc.nextInt();
		System.out.println("Digite o valor B:");
		b = sc.nextInt();
		System.out.println("Digite o valor C:");
		c = sc.nextInt();
		System.out.println("Digite o valor D:");
		d = sc.nextInt();
		
		diferenca = a * b - c * d;
		
		System.out.println("\nA diferenca: " + diferenca);
		
		sc.close();
	}

}
