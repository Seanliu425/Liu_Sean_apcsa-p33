//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("//Users//allenhuang//Documents//GitHub//Huang_Allen_apcsa-P33//Huang_Allen_apcsa-P33//Unit12//src//words.dat"));

		int size = file.nextInt();
		Word [] words = new Word[size];
		file.nextLine();
		for (int i = 0; i < size; i++) {
			words[i] = new Word(file.nextLine());
		}
		
		Arrays.sort(words);
		for (Word s: words)
		{
			System.out.println(s);
		}

		file.close();
	}
}