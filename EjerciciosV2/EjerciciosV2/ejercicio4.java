package EjerciciosV2;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        // Realizar una función que calcule (muestre en pantalla) el área o el volumen
        // de un cilindro, según se especifique.
        // Para distinguir un caso de otro se le pasará el carácter 'a' (para área) o
        // 'v' (para el volumen). Además hemos de pasarle a la función el radio y la
        // altura.

        int opcion, radio, altura, base;
        double pi = 3.14;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el radio de nuestra figura");
        radio = teclado.nextInt();
        System.out.println("Introduzca la altura de nuestra figura");
        altura = teclado.nextInt();
        System.out.println("Introduzca la base de nuestra figura");
        base = teclado.nextInt();

        System.out.println("Para el area del cilindro pulse 1, si no, otro número distinto");
        opcion = teclado.nextInt();

        if (opcion == 1) {
            System.out.println("El area de nuestro cilindro es: " + (2*pi*base*altura)+(2*pi*radio*radio));

        } else {
            System.out.println("El volumen del cilindro es: " + pi*radio*radio*altura);
        }

    }

}