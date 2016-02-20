
package com.test.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.test.evaluation.TestEvaluationDouble;
import com.test.junit.runwith.TestSuite;

/**
 * @author Mandraque
 * 
 *         Esta clase explicara cada uno de las anotaciones.
 *         
			@Before
			@BeforeClass
			@After
			@AfterClass
			@Test
			@Ignore
			@Test(timeout)
			@Test(expected)
			@RunWith
			@Suite.SuiteClasses
			@RunWith(Suite.class)
            @SuiteClasses
 *
 */
@RunWith(Suite.class)
@SuiteClasses({TestSuite.class, TestEvaluationDouble.class})
public class JUnitAnotationDefinition
/**
 *   @RunWith(Suite.class)
 *   Esta anotacion se utiliza para indicar que clase correrá
 *   como una extensión o tipo de otra clase.
 *   
 *   @SuiteClasses({TestA.class, Testb.class})
 *   @Suite.SuiteClasess(TestA.class)
 *   se utiliza para indicar que un Test Suite correrá los siguientes test.
 *   
 *
 */
{


	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		/**
		 * @BeforeClass
		 * 
		 * Este metodo precedido de la anotación "@BeforeClass" sirve para
		 * indicar que se ejecutara antes de todos los test.
		 **/

		System.out.println("Inicia los test");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		/**
		 * @AfterClass
		 * 
		 * Este metodo precedido de la anotación "@AfterClass" sirve para
		 * indicar que se ejecutara despues de todos los test.
		 **/

		System.out.println("Fin de los test");
	}

	@Before
	public void setUp() throws Exception
	{
		/**
		 * @Before
		 * 
		 * Este metodo precedido de la anotacion "@Before" Es para indicar al
		 * JUnit que debe ejecutarlo antes de ejecutar cada uno de los test
		 * definidos en esta clase. Se ejecutara antes de cada metodo a testear.
		 */

		System.out.println("Inicia el test");
	}

	@After
	public void tearDown() throws Exception
	{
		/**
		 * @After
		 * 
		 * Este metodo precedido de la anotacion "@After" Es para indicar al
		 * JUnit que debe ejecutarlo despues de ejecutar cade uno de los test
		 * definidos en esta clase. Se ejecutara despues de cada metodo a
		 * testear.
		 */

		System.out.println("Finaliza el test");
	}

	@Test
	public void testA()
	{
		/**
		 * @Test
		 * 
		 * Esta anotacion sirve para indicar que este sera un metodo a testear.
		 * 
		 */

		System.out.println("Ejecutando el test");

	}

	@Ignore("Aun falta terminar el test")
	@Test
	public void testB()
	{
		/**
		 * "@Ignore" 
		 * 
		 * Esta anotacion sirve para indicar que este sera un metodo a
		 * testear y que sera IGNORADO en su ejecución. Sirve para cuando
		 * el codigo del metodo sea inconcluso o alguien debe terminarlos.
		 * 
		 */

		System.out.println("No sera ejecutado");

	}

	/**
	 * 1000 = 1 Segundo
	 * 100  = 0.1 Segundo
	 */
	@Test(timeout = 1000)
	public void testC()
	{
		/**
		 * @Test(timeout = valor)
		 * 
		 * Sirve para decirle al JUnit que si el metodo tarda
		 * mas del el tiempo esperado, el mismo tiene que fallar.
		 * Esto es ideal para verificar procesos con demorar
		 * aceptable. El tiempo sera asignado en milisegundos.
		 * En el caso que el test no termine en el tiempo deseado
		 * sera marcado como fallido.
		 * 
		 */
		
		// Este while va a tardar mas que 100 milisegundos
		// y fallara.
		Integer i = 0;
		while(100000000 > i)
		{
			i++;
		}
		System.out.println("Termino");

	}
	
	
	@Test(expected = Exception.class)
	public void testD()
	{
		/**
		 * @Test(expected = Excepcion)
		 * 
		 * Sirve para avisar al test que debe lanzar
		 * algun tipo de excepción. En el caso de que
		 * no se cumpla sera marcado como fallido.
		 * 
		 */
		
		//Lanzara una excepción de NumberFormatExcepcion
		Integer.parseInt("b");
	}

}
