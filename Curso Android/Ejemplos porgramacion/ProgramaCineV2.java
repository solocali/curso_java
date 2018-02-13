// Fichero: ProgramaCineV2.java

public class ProgramaCineV2 {

	public static void main(String[] args) {
		int numCompadre = 0;
		System.out.println ( "Version 2 programa Cine");
		
		while (numCompadre <= 5)
		{
			System.out.println ( "Numero acompañantes" + numCompadre);
			numCompadre = numCompadre + 1;
		}
		System.out.println ( "Intentando hacer los mismo ");
		numCompadre = 0;
		
		do
		{
			System.out.println ( "Numero acompañantes" + numCompadre);
			numCompadre = numCompadre + 1;
		}while ( numCompadre <=5);
		
		System.out.println ( " Intentando hacer lo mismo con FOR ");
		
		for (numCompadre = 0; numCompadre <= 5; numCompadre ++)
			System.out.println ( " Numero de comprades " + numCompadre);
		
	}
	
}