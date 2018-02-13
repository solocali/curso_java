package com.un_paquete;

public class EjemploArray_A {
	
	public static void main (String [] args) {

		int[] arrayEnteros = new int  [10];
		
		//Bucle for (Inicializacion condicion; iteracion)
		
		
		for (int i = 0; i < arrayEnteros.length; i ++) { // i = i + 1
			arrayEnteros[i]= i* i;
			System.out.println(" array(" + i +") = " + arrayEnteros[i]);
			
		}
				
		float[] decimales = new float [3];
		for (int j = 0; j< decimales.length; j++) {
			decimales[j] = (float) j /3f;
			System.out.println( " El tercio de " + j + " es " + decimales [j]);
		}
		
		int otroArray[] = { 5, 10, 20, 25 };
		for (int elemento : otroArray) {
			System.out.println(" Elemento = " + elemento);
		}
		
		// Array para los dias de la semana
		
		String[] dias  = { "l","m","x","j","v","s","d",} ;
		for (String dia : dias)
			System.out.println(" Dia =" + dia);
		}
	
	}

