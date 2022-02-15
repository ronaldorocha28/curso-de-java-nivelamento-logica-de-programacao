package com.cursojava.secao7;

import java.util.Scanner;

public class ExFix06 {

	public static void main(String[] args) {
		
		//Recebe um número e mostra todos os divisores dele

		Scanner ent = new Scanner(System.in);
		
		int n;
		
		n = ent.nextInt();
		
		for(int i = 1;i <= n;i++){
			if(n % i == 0){
				System.out.println(i);
			}
		}
		
		ent.close();
	
	}

}
