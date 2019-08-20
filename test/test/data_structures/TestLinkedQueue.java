package test.data_structures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import model.data_structures.LinkedQueue;

public class TestLinkedQueue 
{
	
	private LinkedQueue lista;
	
	@Before
	public void setup1()
	{
		lista= new LinkedQueue();
	}
	
	public void setup2()
	{
		
	}
	
	@Test
	public void testLinkedQueue() 
	{
		assertTrue(lista!=null);
		assertEquals(0, lista.size());
	}

	

}
