package com.test.evaluation;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.mandraque.evaluation.EvaluationString;



public class TestEvaluationString 
{
	private static EvaluationString helperString = null;

	@BeforeClass
	public static void setUpClass()
	{
		helperString = new EvaluationString();
	}
	
	@Test
	public void testInversionChain()
	{
		assertTrue(helperString.inversionChain("Hello").equals("olleH"));
	}
	
	@Test
	public void testCountVocals()
	{
		assertTrue(helperString.coutVocals("Murcielago") == 5);
	}
	
	@Test
	public void testReplaceVocal()
	{
		assertTrue(helperString.replaceVocal("Poto").equals("Pxtx"));
	}
	
	@Test
	public void testDeleteVocal()
	{
		assertTrue(helperString.deleteVocal("Hello").equals("Hll"));
	}
}
