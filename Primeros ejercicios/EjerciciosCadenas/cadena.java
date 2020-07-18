package EjerciciosCadenas;

import java.util.Scanner;

public class cadena {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe una fase de maximo 80 caracteres");
        String cadena = "";
        cadena = teclado.nextLine();
        String letras = "";

        if ((cadena.length() != 0) || (cadena.length() > 80)) {
            for (int x = 1; x <= cadena.length(); x++) {
                char cl = cadena.charAt(x);
                if ((cl > 64) && (cl < 91)) {
                    letras = letras + cl;
                }
                if ((cl > 96) && (cl < 122)) {
                    letras = letras + cl;
                }

            }
            System.out.println("La cadena escrita tiene" + cadena.length() + "caracteres");
            System.out.println(letras);

        } else {
            System.out.println("vuelve a escribir la frase");

        }

    }

}