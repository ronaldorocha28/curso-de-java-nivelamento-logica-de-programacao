package com.cursojava.secao7;

import java.util.Locale;
import java.util.Scanner;

public class ExFix03 {

	public static void main(String[] args) {
		
		/*Recebe a quantidade de médias ponderadas que serão
		calculadas e em seguida pede os valores de a, b e c
		para o calculo de cada média que será calculada*/

		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
		
		int n;
		
		n = ent.nextInt();
		
		for(int i = 0;i < n;i++){
			float a = ent.nextFloat();
			float b = ent.nextFloat();
			float c = ent.nextFloat();
			
			float medPond = (2 * a +  3 * b + 5 * c) / (2 + 3 + 5);
			
			System.out.printf("%.1f", medPond);
			
			System.out.println();
		}
		
		ent.close();
		
	}

}
