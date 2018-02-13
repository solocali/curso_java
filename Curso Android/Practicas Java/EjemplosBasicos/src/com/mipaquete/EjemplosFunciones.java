package com.mipaquete;

public class EjemplosFunciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("V3 - Programa cine");
			//Empezando
			int x = 8;
			int y = 10;
			int resultadoSuma = sumarNumeros(x, y);
			int resultadoResta = restarNumeros (x,y);
			int resultadoCuadrado = multiplicarNumeros (x);
			int resultadoCubo = elevarNumeros (y);
			System.out.println("Resultado = " + resultadoSuma);
			System.out.println("Resultado = " + resultadoResta);
			System.out.println("Resultado = " + resultadoCuadrado);
			System.out.println("Resultado = " + multiplicarNumeros (y));
			System.out.println("Resultado = " + resultadoCubo);
			System.out.println("Resultado = " + elevarNumeros (x));
			System.out.println("Resultado cubo = " + alCubo(3)) ;
			
		}
		public static double alCubo (int parametro) {	
			double result = Math.pow(parametro, 3);
			return result;	}
		public static int elevarNumeros (int valor_2) {
			return valor_2 * valor_2 *valor_2;
		}
		public static int multiplicarNumeros (int valor_1) {
			return valor_1 * valor_1;
		}
		public static int sumarNumeros (int valor_1, int valor_2) {
			return valor_1 + valor_2;
			
		}
		public static int restarNumeros (int valor_1, int valor_2) {
			return valor_1 - valor_2;
		}

}
