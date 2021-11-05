package com.company;

import java.util.Scanner;

public class EJ01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura;
        int espacio;
        do {
            System.out.println("Escribe la altura del árbol de navidad");
            altura=teclado.nextInt();

        }while (altura<4);
        for (int i = 0; i < altura; i++) {
            System.out.println("^");
            if (i==altura){
                for (int j = 0; j < altura; j++) {
                    System.out.print("^");

                }
            }
        }
    }
}
