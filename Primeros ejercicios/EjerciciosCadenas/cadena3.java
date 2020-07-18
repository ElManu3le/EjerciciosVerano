package EjerciciosCadenas;

import java.util.Scanner;

public class cadena3 {

    public static void main(String[] args) {

        // System.out.println("Dime una frase para leer: ");
        
        String frase, palabra_encontrar;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba una frase");
        frase=teclado.nextLine();
        System.out.println("dime una palabra que pueda estar en la frase: ");
        palabra_encontrar = teclado.nextLine();

       if(frase.indexOf(palabra_encontrar)!=0){
        System.out.println("La palabra ocupa el rango de caracteres: "+(frase.indexOf(palabra_encontrar)+1)+"-"
        + (frase.indexOf(palabra_encontrar)+palabra_encontrar.length()) );

        //Fallo a la hora de mostrar un mensaje de no encontrada la palabra en el texto.
       }else{
           System.out.println("Palabra no encontrada.");
       }
       

    }

}