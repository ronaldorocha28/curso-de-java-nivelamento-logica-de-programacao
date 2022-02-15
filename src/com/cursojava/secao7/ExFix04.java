package com.cursojava.secao7;

import java.util.Locale;
import java.util.Scanner;

public class ExFix04 {

	public static void main(String[] args) {
		
		/*Recebe a quantidade de divis�es que ser�o
		calculadas e em seguida pede os valores de a e b 
		caso b seja igual a 0 ser� exibida uma mensagem
		informando que n�o � possivel realizar a divis�o,
		caso seja diferente de 0 o resultado ser� mostrado*/

		Locale.setDefault(Locale.US);
		Scanner ent = new Scanner(System.in);
		
		int n;
		
		n = ent.nextInt();
		
		for(int i = 0;i < n;i++){
			int a = ent.nextInt();
			int b = ent.nextInt();
			
			float result = (float)a / b;
			
			if(b == 0){
				System.out.print("Divis�o imposs�vel\n");
			}
			
			System.out.println();
			
			System.out.printf("%.1f\n", result);
		}
		
		ent.close();
	}

}

