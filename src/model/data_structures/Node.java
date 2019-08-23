package model.data_structures;

public class Node<Item>
{

	/**
	* Atributo que modela el parametro de la clase  
	*
	*/
	private Item data;

	/**
	*	Atributo que modela el Nodo siguiente
	*/
	private Node<Item> siguiente;

	/**
	*	Atributo que modela el Nodo anterior
	*/
	private Node<Item> anterior;

	///////////////////////////////////
	/////	Constructor		///////////
	///////////////////////////////////
	/**
	*	Constructor de la clase
	*	@param pData 
	*	@param pSiguiente Nodo siguiente 
	*	@param pAnterior Nodo anterior
	*/
	public Node( Item pData, Node<Item> pSiguiente, Node<Item> pAnterior)
	{
		data = pData;

		siguiente = pSiguiente;

		anterior = pAnterior;

	}



	/**
	*	Metodo que retorna el nodo siguiente
	* 	@return Nodo siguiente
	*/
	public Node<Item> darSiguiente()
	{
		return siguiente; 
	}


	/**
	*	Metodo que retorna el nodo anterior
	* 	@return Nodo anterior
	*/
	public Node<Item> darAnterior()
	{
		return anterior; 
	}


	/**
	*	Metodo que cambia el nodo anterior 
	* 	@param e Nodo a cambiar
	*/
	public void cambiarAnterior( Node<Item> e)
	{
		anterior = e; 
	}


	/**
	*	Metodo que cambia el nodo siguiente 
	* 	@param e Nodo a cambiar
	*/
	public void cambiarSiguiente( Node<Item> e)
	{
		siguiente = e; 
	}







}
