package atividade11;



public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.println("Sequencia de Fibonacci");
		
		int primeiroNumero = 1;
		int segundoNumero = 1;
		
		System.out.print(primeiroNumero + " - " + segundoNumero);
		
		for (int contadora  = 0; contadora < 8; contadora++) {
			
			int soma = primeiroNumero+segundoNumero;
			System.out.print(" - " + soma);
			
			//1 - 1 - 2 - 3 - 5 - 8 - 13 - 21 - 34 - 55
			
			primeiroNumero = segundoNumero;
			segundoNumero = soma; 
			
		}

	}

}
