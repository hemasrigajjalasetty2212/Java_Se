package pac2;

public class CurrentAccount_lab2 extends Account_lab2 {

	private double overdraftLimit;
	
	public CurrentAccount_lab2(int accNum, String accHolder, double balance, double overdraftLimit) {
		super( accNum, accHolder, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public boolean withdraw(double amount) {
		if (balance - amount >= -overdraftLimit) {
			balance -=amount;
			System.out.println("Withdraw successful from current account");
			return true;
		}else {
			System.out.println("Cannot withdraw. Overdraft Limit of "+overdraftLimit+"exceeded.");
			return false;
		}
	}
}
