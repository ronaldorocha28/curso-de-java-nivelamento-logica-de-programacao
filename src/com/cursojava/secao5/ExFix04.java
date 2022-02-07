package com.cursojava.secao5;

import java.util.Scanner;

public class ExFix04 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		
		int horaInicial;
		int horaFinal;
		
		horaInicial = ent.nextInt();
		horaFinal = ent.nextInt();
		
		if(horaInicial == horaFinal){
			System.out.print("O JOGO DUROU 24 HORA(S)");
		}else{
			if(horaInicial > horaFinal){
				int total = 24 - horaInicial + horaFinal;
				System.out.printf("O JOGO DUROU %d HORA(S)", total);
			}else{
				int total = horaFinal - horaInicial;
				System.out.printf("O JOGO DUROU %d HORA(S)", total);
			}
		}
		
		ent.close();
		
	}

}
