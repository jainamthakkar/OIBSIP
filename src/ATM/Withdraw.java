package ATM;

//In this switch case, the -> operator is followed by a code block enclosed in curly braces {}. 
//The code block contains two statements:

//new Withdraw();: This creates a new instance of the Withdraw class. 
//The Withdraw constructor is called to initialize the object, but the reference to the object is not stored in a variable. 
//This means that the object will be created, but it won't be used later in the code.

//Instructions();: This calls a method named Instructions(). 
//It's not clear from this code snippet what this method does, but it's likely that it provides instructions or guidance for the user.

public class Withdraw {

	private int money = 0;

	public Withdraw() {
		
		System.out.println("Enter money to withdraw: ");
		money = Main.sc.nextInt();
		
		if (Main.balance >= this.money) {
			
			System.out.println("Money withdrawl Successfull!!");
			Main.balance -= this.money;
			
			Main.th.add("Rupees " + this.money + " Debited");
			showBalance();
		} else {
		
			Main.th.add("Withdraw of rupees " + this.money + " failed");
			System.out.println("Money withdraw Not successful due to insufficient funds");
		}
	}

	private void showBalance() {
		// TODO Auto-generated method stub
		System.out.printf("After Withdrawing %d, %d left in your account\n", this.money, Main.balance);
	}
}
