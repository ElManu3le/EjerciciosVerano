package EjerciciosCadenas;

import java.util.Scanner;

public class cadena2 {
	public static void main(String[] args) {

		int t, contmay = 0, contmin = 0;
		System.out.println("Dime una frase");
		String frase, MAY = "", MIN = "";
		Scanner teclado = new Scanner(System.in);
		frase = teclado.nextLine();

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

		}

		System.out.println("el numero de mayusculas es:  " + contmay);
		System.out.println("el numero de minusculas es:  " + contmin);
		System.out.println("las mayusculas son:  " + MAY);
		System.out.println("las minusculas son:  " + MIN);

	}

}