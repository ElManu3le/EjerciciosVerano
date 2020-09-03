package Funciones;

import java.util.Scanner;

public class ejercicio16 {

    public static void main(String[] args) {
        // Muestra todos los números capicua entre 1 a 999

        int numero, faltante, Invertido, restante;

        Scanner num = new Scanner(System.in);

        numero = num.nextInt();
        
        faltante = numero;
        Invertido = 0;
        restante = 0;

        while (faltante != 0) {

            restante = faltante % 10;
            Invertido = Invertido * 10 + restante;
            faltante = faltante / 10;

        }

        for (int x = 0; x < 999; x++) {
            if (Invertido == numero) {

                System.out.println(numero);

            }

        }num.close();
    }

}