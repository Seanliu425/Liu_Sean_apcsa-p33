//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String response = "";
		
		//add in a do while loop after you get the basics up and running
			String player = "Y";
			do 
			{
				out.print("type in your prompt [rock, paper, scissors] :: ");
				player = keyboard.nextLine();
				RockPaperScissors game = new RockPaperScissors(player);	
				System.out.println(game.toString());
				out.println("play again? [y/n]");
				response = keyboard.nextLine();
			} while (!response.equals("n") || response.equals("N"));
		
	}
}




