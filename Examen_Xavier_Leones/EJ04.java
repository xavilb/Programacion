package com.company;

import java.util.Scanner;

public class EJ04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double cm;
        double anchura;
        String n;
        float precioBase = 0.1f;
        double escudoBordado = 2.50;
        double gastosEnvío = 3.25;
        System.out.print("Introduzca la altura de la bandera en cm: ");
        cm = teclado.nextDouble();
        System.out.print("Ahora introduzca la anchura: ");
        anchura = teclado.nextDouble();
        System.out.print("¿Quiere escudo bordado? (s/n): ");
        teclado.nextLine();
        n = teclado.nextLine();
        System.out.println("Gracias. Aquí tiene el desglose de su compra");
        double cm2 = (cm * anchura) / 100;
        double total1 = cm2 + gastosEnvío;
        double total2 = cm2 + gastosEnvío + escudoBordado;

        if (n.equals("n")) {
            System.out.println("Bandera de " + cm * anchura + " cm2: " + cm2 + "€");
            System.out.println("Sin escudo: 0,00€");
            System.out.println("Gastos de envío: 3,25€");
            System.out.println("Total: " + total1 + "€");
        } else {
            System.out.println("Bandera de " + cm * anchura + " cm2" + (cm * anchura) / 100);
            System.out.println("Con escudo: " + escudoBordado + "€");
            System.out.println("Gastos de envío: 3,25€");
            System.out.println("Total: " + total2 + "€");

        }
    }
}
