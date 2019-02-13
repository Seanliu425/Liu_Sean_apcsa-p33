//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
	   WordsCompare x = new WordsCompare("dog","bobert");
	   x.compare();
	   System.out.print(x);
	   
	   WordsCompare y= new WordsCompare("rubios","calc");
	   y.compare();
	   System.out.print(y);
	   
	   WordsCompare z = new WordsCompare("Sean","martin");
	   z.compare();
	   System.out.print(z);
	}
}