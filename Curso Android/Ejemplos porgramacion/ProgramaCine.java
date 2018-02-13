/*
Fichero: ProgramaCine.java
 Autor: Alfredo Conejo
 Descripcion: Programa que nos ayuda a saber si ir al cine o no.
*/
// Inicio de la clase ProgramaCine
public class ProgramaCine
{	//Metodo principal, que se llama al arrancar el programa 
	public static void main(String[] argumentos)
	{	// Instrucciones de salida por consola
		System.out.println ("PROGRAMA CINE");
		// Asignamos variables
		String titulo ="Torrente 8";	// Titulo en variable de texto
		boolean varSiIrAlCine = false;	// Resultado para saber si ir al cine en boolean
		int precioEntrada = 9;			// Precio entrada
		int nuestroCapital = 5;		// El dinero que tenemos 
		
		// Imprimimos  el titulo
		System.out.println ("Titulo: " + titulo + ".");

		
	    System.out.println ("Precio: " + precioEntrada );
		if (nuestroCapital > precioEntrada) {
			varSiIrAlCine = true;
		} else {
			varSiIrAlCine = false;
		}
		if (varSiIrAlCine == true) {
			System.out.println (" SI Podriamos ir al cine");
			nuestroCapital = nuestroCapital - precioEntrada;
		} else {
			System.out.println (" NO Podriamos ir al cine");
			System.out.println ("Capital Final:" + nuestroCapital);
			
		}
		
		
		
		
			
			
		

	}
}