package Funciones;

public class ejercicio15 {

    public static void main(String[] args) {
        /* MUERSTRAME LOS NUMEROS PRIMOS ENTRE 1 Y 1000 */

        System.out.println("Aqui tienes todos los numeros primos entre 1 y 1000");
        for (int x = 0; x <= 1000; x++) {
            if (esprimo(x))
                System.out.println(x);

        }

    }

    public static boolean esprimo(int x) {
        boolean esprimo = true;

        for (int y = 2; y < x; y++) {
            if (x % y == 0)
                esprimo = false;
        }

        return esprimo;
    }

}