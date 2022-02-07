package com.cursojava.secao4;

import java.util.Scanner;

public class ExFix03 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		int a = ent.nextInt();
		int b = ent.nextInt();
		int c = ent.nextInt();
		int d = ent.nextInt();
		
		int result = (a*b)-(c*d);
		
		System.out.println();
		System.out.printf("DIFERENÇA: %d\n" ,result);
		ent.close();
	}

}
