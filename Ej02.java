package com.company;

import java.util.Arrays;

public class Ej02 {
    public static void main(String[] args) {

        int v[] = {1, 2, 3, 4, 5};


        System.out.println(Arrays.toString(InsertarValor(v, 8, 3)));
    }

    public static int[] InsertarValor(int[] v1, int valor, int pos) {
        int[] v2 = new int[v1.length + 1];
        for (int i = 0; i < v1.length; i++) {
            v2[i] = v1[i];

            if (pos + 1 == v1[i]) {

                v2[i] = valor;

            }


        }


        return v2;
    }
}
