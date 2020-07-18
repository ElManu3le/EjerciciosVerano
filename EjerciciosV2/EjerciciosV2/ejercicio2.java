package EjerciciosV2;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        int NA, NB;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el número A");
        NA=teclado.nextInt();
        System.out.println("Introduzca el número B");
        NB=teclado.nextInt();

        if(NA>NB){
            System.out.println("El número A es el máximo");
        }else{
            System.out.println("B es el valor máximo ");
        }

        


        
    }
    
}