package ATM;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static ArrayList<String> th = new ArrayList<>();
	public static int balance = 5000;
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Welcome to Jainam's ATM");
		System.out.println("Enter Username: ");
		String userName = sc.nextLine();

		Datasource d = new Datasource();

		if (d.query(userName)) {
			System.out.println("Enter Passcode : ");
			int ss = 0;
			int attempts = 3;

			while (attempts > 0) {
				String s = sc.nextLine();
				attempts--;
				if (d.db(userName, s)) {
					System.out.println("Correst passcode : ");
					ss = 1;
					break;
				} else {
					System.out.println("Wring Passcode!!");
					System.out.printf("You have %d Attempts remaining !!\n", attempts);
				}
			}
			if (ss == 1) {
				instructions();
				int choice = sc.nextInt();
				while (choice != 5) {

					switch (choice) {

						case 1 -> {
							new Withdraw();
							instructions();
							break;
						}
						case 2 -> {
							new Deposit();
							instructions();
							break;
						}
	
						case 3 -> {
							new TransactionHistory();
							instructions();
						}
						case 4 -> {
							new Transfer();
							instructions();
						}
					}
					choice = sc.nextInt();
				}
				System.out.println("Thanks for visiting JAINAM's ATM :)\n WE WISH YOU A HAPPY DAY AHEAD");
			} else {
				System.out.println(
						"You've entered wrong passcode too many times.\nThanks for visiting our SAMANSaVI ATM.\nPlease visit again");
			}
		} else
			System.out.println(
					"THIS USER DOESN'T SEEM TO EXIST\n\"Thanks for visiting SAMANVI's ATM :)\"\n WE WISH YOU A HAPPY DAY AHEAD");
	}

	public static void instructions() {

		System.out.println("""

				INSTRUCTIONS:
				1. WITHDRAW
				2. DEPOSITE
				3. TRANSACTION HISTORY
				4. TRANSFER
				5. QUIT

				""");
		System.out.println("Enter your choice : ");
	}

}
