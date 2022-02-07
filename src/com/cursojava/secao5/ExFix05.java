package com.cursojava.secao5;

import java.util.Locale;
import java.util.Scanner;

public class ExFix05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
		
		int cod;
		int quantidade;
		
		cod = ent.nextInt();
		quantidade = ent.nextInt();
		double total;
		
		switch (cod){
			case 1:
				total = quantidade * 4.00;
				System.out.printf("Total: R$ %.2f", total);
				break;
				
			case 2:
				total = quantidade * 4.50;
				System.out.printf("Total: R$ %.2f", total);
				break;
			
			case 3:
				total = quantidade * 5.00;
				System.out.printf("Total: R$ %.2f", total);
				break;
				
			case 4:
				total = quantidade * 2.00;
				System.out.printf("Total: R$ %.2f", total);
				break;
				
			case 5:
				total = quantidade * 1.50;
				System.out.printf("Total: R$ %.2f", total);
				break;
		}

		ent.close();
		
	}

}

