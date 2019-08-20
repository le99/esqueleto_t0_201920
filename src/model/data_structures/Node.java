private static class Node<Item>
{

	/**
	* Atributo que modela el parametro de la clase  
	*/
	private Item data;

	/**
	*	Atributo que modela el Nodo siguiente
	*/
	private Node<Item> siguiente;




	///////////////////////////////////
	/////	Constructor		///////////
	///////////////////////////////////
	/**
	*	Constructor de la clase
	*	@param pData 
	*	@param pSIguiente Nodo siguiente 
	*/
	public Node( Item pData, Node<Item> pSiguiente)
	{
		this.data = data;

		this.siguiente = pSiguiente;

	}


}
