package Senati;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = 0, i = 1, menor = 999;
		
		while (i <= 4) {
			System.out.print("Ingrese numero " + i + ": ");
			n = scn.nextInt();
			
			if (n < menor) menor = n;
			i++;
		}
		System.out.println("\nResultados");
		System.out.println("==========");
		System.out.println("El numero menor es: " + menor);

	}

}
