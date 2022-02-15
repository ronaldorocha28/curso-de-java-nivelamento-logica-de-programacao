package com.cursojava.secao6;

import java.util.Scanner;

public class ExFix03 {

	public static void main(String[] args) {

		/*Recebe um inteiro que indica um produto 1-Álcool
		2-Gasolina, 3-Diesel e 4-Fim e contabiliza cada vez que 
		a opção do produto é digitado e após o termino o
		programa informa a quantidade de vezes que cada
		produto foi digitado*/
		
		Scanner ent = new Scanner(System.in);
		
		int opc;
		int quantAlc = 0;
		int quantGas = 0;
		int quantDie = 0;
		
		opc = ent.nextInt();
		
		while(opc != 4){
			if(opc == 1){
				quantAlc += 1;
			}else{
				if(opc == 2){
					quantGas += 1;
				}else{
					if(opc == 3){
						quantDie += 1;
					}
				}
			}
			
			opc = ent.nextInt();
			
		}
		
		System.out.print("MUITO OBRIGADO\n");
		System.out.printf("Álcool: %d\n", quantAlc);
		System.out.printf("Gasolina: %d\n", quantGas);
		System.out.printf("Diesel: %d\n", quantDie);

		ent.close();
	}

}
