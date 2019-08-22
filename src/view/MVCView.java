package view;

import model.logic.MVCModelo;

public class MVCView 
{
	    /**
	     * Metodo constructor
	     */
	    public MVCView()
	    {
	    	
	    }
	    
		public void printMenu()
		{
			System.out.println("Consulta de viajes UBER");

			System.out.println("Oprima 1 para iniciar una consulta por mes y zona de origen, luego oprimir tecla Return: (e.g., 1):");
			
			System.out.println("Oprima 2 para iniciar una consulta de estadisticas generales, luego oprimir tecla Return: (e.g., 2):");
			
			System.out.println("Oprima 3 para salir del programa, luego oprimir tecla Return: (e.g., 3):");//
		}

		public void printMessage(String mensaje) {

			System.out.println(mensaje);
		}		
		
		public void printModelo(MVCModelo modelo)
		{
			// TODO implementar
		}
}
