package Funciones;

import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {
		//Decir si un número es capicua
		int numero, faltante, Invertido, restante;

		Scanner num = new Scanner(System.in);

		System.out.println("\n Dime un numero:\n");
		numero = num.nextInt();

		faltante = numero;
		Invertido = 0;
		restante = 0;

		while (faltante != 0) {

			restante = faltante % 10;
			Invertido = Invertido * 10 + restante;
			faltante = faltante / 10;

		}

		if (Invertido == numero) {

			System.out.println("\n El numero es capicua\n");

		} else {

			System.out.println("\n El numero no es capicua\n");

		}num.close();

	}

}