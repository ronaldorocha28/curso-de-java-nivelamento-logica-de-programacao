package com.cursojava.secao5;

import java.util.Scanner;

public class ExFix03 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		
		int a;
		int b;
		
		a = ent.nextInt();
		b = ent.nextInt();
		
		if(a % b == 0 || b % a == 0){
			System.out.print("S�O MULTIPLOS");
		}else{
			System.out.print("N�O S�O MULTIPLOS");
		}
		
		ent.close();
		
	}

}
