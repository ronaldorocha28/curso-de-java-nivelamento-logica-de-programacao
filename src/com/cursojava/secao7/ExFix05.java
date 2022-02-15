package com.cursojava.secao7;

import java.util.Scanner;

public class ExFix05 {

	public static void main(String[] args) {
		
		//Calcula o fatorial do número digitado

		Scanner ent = new Scanner(System.in);
		
		int n;
		
		n = ent.nextInt();
		
		int fat = 1;

		for(int i = 1; i <= n;i++){
			fat = fat * i;
		}
		
		System.out.println(fat);
		ent.close();
		
	}

}

