package numberGuessing;

import java.util.Random;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rn = new Random();

		System.out.println("Welcome to Number Guessing Game : ");
		System.out.println("You have 5 attempts to guess the number !!");
		System.out.print("""
				
				1. Start
				0. Quit
				
				Enter your choice : 
				""");
		int ui = sc.nextInt();
		int round = 0;
		
		while(ui != 0) {
			
			round++;
			System.out.println("Round :- " +  round);
			int random = rn.nextInt(0, 100);	
			int trail = 1;
			
			while (trail <= 5 ) {
				
				System.out.println("Attempt No :-" + trail);
				System.out.println("enter a number");
				int num = sc.nextInt();
			
				if (random == num){
                    System.out.println("Hurray!! You've guessed the number.");
                    break;
                }
                else {
                    System.out.println("Wrong guess :(");
                    
                    if (num < random) 
                    	System.out.println("HINT: You've guessed a small number\n");
                    else
                    	System.out.println("HINT: You've guessed a big number\n");
                }
                trail++;				
			}
			System.out.println("The correct Number is " + random);
			System.out.print("""
					
					1. Start
					0. Quit
					
					Enter your choice : 
					""");
            ui = sc.nextInt();
		}
		
		System.out.println("Thanks for playing....");
        System.out.println("Total rounds played " + round);
	}

}
