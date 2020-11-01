package Senati;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		String continuar = "s", may_nombre = "", men_nombre = "";
		float mayor = 0, menor = 999, promedio = 0;
		int num_reg = 0, con_cer = 0, sin_cer = 0;
		
		while(continuar.equals("S") || continuar.equals("s")){
			num_reg++;
			System.out.println("\n===========");
			System.out.println("Registro " + num_reg + ": ");
			System.out.println("===========");
			
			System.out.print("Nombre de alumno: ");
			String nombre = scn.nextLine();
			System.out.print("Nota 1: ");
			float n1 = scn.nextInt();
			System.out.print("Nota 2: ");
			float n2 = scn.nextInt();
			System.out.print("Nota 3: ");
			float n3 = scn.nextInt();
			System.out.print("Asistencia [1-12]: ");
			float asistencia = scn.nextFloat();
			
			float por1 = n1 * (float)0.2;
			float por2 = n2 * (float)0.3;
			float por3 = n3 * (float)0.5;
			
			promedio = (por1 + por2 + por3);
			
			float asist  = (float)(asistencia / 12 * 100);
			
			String est = "";
			
			if (promedio >= 13 && asist >= 70) {
				est = "Obtiene certificado";
				con_cer++;
			}
			else {
				est = "Sin certificado";
				sin_cer++;
			}
			System.out.println("\n=====================");
			System.out.println("-------RESULTADOS------");
			System.out.println("====================");
			System.out.println("Promedio: " + df.format(promedio)); 
			System.out.println("Asistencia: " + df.format(asist) + " %");	
			System.out.println("Resultados: " + est);	
			
			if (promedio > mayor ){ mayor = promedio; may_nombre = nombre;}
			
			if (promedio < menor ){ menor = promedio; men_nombre = nombre;}
				
			scn.nextLine();
			
			System.out.print("\n"
					+ "¿Registrar otro? [S | N]: ");
			continuar = scn.nextLine();
		}
		
			System.out.println("\n=====================");
			System.out.println("-------RESUMEN------");
			System.out.println("====================");
			System.out.println("Numero de alumnos: " + num_reg);
			System.out.println("Mayor promedio: "  + df.format(mayor) + " le pertenece a " + may_nombre);	
			System.out.println("Menor promedio: " + df.format(menor) + " le pertenece a " + men_nombre);	
			System.out.println("Numero de alumnos certificados: " + con_cer );
			System.out.println("Numero de alumnos sin certificados: " + sin_cer); 
	}

}
