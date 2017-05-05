import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsClass {

	public static void main(String[] args) {
		
		int NumberOfGames = 0;
		String PlayerActualChoice;
		String AIActualChoice = null;
		int PlayerChoice = 0;
		int AIChoice = 0;
		int PlayerVictories = 0;
		int AIVictories = 0;
		int GamesPlayed = 0;
			
		System.out.println("Welcome to Matt's Incredible");
		System.out.println("Rock, Paper, Scisssors Game");
		System.out.println("How many games do you want to play?");
		Scanner keyboard = new Scanner(System.in);
		NumberOfGames = keyboard.nextInt();
		
		Random myRandom = new Random();
		
		while (NumberOfGames != GamesPlayed) {
			System.out.println("Make your choice: rock, paper or scissors");
			PlayerActualChoice = keyboard.next();
			/* convert to digit*/
			switch (PlayerActualChoice) {
			case "rock": PlayerChoice = 1;
			break;
			case "paper": PlayerChoice = 2;
			break;
			case "scissors": PlayerChoice = 3;
			break;
			}
			
		/* Select AI choice*/
			AIChoice = myRandom.nextInt(3) + 1;  /* rock = 1, paper = 2, scissors = 3*/
			switch (AIChoice) {
			case 1: AIActualChoice = "rock";
			break;
			case 2: AIActualChoice = "paper";
			break;
			case 3: AIActualChoice = "scissors";
			break;
			}
			
			System.out.print("The AI has chosen: ");
			System.out.print(AIActualChoice);
			System.out.println();
		/* See who won the game*/
			if (PlayerChoice == 1 && AIChoice == 3) {
				PlayerVictories += 1;
				System.out.println("You won!");
			}
			else if (PlayerChoice == 2 && AIChoice == 1) {
				PlayerVictories += 1;
				System.out.println("You won!");
			}
			else if (PlayerChoice == 3 && AIChoice == 2) {
				PlayerVictories += 1;
				System.out.println("You won!");
			}
			else if (PlayerChoice == AIChoice) {
				System.out.println("Draw!");
			}
			else {AIVictories += 1;
				System.out.println("AI wins.  You lose!");
			}
			
			GamesPlayed += 1;

		}
		keyboard.close();
		
		System.out.print("You won: ");
		System.out.print(PlayerVictories);
		System.out.println(" games");
		System.out.print("The AI won: ");
		System.out.print(AIVictories);
		System.out.println(" games");
	}

}
