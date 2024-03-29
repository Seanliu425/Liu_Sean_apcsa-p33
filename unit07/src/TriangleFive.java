//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter('x');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		for (int i = amount; i > 0 ; i--)
		{
			int x = 0;
			char a = letter;
			
			while (x<i) {
				for (int z = amount - x ; z>0; z--) {
					output += a; 
				}
				
				if(a == 'Z' || a == 'z') {
					a -= 25;
				}
				else
					a++;
				output = output + "  ";
				x++;
			}
			
			output += "\n";
		}
		return output;
	}
}