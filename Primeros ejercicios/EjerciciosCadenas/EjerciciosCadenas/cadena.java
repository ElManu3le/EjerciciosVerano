package EjerciciosCadenas;

import java.util.Scanner;

public class cadena {
    /*
     * Leer una frase de máximo 80 caracteres y escribirla progresivamente es decir
     * si la frase es: “ciervo”, el programa debe imprimir: c ci cie cier cierv
     * ciervo
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena = "";

        do {
            System.out.println("Escribe una fase de maximo 80 caracteres");

            cadena = teclado.nextLine();

        } while (cadena.length() > 80);

        for (int x = 1; x <= cadena.length(); x++) {

            System.out.println(cadena.substring(0, x));

        }
        teclado.close();

    }

}