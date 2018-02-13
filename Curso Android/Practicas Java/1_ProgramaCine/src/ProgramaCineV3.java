/* Programa cine:
 * Pelicula interesante, dinero, horario, lugar,, compañia,transporte
 */
import java.util.Scanner;

public class ProgramaCineV3 {
	public static void main(String[] args) {
		boolean siIrAlCine = false;
		boolean posibilidadHoraria = false;
		double precioEntrada = 7.50;
		int horaUsuario = 0;
		int horaCine_1 = 19;
		int horaCine_2 = 22;
		
		// Peticion de datos
		System.out.println( " Introduzca su nombre" );
		
		Scanner escaner = new Scanner (System.in);
		String nombre = escaner.nextLine();
		System.out.println( " El nombre es " + nombre + " ;introduzca capital ");
		double capital = escaner.nextDouble();
		
		System.out.println(" Introduzca la hora a la que puede ir ");
		horaUsuario = escaner.nextInt();
		
		
		siIrAlCine = siTenemosCapital(precioEntrada, capital);
		
		if (siIrAlCine ) 
			
			System.out.println( " No podemos ir al cine ");
		else {
			System.out.println( " Si podemos ir al cine");
		
		escaner.close(); }	
		
		if (capital < precioEntrada) {
			return false;
		}else {
			return false;
			
		} 
		static double  siTenemosCapital (double precioEntrada, double capital) {
			
			posibilidadHoraria = buenaHora (horaCine_1, horaCine_2);
			
	}
	static boolean buenaHora (double horaCine_1, double horaCine_2) {
		
		if (horaCine_1 != horaCine_1) {
			return false;
		}else (horaCine_2 != horaCine_2)
			return false;

		
	
	}
}
		



	
	

