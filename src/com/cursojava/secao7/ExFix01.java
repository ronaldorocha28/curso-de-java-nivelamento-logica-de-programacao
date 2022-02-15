package com.cursojava.secao7;

import java.util.Scanner;

public class ExFix01 {

	public static void main(String[] args) {
		
		//Recebe um número e imprime os impares no intervalo de 1 até o valor digitado

		Scanner ent = new Scanner(System.in);
		
		int x;
		
		x = ent.nextInt();
		
		for(int i = 1;i <= x;i++){
			if(i % 2 != 0){
				System.out.println(i);
			}
		}
		ent.close();
		
	}

}
