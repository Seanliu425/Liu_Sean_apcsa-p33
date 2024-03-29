//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompare
{
	private String wordOne, wordTwo;
   private int compare;

	public WordsCompare()
	{
		setWords("","");
		compare = 0;
	}

	public WordsCompare(String one, String two)
	{
		setWords(one,two);
		compare = 0;
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public void compare()
	{
		compare = wordOne.compareTo(wordTwo);
	}

	public String toString()
	{
		if(compare<0)
		{
			return wordOne + " should be placed before " + wordTwo + "\n";
		}
		else if (compare>0)
		{
			return wordOne + " should be placed after " + wordTwo + "\n";
		}
		return "";
	}
}