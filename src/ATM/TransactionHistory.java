package ATM;

public class TransactionHistory {

	public TransactionHistory(){
		
		System.out.println("Your TRANSACTION HISTORY:");
		for (int i = 0; i < Main.th.size(); i++) {
			System.out.println(Main.th.get(i));
		}
	}
}
