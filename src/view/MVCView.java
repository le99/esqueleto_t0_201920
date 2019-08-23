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
	    
		public void printMenu(int [] cantidadViajes)
		{
			System.out.println("\nConsulta de viajes UBER\n");
			
			System.out.println("Se registró la siguiente cantidad de viajes por mes del trimestre:\n");
			
			int i=1;
			
			while(i<7)
			{
				System.out.println("Mes: "+ i + " Nro. viajes: "+ cantidadViajes[i-1]);
				i++;
			}

			System.out.println("\nOprima 1 para iniciar una consulta por mes y zona de origen, luego oprimir tecla Return: (e.g., 1):\n");
			
			System.out.println("Oprima 2 para iniciar una consulta de estadisticas generales, luego oprimir tecla Return: (e.g., 2):\n");
			
			System.out.println("Oprima 3 para salir del programa, luego oprimir tecla Return: (e.g., 3):\n");//
		}

		public void printMessage(String mensaje) {

			System.out.println(mensaje);
		}		
		
}
