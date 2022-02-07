package com.cursojava.secao5;

import java.util.Scanner;

public class ExFix02 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		
		int num;
		
		num = ent.nextInt();
		
		if(num % 2 == 0){
			System.out.print("PAR");
		}else{
			System.out.print("IMPAR");
		}
		
		ent.close();
		
	}

}