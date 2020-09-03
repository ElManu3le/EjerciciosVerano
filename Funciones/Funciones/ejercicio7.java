package Funciones;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        // Devuelve el digito en la posicion N de un numero entero,
        // este empieza a contar desde 0 y de izq a derecha

        Scanner teclado = new Scanner(System.in);

        int num, position;

        System.out.println("Dimi un numero entero positivo");
        num = teclado.nextInt();
        System.out.println("Dime la posicion del numero");
        position = teclado.nextInt();

        String numero = String.valueOf(num);

        String s2 = numero.substring(position - 1, position);
        System.out.println("La posición " + position + " del numero " + num + " es: " + s2);

        teclado.close();
    }

}