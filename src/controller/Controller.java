package controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import model.data_structures.LinkedQueue;
import model.logic.MVCModelo;
import model.logic.Viaje;
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
		try {
			modelo.cargarArchivos();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
					
					LinkedQueue lista= modelo.consultarViajesMZ(mes, id);
					
					Iterator iter= lista.iterator();
					
					while(iter.hasNext())
					{
						Viaje actual= (Viaje)iter.next();
						System.out.println("Zona origen: "+ actual.getSourceID()+ " , Zona destino: "+ actual.getDstID() + " , Tiempo promedio: "+ actual.getMeanTravelTime() + " , Desviación estándar: "+ actual.getStandardDeviationTravelTime());
					}
								
					break;

					
				case 2: 
					System.out.println("--------- \n Consulta de estadisticas \n---------"); 
					System.out.println("Ingrese la consulta que desee realizar");
					System.out.println("1. Total de viajes en el semestre");
					System.out.println("2. Total de viajes reportados en un mes especifico");
					System.out.println("3. Total de viaje reportados de un mes específico y una zona de origen especifico.");
					System.out.println("Oprima 1,2 o 3, y luego la tecla Return.");
					
					int opcion= lector.nextInt();
					
					switch(opcion)
						{
							case 1:
								System.out.println("Total de viajes reportados en el semestre: "+ modelo.darTamano());
								break;
								
							case 2:
								System.out.println("Dar número de mes a consultar: ");
							    int mes2 = lector.nextInt();
			 
								LinkedQueue lista2= modelo.consultarViajesM(mes2);
								int cantidad= lista2.size();

								System.out.println("El total de viajes del mes: "+ mes2+" es: "+cantidad+" y su porcentaje con respecto a todos los viajes del semestre es: "+ (cantidad*100)/modelo.darTamano()+"%");
								break;
								
							case 3:
								System.out.println("Dar número de mes a consultar: ");
							    int mes3 = lector.nextInt();
							    //modelo = new MVCModelo(mes); 
								System.out.println("Dar identificador numerico de la zona de origen");
								int id3 = lector.nextInt();
								
								LinkedQueue lista3= modelo.consultarViajesMZ(mes3, id3);
								int cantidad2= lista3.size();
								
								
								System.out.println("El total de viajes del mes: "+ mes3+" y la zona de origen: "+id3+" es: "+cantidad2+" y su porcentaje con respecto a todos los viajes del semestre es: "+ (double)(cantidad2*100)/modelo.darTamano()+"%");
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
