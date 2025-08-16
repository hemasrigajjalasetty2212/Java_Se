package pac2;

public class Account_lab2 {
	protected int accNum;
	protected String accHolder;
	protected double balance;
	
	public Account_lab2(int accNum, String accHolder, double balance) {
		this.accNum = accNum;
		this.accHolder=accHolder;
		this.balance = balance;
	}
	
	public void displayDetails() {
		System.out.println("Account Number: "+accNum);
		System.out.println("Account Holder: "+accHolder);
		System.out.println("Balance: "+balance);
	}
	
	public boolean withdraw (double amount) {

		if(amount <= balance) {
			balance -= amount;
			return true;
		}
		
		return false;
	}

}
