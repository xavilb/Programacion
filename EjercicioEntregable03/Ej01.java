package EjercicioEntregableTema3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] v1 = {1, 5, 7, 6, 3, 5, 8};
        int[] v2 = {3, 4, 2, 6, 8, 12, 14};
        int[] v3 = new int[0];
        System.out.println(Arrays.toString(v1));
        System.out.println(Arrays.toString(v2));
    }

    public static int[] intersecciónVectores(int[] v1, int[] v2, int[] resultado, int mayor) {
        for (int i = 0; i < mayor; i++) {
            for (int j = 0; j < mayor; j++) {
                if (v1[i] == v2[i]) {

                    resultado = Arrays.copyOf(resultado, resultado.length + 1);
                    resultado[i] = v1[i];
                }
            }

        }

        return resultado;
    }
}