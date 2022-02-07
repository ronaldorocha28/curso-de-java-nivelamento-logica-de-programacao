package com.cursojava.secao4;

import java.util.Locale;
import java.util.Scanner;

public class ExFix02 {

	public static void main(String[] args) {
		
		double pi = 3.14159;
		
		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
		
		double raio = ent.nextDouble();
		
		System.out.println();

		double area = pi * Math.pow(raio, 2);
	
		System.out.printf("Área = %.4f\n" ,area);
		ent.close();
	}

}
