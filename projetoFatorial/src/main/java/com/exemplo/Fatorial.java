package com.exemplo;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido. Digite um número inteiro positivo.");
        } else {
            long fatorial = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        scanner.close();
    }

   public static long calcularFatorial(int n) {
         if (n < 0) {
            throw new IllegalArgumentException("Número negativo não possui fatorial.");
        }

        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}

