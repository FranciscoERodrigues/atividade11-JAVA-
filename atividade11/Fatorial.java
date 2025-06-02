package atividade11;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro para calcular o fatorial: ");
        int numero = sc.nextInt();

        long fatorial = 1;

        for (int valor = 1; valor <= numero; valor++) {
            fatorial = fatorial * valor;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        
        
        sc.close();
    }
    
    
}