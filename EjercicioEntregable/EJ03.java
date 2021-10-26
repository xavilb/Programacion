package Ejercicio_Entregable;

import java.util.Scanner;

public class EJ03 {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        int entradas;
        float precio;
        float pb = 8;
        final int PAREJAS = 11;
        final int d = 11;
        final float TARJETA = 10 / 100;

        String jueves = new String("Jueves");
        String s = new String("s");
        System.out.println();

        System.out.println("Venta de entradas CineCampa");
        System.out.println("Número de entradas: ");
        entradas = teclado.nextInt();
        float preciototal = entradas * pb;
        System.out.println("Día de la semana");
        teclado.nextLine();
        jueves = teclado.nextLine();
        System.out.println("¿Tiene tarjeta CineCampa?(s/n)");
        s = teclado.nextLine();
        System.out.println("Aquí tienes sus entradas. Gracias por su compra.");


        if (jueves.equals("Miércoles")) {
            pb = 5;
            System.out.println("Entradas individuales " + entradas);
            System.out.println("Precio por entrada individual es " + entradas);
            System.out.println("Total" + pb * entradas);
            preciototal = pb * entradas;

        } else if (jueves.equals("Jueves") && entradas % 2 == 0) {
            pb = 11;
            System.out.println("Entradas de parejas "+entradas);
            System.out.println("Precio por entrada de pareja "+pb);
            System.out.println("Total " +preciototal);
            preciototal = pb * entradas;

        } else {
            System.out.println("El precio individual es de 8");
        }
        if (s.equals("s")) {
            System.out.println("Descuento " + TARJETA);
            System.out.println("A pagar" + pb * TARJETA);

        }else{
            System.out.println("Descuento 0.0");
            System.out.println("A pagar "+ preciototal);
        }
    }
}
