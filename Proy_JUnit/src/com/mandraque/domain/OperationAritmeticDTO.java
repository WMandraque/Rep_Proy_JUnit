package com.mandraque.domain;

public class OperationAritmeticDTO
{
	private Integer numA, numB;
	
	public OperationAritmeticDTO()
	{

	}
	
	public  Integer multiplicar(Integer numA, Integer numB)
	{
		return numA * numB;
	}
	
	public Integer division(Integer numA, Integer numB)
	{
		return numA / numB;
	}
	
	public Integer sumar(Integer numA, Integer numB)
	{
		return numA + numB;
	}
	
	public Integer restar(Integer numA, Integer numB)
	{
		return numA - numB;
	}

	public Integer getNumA()
	{
		return numA;
	}

	public void setNumA(Integer numA)
	{
		this.numA = numA;
	}

	public Integer getNumB()
	{
		return numB;
	}

	public void setNumB(Integer numB)
	{
		this.numB = numB;
	}
}
