package com.mandraque.evaluation;

public class EvaluationDouble
{
	public Double convertStringDouble(String text)
	{
		text = text.replace(',', '.');
		
		return Double.parseDouble(text);
	}
}
