package Lab6rolldice;

import java.util.Scanner;
import java.util.Random;



public class rolldice {

	public static void main(String[] args) {
		
		// Input scanner and create variables for main
		Scanner scnr = new Scanner(System.in);
		int numSides, die1 = 0, die2 = 0, timesPlayed = 0;
		String cont = "y", problem = "no";
		
		System.out.println("Welcome to the Grand Circus Casino!");
		
		System.out.println("Please enter your name:");
		String userName = scnr.next();
	
		do {			
			System.out.println(userName + ", how many sides should each die have?");
			numSides = scnr.nextInt();
			timesPlayed++;
			if (numSides < 1) {
				System.out.println("Please enter an integer greater than zero");
			}
			else {
				die1 = rollDice(numSides);
				die2 = rollDice(numSides);
			}
			
			System.out.println("Roll " + timesPlayed + ":");
			System.out.println(die1);
			System.out.println(die2);
			
			System.out.print("\nRoll again? (y/n): ");
			cont = scnr.next();
			System.out.println("");
			
			if (timesPlayed == 2) {
			System.out.println(userName + ", do you have a gambling problem? (yes or no)");
			problem = scnr.next();
				do {
					if (problem.equals("no")) {
					System.out.println("Okay, I believe you for now.");
					}
					else if (problem.equals("yes")) {
						break;
					}
					else {
						System.out.println("I don't follow, please answer 'yes' or 'no' ");
						problem = scnr.next();
					}
				} while (problem.equals("no") == false);
			}
		} while (cont.equals("y") && problem.equals("no"));
		
		System.out.println("Bye!");		
	}
private static Random r = new Random();
	
public static int rollDice(int sides) {
	return 1 + r.nextInt(sides);
}
}
