package com.company;

import java.util.Scanner;

public class EJ02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int resultado =0;
        int a=0;
        System.out.println("Introduce un número");
num1=teclado.nextInt();
        System.out.println("El número "+num1+" Traducido al sistema de asteriscos es:");
        System.out.println();
        while (num1 > 0) {
            resultado= (resultado*10)+(num1%10);
            num1=num1/10;
            }
        while (resultado>0){

            num1=(num1*10)+(resultado%10);
            resultado=resultado/10;


            for (int i = 0; i < num1; i++) {
                System.out.print("*");

            }
            num1=0;

            System.out.print("-");
        }
    }
}
