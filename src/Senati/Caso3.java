package Senati;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Ingrese numero: ");
		int num = scn.nextInt();
		
		int i = 1, fact = 1;
		
		while (i <= num) {
			if(i<num)
			System.out.print(i + " * ");
			
			fact *= i;
			
			if (i == num)
				System.out.print(i + " = " + fact);
			
			i++;
		}
		System.out.println("\nResultados");
		System.out.println("==========");
		System.out.println("El factoria de " + num + " es " + fact);
	}

}
