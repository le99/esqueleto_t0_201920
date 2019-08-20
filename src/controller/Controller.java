package controller;

import java.util.Scanner;

import model.logic.MVCModelo;
import view.MVCView;

public class Controller {

	/* Instancia del Modelo*/
	private MVCModelo modelo;
	
	/* Instancia de la Vista*/
	private MVCView view;
	
	/**
	 * Crear la vista y el modelo del proyecto
	 * @param capacidad tamaNo inicial del arreglo
	 */
	public Controller ()
	{
		view = new MVCView();
		modelo = new MVCModelo();
	}
		
	public void run() 
	{
		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		String dato = "";
		String respuesta = "";

		while( !fin ){
			view.printMenu();

			int option = lector.nextInt();
			switch(option){
				case 1:
					System.out.println("--------- \nRealizar Consulta \nDar número de mes a consultar: ");
				    int mes = lector.nextInt();
				    //modelo = new MVCModelo(mes); 
					System.out.println("Dar identificador numerico de la zona de origen");
					int id = lector.nextInt();
					
					//Hacer consulta
								
					break;

					
				case 2: 
					System.out.println("--------- \n Consulta de estadisticas \n---------"); 
					System.out.println("Ingrese la consulta que desee realizar");
					System.out.println("1. Total de viajes en el semestre");
					System.out.println("2. Total de viajes reportados en un mes especifico");
					System.out.println("3. Total de viaje reportados de un mes específico y una zona de origen especifico.");
					System.out.println("Oprima 1,2 o 3, y luego la tecla Return.");
					
					int opcion= lector.nextInt();
					
					switch(option)
						{
							case 1:
								//Realizar consulta
								System.out.println();
								break;
								
							case 2:
								System.out.println("Dar número de mes a consultar: ");
							    int mes2 = lector.nextInt();
							    //modelo = new MVCModelo(mes); 
								System.out.println("Dar identificador numerico de la zona de origen");
								int id2 = lector.nextInt();
								
								//Realizar consulta
								
								System.out.println();
								break;
								
							case 3:
								System.out.println("Dar número de mes a consultar: ");
							    int mes3 = lector.nextInt();
							    //modelo = new MVCModelo(mes); 
								System.out.println("Dar identificador numerico de la zona de origen");
								int id3 = lector.nextInt();
								
								//Realizar consulta
								
								System.out.println();
								break;
								
							default:
								System.out.println("--------- \n Opcion Invalida !! \n---------");
								break;															
						}
					break;	
					
				case 3:
					System.out.println("--------- \nHasta pronto! \n ");
					lector.close();
					fin = true;
					break;
					
				default: 
					System.out.println("--------- \n Opcion Invalida !! \n---------");
					break;
			}
		}
		
	}	
}
