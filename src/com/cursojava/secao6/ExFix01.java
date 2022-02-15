package com.cursojava.secao6;

import java.util.Scanner;

public class ExFix01 {

	public static void main(String[] args) {
		
		/*Recebe uma senha e mostra se ela é válida ou não*/

		Scanner ent = new Scanner(System.in);
		
		int senha;
		
		senha = ent.nextInt();

		while(senha != 2002){
			System.out.print("Senha inválida");
			senha = ent.nextInt();
		}
		
		System.out.print("Acesso permitido");
		
		ent.close();
		
	}

}
