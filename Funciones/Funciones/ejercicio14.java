package Funciones;

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        //Se proporcionaran dos numeros con los cuales se formaran uno solo
        Scanner teclado = new Scanner(System.in);

        System.out.println("Se proporcionaran dos numeros con los cuales se formaran uno solo");
        System.out.println("***********");
        double num1, num2;
        System.out.println("Dame el primer numero");
        num1 = teclado.nextDouble();
        System.out.println("Dame el segundo numero");
        num2 = teclado.nextDouble();

        System.out.println("El numero resultante final es: " + (num1 + num2));

        teclado.close();


    }

}