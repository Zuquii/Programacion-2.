/* • Implementar un programa que tome tres números enteros y
determine cuál es el mayor.
*/

import java.util.Scanner;
class tresEnterosMayor{

public static void main (String args[]) { 
    Scanner sc = new Scanner(System.in);
	int a;
	int b;
	int c; 
	System.out.print("Introduzca 3 numeros enteros:");
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	if (a > b && a > c){
		System.out.println ("A es el mayor");
    } else if (b > a && b > c) {
		System.out.println ("B es el mayor");
    } else if (c > a && c > b) {
		System.out.println ("C es el mayor");
	} else {
		System.out.println ("Los 3 numeros ingresados son iguales");
	}	
}
}
