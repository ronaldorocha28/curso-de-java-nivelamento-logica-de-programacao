package com.cursojava.secao6;

import java.util.Scanner;

public class ExFix02 {

	public static void main(String[] args) {
		
		/*Recebe um par ordenado x e y e identifica o
		quadrante e continua pedindo até que um
		dos valores do par seja 0*/

		Scanner ent = new Scanner(System.in);
		
		int x;
		int y;
		
		x = ent.nextInt();
		y = ent.nextInt();
		
		while(x != 0 && y != 0){
			if(x > 0 && y > 0){
				System.out.println("Primeiro");
			}else{
				if(x < 0 && y > 0){
					System.out.println("Segundo");
				}else{
					if(x < 0 && y < 0){
						System.out.println("Terceiro");
					}else{
							System.out.println("Quarto");
					}
					
				}
			}
			
			x = ent.nextInt();
			y = ent.nextInt();
			
		}

		ent.close();
		
	}

}
