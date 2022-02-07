package com.cursojava.secao4;

import java.util.Scanner;

public class ExFix01 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		int n1 = ent.nextInt();
		int n2 = ent.nextInt();
		
		int soma = n1 + n2;
		
		System.out.println();
		
		System.out.printf("SOMA = %d\n" ,soma);
		ent.close();
	
	}

}
