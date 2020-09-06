package Funciones;
import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        //Le da la vuelta a un numero entero

        int numero, faltante, invertido, restante;

		Scanner teclado = new Scanner(System.in);

		System.out.println("\n Dime un numero:\n");
		numero = teclado.nextInt();

		faltante = numero;
		invertido = 0;
		restante = 0;

		while (faltante != 0) {

			restante = faltante % 10;
			invertido = invertido * 10 + restante;
			faltante = faltante / 10;

        } 
		System.out.println(invertido);
		teclado.close();

        
            

    }
    
}