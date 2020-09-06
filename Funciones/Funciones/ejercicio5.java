package Funciones;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        // Cuenta el numero de digitos de un numero entero
        Scanner teclado = new Scanner(System.in);

        int num, conter = 0;
        System.out.println("Dimi un numero entero positivo");
        num = teclado.nextInt();

        while (num != 0) {
            num = num / 10;
            conter++;

        }
        System.out.println("El numero tiene: " + conter + " cifras");

        teclado.close();
    }

}