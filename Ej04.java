package com.company;

import java.util.Arrays;

public class Ej04 {
    public static void main(String[] args) {

        int[][] v = new int[4][4];
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                v[i][j] = (int) (Math.random() * (200 - 100));


            }

            System.out.println(Arrays.toString(v[i]));

        }
        System.out.println(Arrays.toString(eliminarFilasPares(v)));
        System.out.println(Arrays.toString(eliminarFilasImpares(v)));
    }

    public static int[][] eliminarFilasPares(int[][] vp) {
        int[][] f = new int[0][0];
        for (int i = 0; i < vp.length; i++) {
            for (int j = 0; j < vp[i].length; j++) {

            }
            if (vp.length % 2 != 0) {
                vp[i] = f[i];
            }

        }
        return vp;
    }

    public static int[][] eliminarFilasImpares(int[][] vi) {
        int[][] f1 = new int[0][0];
        for (int i = 0; i < vi.length; i++) {
            for (int j = 0; j < vi[i].length; j++) {

            }
            if (vi.length % 2 != 1) {
                vi[i] = f1[i];
            }

        }
        return vi;
    }
}