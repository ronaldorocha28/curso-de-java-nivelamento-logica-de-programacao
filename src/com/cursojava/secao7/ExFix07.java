package com.cursojava.secao7;

import java.util.Scanner;

public class ExFix07 {

	public static void main(String[] args) {
		
		/*Recebe um número e mostra o quadrado e o cubo
		 de cada número no intervalo de 1 até o valor digitado*/

		Scanner ent = new Scanner(System.in);
			
		int n;
		
		n = ent.nextInt();
		
		for(int i = 1;i <= n;i++){
			System.out.print(i + " ");
			System.out.print((int)Math.pow(i, 2) + " ");
			System.out.println((int)Math.pow(i, 3));
		}
		
		ent.close();
	}

}

