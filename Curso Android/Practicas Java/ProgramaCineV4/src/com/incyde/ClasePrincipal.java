package com.incyde;

import java.util.Scanner;

public class ClasePrincipal {

	static float capital;
	static float precio = 7.5f;
	static int horaIda;
	static int horaSesion_1 = 7;
	static int horaSesion_2 = 9;
	static int horarioRecomendado;
	static Scanner teclado;
	static int siSalir;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean resultadoCine;
		String siContinuar;
		teclado = new Scanner (System.in);
		System.out.println("ProgramaCineV4");
		
	do {
		pedirDatosDinero();
		pedirDatosHora();	
		resultadoCine = irAlCine();
		mostrarResultado(resultadoCine);
		System.out.println(" Desea continuar? (s/n) ");
		teclado.nextLine();
		siContinuar = teclado.nextLine();
	} while (siContinuar.equals("s") || siContinuar.equals("S"));
	teclado.close();
	System.out.println(" Fin del programa ");

	}
	// teclado.close();

	public static void pedirDatosDinero() {
		System.out.println(" Introduzca dinero ");
		capital = teclado.nextFloat();}
		
	public static void pedirDatosHora() {
		System.out.println(" Introduzca la hora de ida ");
		horaIda = teclado.nextInt();
		
	}


	public static boolean irAlCine () {

		/*
		 * if((capital >= precio ) && ( (horaIda >= horaSesion_1 - 1 && horaIda <=
		 * horaSesion_1) ||(horaIda >= horaSesion_2 - 1 && horaIda <= horaSesion_2))) {
		 * return true ; }
		 */

		if (capital >= precio) {
			if (horaIda >= horaSesion_1 - 1 && horaIda <= horaSesion_1) {
				horarioRecomendado = horaSesion_1;
				return true;
			}

			else if (horaIda >= horaSesion_2 - 1 && horaIda <= horaSesion_2) {
				horarioRecomendado = horaSesion_2;
				return true;

			}

		}
		return false;
	}

	public static void mostrarResultado(boolean resultado) {
		System.out.println(" La hora recomendada es " + horarioRecomendado);
		if (resultado == true) {
			System.out.println(" SI que podemos ir al cine ");
		} else {
			if (capital < precio)
				System.out.println( " NO podemos ir al cine porque la entrada vale mucho");
				System.out.println(" NO podemos ir al cine ");	
		}

	}

}
