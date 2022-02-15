package com.cursojava.secao7;

import java.util.Scanner;

public class ExFix02 {

	public static void main(String[] args) {
		
		/*Recebe a quantidade de valores que irá ser digitado
		 e após isso mostra a quantidade de números dentro e 
		 fora do intervalo de 10 a 20 neste exemplo*/

		Scanner ent = new Scanner(System.in);
		
		int n;
		int quantDentro = 0;
		int quantFora = 0;
		
		n = ent.nextInt();
		
		for(int i = 0; i < n;i++){
			int x = ent.nextInt();
			
			if(x >= 10 && x <= 20){
				quantDentro += 1;
			}else{
				quantFora += 1;
			}
		}
		
		System.out.printf("%d %s\n", quantDentro, "in");
		System.out.printf("%d %s", quantFora, "out");

		ent.close();
	}

}

