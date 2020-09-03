package EjerciciosCadenas;

import java.util.Scanner;

public class cadena7 {

    public static void main(String[] args) {
        /* */

        int t, Minuscount = 0, Maycont = 0, Numscount = 0;
        String frase;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribeme una frase de maximo 80 caracteres, puedes incluir números a la frase");
        frase = teclado.nextLine();

        for (t = 0; t < frase.length(); t++) {
            char cl = frase.charAt(t);

            if ((cl > 64) && (cl < 89)) {
                Maycont++;

            }
            if ((cl > 96) && (cl < 123)) {
                Minuscount++;

            }
            if ((cl > 47) && (cl < 58)) {
                Numscount++;

            }teclado.close();

        }

        System.out.println("Tiene " + Maycont + " Mayusculas");
        System.out.println("Tiene " + Minuscount + " Minusculas");
        System.out.println("Tiene " + Numscount + " Numeros");

    }

}