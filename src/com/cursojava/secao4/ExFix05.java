package com.cursojava.secao4;

import java.util.Locale;
import java.util.Scanner;

public class ExFix05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
		
		int numPeca1 = ent.nextInt();
		double valorPeca1 = ent.nextDouble();
		
		System.out.println();
		
		int numPeca2 = ent.nextInt();
		double valorPeca2 = ent.nextDouble();
		
		System.out.println();
		
		double valorTotal = numPeca1*valorPeca1 + numPeca2*valorPeca2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
		
		ent.close();
	}
}

