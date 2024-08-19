package aplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramSoma {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, soma = 0;
		
		System.out.println("Digite o primeiro numero:");
		num1 = sc.nextInt();
		System.out.println("Digite o segundo numero:");
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		
		System.out.printf("\nSoma: %d", soma);
		
		sc.close();
	}

}
