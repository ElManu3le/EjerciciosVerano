package EjerciciosCadenas;

import java.util.Scanner;

public class cadena4 {

    public static void main(String[] args) {

        String frase, ComeBack;
        int opcion = 0;

        Scanner teclado = new Scanner(System.in);

        do {

            System.out.println("Escribe una frase de máximo 80 caracteres");
            frase = teclado.nextLine();

            System.out.println("1.- Pasar la frase a mayusculas-->");

            System.out.println("2.- Pasar la frase a minusculas-->");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    ComeBack = frase.toUpperCase();
                    System.out.println(ComeBack);
                    break;
                case 2:
                    ComeBack = frase.toLowerCase();
                    System.out.println(ComeBack);
                    break;
                default:
                    System.out.println("Introduzca un caso valido, entre 1 y 2");

            }

        } while (opcion != 0);
        teclado.close();

    }

}