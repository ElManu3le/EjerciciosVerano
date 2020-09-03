package Funciones;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        // Devolver la potencia ya dado enteriormente el exponente y la base
        Scanner teclado = new Scanner(System.in);

        int exponente, base;
        System.out.print("Introduce una base exponencial: ");
        base = teclado.nextInt();
        System.out.print("Introduce el exponente de la base dada:");
        exponente = teclado.nextInt();

        System.out.println(
                "La potencia de la base: " + base + " elevada a: " + exponente + " es: " + Math.pow(base, exponente));
        teclado.close();
    } 

}