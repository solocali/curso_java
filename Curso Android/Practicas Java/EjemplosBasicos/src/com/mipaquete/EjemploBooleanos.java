package com.mipaquete;

public class EjemploBooleanos {

	public static void funcionPrincipal() {
		System.out.println( " Ejemplos booleanos");
		
		
		int a = 3;
		int b = 3;
		operacionesComparacion (a, b);
	}
	public static void operacionesComparacion (int a, int b ) {
		if (a == b) {
			System.out.println( "Son iguales");
	}
		if (a < b)
			System.out.println(a + " menor que " + b);
		if (a > b)
			System.out.println(a + " mayor que " + b);
		if (a <= b)
			System.out.println(a + " menor o igual que " + b);
		if (a >= b)
			System.out.println(a + " mayor o igual que " + b);
		if (a != b)
			System.out.println(a + " distinto que " + b);
	}
		

}
