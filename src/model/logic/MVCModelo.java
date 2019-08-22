package model.logic;


import java.awt.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import com.opencsv.CSVReader;


import model.data_structures.LinkedQueue;


/**
 * Definicion del modelo del mundo
 *
 */
public class MVCModelo {
	/**
	 * Atributos del modelo del mundo
	 */
	private LinkedQueue lista;
	
	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */
	public MVCModelo()
	{
		lista = new LinkedQueue();
	}
	
	
	
	/**
	 * Servicio de consulta de numero de elementos presentes en el modelo 
	 * @return numero de elementos presentes en el modelo
	 */
	public int darTamano()
	{
		return lista.size();
	}

	/**
	 * Requerimiento de agregar dato
	 * @param dato
	 */
	public void agregar(String dato)
	{	
		lista.agregar(dato);
	}
	
	/**
	 * Requerimiento buscar dato
	 * @param dato Dato a buscar
	 * @return dato encontrado
	 */
	public String buscar(String dato)
	{
		//return lista.buscar(dato);
	}
	
	/**
	 * Requerimiento eliminar dato
	 * @param dato Dato a eliminar
	 * @return dato eliminado
	 */
	public String eliminar(String dato)
	{
		//return lista.eliminar(dato);
	}
	
	public void cargarArchivos() throws IOException
	{
		CSVReader reader = null;
		try 
		{
				reader = new CSVReader(new FileReader("./data/bogota-cadastral-2018-1-All-MonthlyAggregate.csv"));
				
				
				reader.readNext();
				
				
				
				for(String[] nextLine : reader)
				{
					Viaje actual= new Viaje(Integer.parseInt(nextLine[0]),Integer.parseInt(nextLine[1]),Integer.parseInt(nextLine[2]),Double.parseDouble(nextLine[3]),Double.parseDouble(nextLine[4]),Double.parseDouble(nextLine[5]),Double.parseDouble(nextLine[6]));
					lista.agregar(actual);
				}
			
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		finally{
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
		try 
		{
				reader = new CSVReader(new FileReader("./data/bogota-cadastral-2018-2-All-MonthlyAggregate.csv"));
				
				
				reader.readNext();
				
				
				for(String[] nextLine : reader)
				{
					Viaje actual= new Viaje(Integer.parseInt(nextLine[0]),Integer.parseInt(nextLine[1]),Integer.parseInt(nextLine[2]),Double.parseDouble(nextLine[3]),Double.parseDouble(nextLine[4]),Double.parseDouble(nextLine[5]),Double.parseDouble(nextLine[6]));
					lista.agregar(actual);
				}
			
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		finally{
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public LinkedQueue consultarViajesMZ(int mes, int zona)
	{
		LinkedQueue listaV= new LinkedQueue();
		
		Iterator iter= lista.iterator();
		
		while(iter.hasNext())
		{
			Viaje actual= (Viaje)iter.next();
			
			if(actual.getSourceID()==zona&& actual.getMonth()==mes)
			{
				listaV.agregar(actual);;
			}
		}
		
		return listaV;
	}
	
	public LinkedQueue consultarViajesM(int mes)
	{
		LinkedQueue listaV= new LinkedQueue();
		
		Iterator iter= lista.iterator();
		
		while(iter.hasNext())
		{
			Viaje actual= (Viaje)iter.next();
			
			if(actual.getMonth()==mes)
			{
				listaV.agregar(actual);;
			}
		}
		
		return listaV;
	}
	
	
}
