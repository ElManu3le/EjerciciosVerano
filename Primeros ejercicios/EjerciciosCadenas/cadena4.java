package EjerciciosCadenas;

import java.util.Scanner;

public class cadena4 {

    public static void main(String[] args) {

        String frase, ComeBack;
        int opcion = 0;

        do {

            System.out.println("Escribe una frase de máximo 80 caracteres");

            Scanner teclado = new Scanner(System.in);
            frase = teclado.nextLine();

            System.out.println("1.- Pasar la frase a mayusculas-->");

            System.out.println("2.- Pasar la frase a minusculas-->");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    ComeBack = frase.toUpperCase();
                    System.out.println(ComeBack);
                    break;
                case 2:
                    ComeBack = frase.toLowerCase();
                    System.out.println(ComeBack);
                    break;

            }

        } while (opcion != 0);

        // toUpperCase()
    }

}