package Funciones;

//import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        // ***Decir si un número es primo***

        // Scanner teclado = new Scanner(System.in);
        System.out.println("Diga un numero entero");
        int n = Integer.parseInt(System.console().readLine());
        // int n = teclado.nextInt();

        if (esPrimo(n)) {
            System.out.println("Es primo");

        } else {
            System.out.println("no lo es");
        }

    }

    public static boolean esPrimo(int x) {
        for (int i = 2; i < x; i++) {
            if ((x % i) == 0)
                return false;

        }
        return true;
    }

}
