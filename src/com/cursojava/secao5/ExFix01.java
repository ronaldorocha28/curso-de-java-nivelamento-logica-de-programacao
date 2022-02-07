package com.cursojava.secao5;

import java.util.Scanner;

public class ExFix01 {
	
	public static void main(String[] args){
	
	Scanner ent = new Scanner(System.in);
	
	int num;
	
	num = ent.nextInt();
	
	if(num < 0){
		System.out.println("NEGATIVO");
	}else{
		System.out.println("NÃO NEGATIVO");
	}

	ent.close();

	}
}
