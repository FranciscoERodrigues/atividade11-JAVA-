package atividade11;

import java.util.Scanner;

//4) Imprima a tabuada de multiplicação de um número específico fornecido pelo usuário.

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tabuada de multiplicação - 2025");
		System.out.println("Digite o numero de 1 ao 10 da tabuada:");
		int numero = sc.nextInt();
		for(int tabuada = 1; tabuada < 11; tabuada ++) {
			
				int calculo = numero * tabuada;
				
				System.out.println(numero+"x"+tabuada+"="+ calculo);
			
		}
		
		sc.close();
		
	}

}
