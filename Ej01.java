package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el tamaño del vector 1");
        int v1[] = new int[teclado.nextInt()];
        System.out.println("Escribe el tamaño del vector 2");
        int v2[] = new int[teclado.nextInt()];

        for (int i = 0; i < v1.length; i++) {
            System.out.println("Escribe los valores del primer vector");
            v1[i] = teclado.nextInt();

        }
        for (int i = 0; i < v2.length; i++) {
            System.out.println("Escribe los valores del vector 2");
            v2[i] = teclado.nextInt();

        }
        System.out.println(Arrays.toString(v1));
        System.out.println(Arrays.toString(v2));

    }


}

