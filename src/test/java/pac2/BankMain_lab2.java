package pac2;

public class BankMain_lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// a) Create account
		Account_lab2 savings = new SavingsAccount_lab2(1001, "Hemasri", 1000);
		
		Account_lab2 current = new CurrentAccount_lab2(2002, "Mounika", 1000, 500);
	
		System.out.println("----Savings Account Withdrawals---");
		savings.displayDetails();
		savings.withdraw(400);
		savings.withdraw(300);
		savings.displayDetails();
		
		System.out.println("\n---Current Account Withdrawals---");
		current.displayDetails();
		current.withdraw(1200);
		current.withdraw(400);
		current.displayDetails();
		
	}

}
