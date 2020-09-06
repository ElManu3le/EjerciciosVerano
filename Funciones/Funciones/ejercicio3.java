package Funciones;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        // Devuelve un numero menor primo que es mayor al numero que se pasa como
        // parametro
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero y te dire su numero primo más cercano");

        int num, x;
        num = teclado.nextInt();

        x = num;

        while (esprimo(x) != true) {// mientras sea distinto a true. 
            //cuando se encuentre al primo saldra.
            x++;

        }
        System.out.println("El número primo más cercano a: " + num + " es " + x);
        teclado.close();
    }

    public static boolean esprimo(int x) {
        boolean esprimo = true;

        for (int y = 2; y < x; y++) {
            if (x % y == 0)
                esprimo = false;
        }

        return esprimo;
    }

}