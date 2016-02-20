package com.test.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mandraque.domain.OperationAritmeticDTO;

public class JUnitFunctionsDefinition
{
	private static OperationAritmeticDTO operations = null;
	
	@BeforeClass
	public static void setUpClass()
	{
		if(operations == null)
		{
			operations = new OperationAritmeticDTO();
			System.out.println("Iniciando la instancia");
		}
		
	}
	
	@AfterClass
	public static void tearDownClass()
	{
		if (operations != null)
		{
			operations = null;
			System.out.println("Eliminando la instancia");
		}
		
	}
	
	@Before
	public void setUp()
	{
		System.err.println("<------------------>");
	}
	
	@After
	public void tearDown()
	{
		System.err.println("<------------------>");
	}
	
	@Test
	public void testA()
	{
		Integer resultado = operations.multiplicar(5,5);
		Assert.assertTrue(resultado == 25 );
	}
	
	@Test
	public void testB()
	{
		Assert.assertFalse(operations.division(10, 5) == 6);
	}
	
	//Generando errores con mensajes
	@Test
	public void testC()
	{
		Assert.assertTrue("Suma erronea", operations.sumar(2, 2) == 42);
	}
	
	@Test
	public void testD()
	{
		Assert.assertFalse("Resta correcta", operations.restar(10, 5) == 5);
	}
	
	@Test
	public void testE()
	{
		/**
		 * Assert.assertNull(Object)
		 * 
		 * Valida si el objeto en nulo.
		 */
		Integer object = null;
		
		Assert.assertNull(object);
	}
	
	@Test
	public void testF()
	{
		/**
		 * Assert.assertNotNull(Object)
		 * 
		 * Valida si el objeto no es nulo.
		 */
		Integer object = new Integer(9);
		Assert.assertNotNull(object);
	}
	
	@Test
	public void testG()
	{
		/**
		 * Assert.assertSame(Object, Object)
		 * 
		 * Valda que los 2 objectos  a comparar sean el mismo.
		 */
		Integer objectIntegerA = new Integer(1);
		Integer objectIntegerB = objectIntegerA;

		Assert.assertSame(objectIntegerA, objectIntegerB);
	}
	
	@Test
	public void testH()
	{
		/**
		 * Assert.assertNotSame(Object, Object)
		 * 
		 * Valda que los 2 objetos  a comparar  No sean el mismo.
		 */
		Integer objectIntegerA = new Integer(1);
		Integer objectIntegerB = new Integer(1);
		
		Assert.assertNotSame(objectIntegerA, objectIntegerB);
	}
	
	@Test
	public void testI()
	{
		/**
		 * Assert.fail()
		 * 
		 * Hace que el test termine con fallos.
		 */
		Assert.fail();
	}
}
