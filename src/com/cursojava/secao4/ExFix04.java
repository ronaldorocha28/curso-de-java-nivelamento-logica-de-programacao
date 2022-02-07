package com.cursojava.secao4;

import java.util.Locale;
import java.util.Scanner;

public class ExFix04 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
		
		int numFuncionario = ent.nextInt();
		int numHoras = ent.nextInt();
		double valorHora = ent.nextDouble();
		
		double salario = numHoras * valorHora;
	
		System.out.println();
		System.out.printf("Número = %d\nSalário = U$ %.2f\n", numFuncionario , salario);
		
		ent.close();
	}

}
