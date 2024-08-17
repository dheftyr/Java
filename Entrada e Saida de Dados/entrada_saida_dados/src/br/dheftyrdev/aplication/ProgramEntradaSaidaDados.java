package br.dheftyrdev.aplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEntradaSaidaDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		
		System.out.println("Product:");
		System.out.printf("%s, which price is $ %.2f\n", product1, price1);
		System.out.printf("%s, which price is $ %.2f\n\n", product2, price2);
		
		
		System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender + "\n");
		
		System.out.printf("Measure with eight decimal places: %.8f\n", measure);
		System.out.printf("Rouded (three decimal places): %.3f\n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decima point: %.3f\n", measure);
		
		sc.close();
	}

}
