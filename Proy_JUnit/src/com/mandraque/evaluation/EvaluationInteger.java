package com.mandraque.evaluation;

public class EvaluationInteger
{

	public Integer convertStringToInteger(String numberString)
	{
		try
		{
			return Integer.parseInt(numberString);

		} catch (NumberFormatException e)
		{
			System.out.println(e);
		}
		return null;
	}

	public Object orderNumber(Object object)
	{
		if(object instanceof Integer)
		{
			System.out.println("Entero");
		}
		else if(object instanceof String)
		{
			System.out.println("String");
		}
		
		return null;
	}
	
	
	

}
