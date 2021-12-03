package EjercicioEntregableTema3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tam;
        int max = 18;
        int min = 65;
        int suma = 0;
        int a = 0;


        System.out.println("Introduce el tamaño del array bidimensional");
        tam = teclado.nextInt();
        int[][] v1 = new int[tam][tam];
        int[] diagonal = new int[tam];

        if (tam > 1) {
            for (int i = 0; i < v1.length; i++) {
                for (int j = 0; j < v1[i].length; j++) {
                    v1[i][j] = (int) (Math.random() * (65 - 18) + 18);

                    if (i == j) {

                        diagonal[i] = v1[i][j];

                        if (v1[i][j] <= min) {
                            min = v1[i][j];
                        }

                        if (v1[i][j] >= max) {
                            max = v1[i][j];
                        }

                        suma += v1[i][j];
                        a++;
                    }
                }
                System.out.println(Arrays.toString(v1[i]));
            }
            double media = suma / a;

            System.out.println(Arrays.toString(diagonal));
            System.out.println("El min valor es: " + min);
            System.out.println("El máximo valor es:" + max);
            System.out.println("La media es: " + media);
        } else {
            System.out.println("Introduce un número válido (que sea mayor que uno)");
        }
    }
}