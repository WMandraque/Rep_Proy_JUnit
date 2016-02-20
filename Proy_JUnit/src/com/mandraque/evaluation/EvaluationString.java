package com.mandraque.evaluation;

public class EvaluationString
{
	
	public String inversionChain(String text)
	{
		String textResult = new String();
		for(int i = 0; i < text.length(); i++)
		{
			textResult = text.charAt(i) + textResult;
		}
		return textResult;
	}

	public Integer coutVocals(String text)
	{
		Integer count = 0;
		for(int i = 0; i < text.length(); i++)
		{
			if(helperA(text.charAt(i)))
			{
				count++;
			}
		}
		return count;
	}
	
	
	public Boolean helperA(char letter)
	{
		char[] arrayVocals = new char[5];
		arrayVocals[0] = 'a';
		arrayVocals[1] = 'e';
		arrayVocals[2] = 'i';
		arrayVocals[3] = 'o';
		arrayVocals[4] = 'u';
		
		for(int i = 0; i < arrayVocals.length; i++)
		{
			if(letter == arrayVocals[i])
			{
				return true;
			}
		}
		
		return false;
			
	}

	public String replaceVocal(String text)
	{
		for (int i = 0; i < text.length(); i++)
		{
			if(helperA(text.charAt(i)))
			{
				text = text.replace(text.charAt(i), 'x');
			}
		}
		return text;
	}

	public String deleteVocal(String text)
	{
		String textResult = new String();
		for (int i = 0; i < text.length(); i++)
		{
			if(!helperA(text.charAt(i)))
			{
				textResult = textResult + text.charAt(i);
			}
		}
		System.out.println(textResult);
		return textResult;
	}

	
}
