package sample;

import java.util.Scanner;
import java.lang.Math;

public class rps{
	public static void main(String[] argh){
		Scanner s = new Scanner(System.in);
		System.out.println("Would you like to play 1, 3 or 5 games?");
		int h = s.nextInt()/2 +1;
		int compWins = 0;
		int userWins = 0;
		do {
			System.out.println("Enter either a 1 for \'rock\', 2 for \'paper\', or 3 for \'scissors\'");
			int user = s.nextInt();
			int computerChoice = compPick();
			result(computerChoice, user);
			if(checker(computerChoice, user) == 1){
				compWins++;
			}
			else if(checker(computerChoice, user) == 0){
				userWins++;
			}
		}while(h>userWins && h>compWins);
		if(userWins>compWins){
			System.out.println("You won the game!");
		}
		else{
			System.out.println("You lost the game.");
		}
	}
	public static void result(int computerChoice,int user){
		int result = checker(computerChoice, user);
		if (result == 2){
			System.out.println("It was a tie!");
		}
		else if(result == 0){
			System.out.println("You beat the computer!");
		}
		else if(result == 1){
			System.out.println("You lost!");
		}
		else{
			System.out.println("something went wrong :(");
		}
	}
	public static int compPick(){
		int a = (int) (Math.random() * 3);
		if(a == 0){
			System.out.println("The computer picked rock");
			return 1;
		}
		else if (a == 1){
			System.out.println("The computer picked paper");
			return 2;
		}
		else if (a==2){
			System.out.println("The computer picked scissors");
			return 3;
		}
		else{
			return -1;
		}
	}
	public static int checker(int computer, int user){
		if(computer == user){
			return 2;
		}
		else if(computer == 1 && user == 2){
			return 0;
		}
		else if(computer == 1 && user == 3){
			return 1;
		}
		else if(computer == 2 && user == 1){
			return  1;
		}
		else if(computer == 2 && user == 3){
			return 0;
		}
		else if(computer == 3 && user == 1){
			return 0;
		}
		else if(computer == 3 && user == 2){
			return 1;
		}
		else{
			return -1;
		}
	}
	
}