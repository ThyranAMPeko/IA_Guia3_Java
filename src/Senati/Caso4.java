package Senati;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = 0, i = 1, mayor = 0;
		
		while (i <= 4) {
			System.out.print("Ingrese numero " + i + ": ");
			n = scn.nextInt();
			
			if (n > mayor) mayor = n;
			i++;
		}
		System.out.println("\nResultados");
		System.out.println("==========");
		System.out.println("El numero mayor es: " + mayor);

	}

}
