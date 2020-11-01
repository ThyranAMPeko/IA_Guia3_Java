package Senati;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		String continuar = "s", may_nombre = "", men_nombre = "", emp_min = "";
		float mayor = 0, menor = 999999, promedio = 0, sueldo_bruto = 0, bonificacion = 0, descuento = 0, sueldo_neto = 0, alcanzado = 0, mayor_min = 0;
		int num_reg = 0, meta = 0;
		
		while(continuar.equals("S") || continuar.equals("s")){
			num_reg++;
			System.out.println("==========================");
			System.out.println("Registro de empleados (" + num_reg + "): ");
			System.out.println("==========================");
			
			System.out.print("Empleado: ");
			String empleado = scn.nextLine();
			System.out.print("Horas trabajadas: ");
			float ho_tra = scn.nextInt();
			System.out.print("Tarifa por hora: ");
			float tar_ho = scn.nextInt();
			System.out.print("Minutos de tardanza: ");
			float min_tar = scn.nextInt();
			
			
			sueldo_bruto = ho_tra * tar_ho;
			
			if (ho_tra <= 50)
				bonificacion = 0.0f;
			else if (ho_tra > 50 && ho_tra <= 60)
				bonificacion = sueldo_bruto * 0.02f;
			else if (ho_tra > 60 && ho_tra <= 70)
				bonificacion = sueldo_bruto * 0.08f;
			else if (ho_tra > 70 && ho_tra <= 80)
				bonificacion = sueldo_bruto * 0.13f;
			else if (ho_tra > 80)
				bonificacion = sueldo_bruto * 0.15f;
			
			if (min_tar <= 15)
				descuento = 0.0f;
			else if (min_tar > 15 && min_tar <= 30)
				descuento = (sueldo_bruto * 0.3f / 100) * min_tar;
			else if (min_tar < 30)
				descuento = (sueldo_bruto * 0.5f / 100) * min_tar;
			
			sueldo_neto = (sueldo_bruto + bonificacion) - descuento;
			
			alcanzado = ho_tra / 80 * 100;
			
			System.out.println("\n=====================");
			System.out.println("-------RESULTADOS------");
			System.out.println("====================");
			System.out.println("Sueldo bruto..: S/. " + df.format(sueldo_bruto)); 
			System.out.println("Bonificacion..: S/. " + df.format(bonificacion));	
			System.out.println("Descuento.....: S/. " + df.format(descuento));
			System.out.println("Sueldo neto...: S/. " + sueldo_neto);
			System.out.println("% Alcanzado...:     " + df.format(alcanzado) + " %");
			
			if (sueldo_neto > mayor ){ mayor = sueldo_neto; may_nombre = empleado;}
			
			if (sueldo_neto < menor ){ menor = sueldo_neto; men_nombre = empleado;}
				
			if (min_tar > mayor_min ){mayor_min = min_tar; emp_min = empleado;}
			
			if (alcanzado >= 90) meta++;
			
			scn.nextLine();
			
			System.out.print("\n¿Nuevo empleado? [S | N]: ");
			continuar = scn.nextLine();
		}
		
			System.out.println("\n=====================");
			System.out.println("-------RESUMEN------");
			System.out.println("====================");
			System.out.println("Numero de empelados: " + num_reg);
			System.out.println("Sueldo neto mayor: "  + df.format(mayor) + " le pertenece a " + may_nombre);	
			System.out.println("Sueldo neto menor: " + df.format(menor) + " le pertenece a " + men_nombre);	
			System.out.println("Empleado con la mayor cantidad de minutos de tardanza: " + emp_min + "(" + mayor_min + " min.)");
			System.out.println("Cantidad de empleados con mas del 90% de la meta: " + meta); 

	}

}
