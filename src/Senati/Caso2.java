package Senati;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Ingrese numero: ");
		int n = scn.nextInt();
		
		int i = 1, suma = 0;
		
		while (i <= n) {
			if(i<n)
			System.out.print(i + " + ");
			
			suma += i;
			
			if (i == n)
				System.out.print(i + " = " + suma);
				
			i++;
		}
		System.out.println("\nResultados");
		System.out.println("==========");
		System.out.println("La sumatoria de " + n + " es " + suma);
	}

}
