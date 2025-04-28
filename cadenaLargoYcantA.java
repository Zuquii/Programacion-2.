/* • Dada una cadena ingresada por teclado, indicar el largo y
cantidad de veces que aparece la letra ‘a’ en la misma.
*/

import java.util.Scanner;

public class cadenaLargoYcantA {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena de caracteres: ");
        String cadena = sc.nextLine();

        System.out.println("El largo de la cadena es: " + cadena.length());

        int cantidad = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a') {
                cantidad += 1;
            }
        }

        System.out.print("La letra 'a' aparece " + cantidad + " de veces.");
    }
}
