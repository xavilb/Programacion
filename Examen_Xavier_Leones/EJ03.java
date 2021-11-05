package com.company;

import java.util.Scanner;

public class EJ03 {
    public static void main(String[] args) {
        int inicio=2;
        int numAleatorio= (int)(Math.random()*11);

        Scanner teclado = new Scanner(System.in);
        System.out.println("Palo -"+Math.random());
        System.out.println("Carta: "+numAleatorio);
    }
}
