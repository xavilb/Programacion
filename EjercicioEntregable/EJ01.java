package Ejercicio_Entregable;

import java.util.Scanner;

public class EJ01 {
    public static void main(String[] args) {


   Scanner teclado = new Scanner(System.in);
    int altura;
    int anchura;
    int espacio =0;
            System.out.println("Escribe la altura de la Z");
    altura=teclado.nextInt();
    anchura=altura;
            do {
                System.out.println("Dame un valor correcto");
        for (int i = 1; i < anchura; i++) {
            System.out.print("*");


        }   for (int j = 0; j < altura-1; j++) {

            System.out.println("*");
        }
        for (int k = 0; k < anchura; k++) {
            System.out.print("*");
        }
    }while (altura==3);

}
}




