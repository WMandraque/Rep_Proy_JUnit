package com.test.evaluation;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mandraque.evaluation.EvaluationInteger;

public class TestEvaluationInteger
{
	private static EvaluationInteger helperInteger = null;
	
	@BeforeClass
	public static void setUpClass()
	{
		helperInteger = new EvaluationInteger();
		
	}
	
	@Test
	public void testConverStringToInteger()
	{
		Assert.assertTrue(helperInteger.convertStringToInteger("123") == 123);
	}
	
	@Test
	public void testOrderNumber()
	{
		Assert.assertTrue(helperInteger.orderNumber("123") == null);
	}
	
}
