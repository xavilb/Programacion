package com.company;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Indica el tamaño del array bidimensional");
        num = teclado.nextInt();
        int[][] v1 = new int[num][num];

        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v1[i].length; j++) {
                v1[i][j] = (int) (Math.random() * (200 - 100) + 100);
            }
            System.out.println(Arrays.toString(v1[i]));

        }

        System.out.println(numPicos(v1));
    }

    public static int numPicos(int[][] v) {
        int numCeldas = 0;
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {


            }

        }
        return numCeldas;
    }


}
