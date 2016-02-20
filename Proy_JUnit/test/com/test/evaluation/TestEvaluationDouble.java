package com.test.evaluation;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mandraque.evaluation.EvaluationDouble;

public class TestEvaluationDouble
{
	private static EvaluationDouble helper = null;
	
	@BeforeClass
	public static void setUpClass()
	{
		helper = new EvaluationDouble();
	}
	
	@Test
	public void testConvertStringDouble()
	{
		Assert.assertTrue(helper.convertStringDouble("123,123") == 123.123);
	}
}
