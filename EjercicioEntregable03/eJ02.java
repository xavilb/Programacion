package EjercicioEntregableTema3;

public class eJ02 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < cuadrado.length; i++) {
            numero[i] = (int) (Math.random() * 101);
        }
        for (int i = 0; i < cuadrado.length; i++) {
            cuadrado[i] = numero[i] * 2;
        }
        for (int i = 0; i < cuadrado.length; i++) {
            cubo[i] = numero[i] * numero[i] * numero[i];
        }
        for (int i = 0; i < cuadrado.length; i++) {
            System.out.print(numero[i] + " ");
            System.out.print(cuadrado[i] + " ");
            System.out.print(cubo[i] + " ");
            System.out.println();


        }
    }
}
