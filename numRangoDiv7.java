Dado un número entero, verificar si está en el rango de 100 a
200 y si es divisible por 7.
*/

import java.util.Scanner;
class numRangoDiv7{

public static void main (String args[]) { 
    Scanner sc = new Scanner(System.in);
	
    System.out.print("Introduzca un número entero que este en el rango de 100 a 200: ");
    int n = sc.nextInt();
	
	if (n > 100 && n < 200 && n % 7 == 0){
		System.out.println ("El numero esta entre 100 y 200 y es divisible por 7.");
	}
	else {
		System.out.println ("No cumple con alguna de las condiciones");
	}
}	
}
