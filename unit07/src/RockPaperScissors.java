//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("R");

	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
		
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		int comp = (int) (Math.random() * 3);
		if (comp == 0) 
		{
			compChoice = "rock";
		}
		else if (comp == 1)
		{
			compChoice = "paper";
		}
		else 
		{
			compChoice = "scissors";
		}
	}


	public String determineWinner()
	{
		String winner="";
		if (playChoice.equals("rock") && compChoice.equals("scissors") 
				|| playChoice.equals("scissors") && compChoice.equals("paper")
				|| playChoice.equals("paper") && compChoice.equals("rock"))
		{
			winner = "computer wins";
		}
		else if (playChoice.equals(compChoice)) {
			winner = "draw game";
		}
		else {
			winner = "player wins";
		}
		return winner;
	}

	public String toString()
	{
		String output= "player plays " + playChoice + "\ncomputer plays " + compChoice + "\n" + determineWinner();
		if (!(playChoice.equals("rock") || playChoice.equals("scissors") || playChoice.equals("paper"))) 
		{
			output += "\nplayer did not pick a valid choice, computer wins.";
		}
		return output;
	}
}
