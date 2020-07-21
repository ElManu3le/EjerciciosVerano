package EjerciciosCadenas;

import java.util.Scanner;

public class cadena2 {
	public static void main(String[] args) {
		/*
		 * Dada una frase de no más de 80 caracteres hacer un programa que busque
		 * cuántas mayúsculas y minúsculas tiene y lo imprima
		 */

		int t, contmay = 0, contmin = 0;
		System.out.println("Dime una frase");
		String frase, MAY = "", MIN = "";
		Scanner teclado = new Scanner(System.in);
		frase = teclado.nextLine();

		do {
			for (t = 0; t < frase.length(); t++) {
				char cl = frase.charAt(t);

				if ((cl > 64) && (cl < 91)) {
					MAY = MAY + cl;
					contmay++;
				}
				if ((cl > 96) && (cl < 122)) {
					MIN = MIN + cl;
					contmin++;
				}
				teclado.close();

			}

		} while (frase.length() < 80);

		System.out.println("el numero de mayusculas es:  " + contmay);
		System.out.println("el numero de minusculas es:  " + contmin);
		System.out.println("las mayusculas son:  " + MAY);
		System.out.println("las minusculas son:  " + MIN);

	}

}