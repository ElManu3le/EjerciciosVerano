package EjerciciosCadenas;

import java.util.Scanner;

public class cadena5 {
    public static void main(String[] args) {

        /* */
        int contador;
        String frase, lapar = "", laimpar = "";
        Scanner teclado = new Scanner(System.in);

        
            System.out.println("Dime una frase de maximo 80 caracteres: ");
            frase = teclado.nextLine();

            for (contador = 0; contador < frase.length(); contador++) {
                if (contador % 2 == 0) {
                    lapar = lapar + frase.charAt(contador);

                } else {
                    laimpar = laimpar + frase.charAt(contador);
                }teclado.close();
            }

        

        System.out.println(laimpar);
        System.out.println(lapar);

    }

}