package pac2;

public abstract class Lab5_Account {

	private static long accCounter = 1001; //auto-increment starting from 1001
	
	private long accNum;
	private double balance;
	private Lab2_1_person accHolder;
	
	//constructor
	public Lab5_Account(double balance, Lab2_1_person accHolder) {
		this.accNum = accCounter++;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	
	//min balance enforcement
	public void deposit(double amount) {
		if (amount > 0) {
			balance +=amount;
			
		}
	}
	
	//Abstract withdraw method
	public abstract void withdraw (double amount);
	
	public double getBalance() {
		return balance;
	}
	
	public long getAccNum() {
		return accNum;
	}
	
	public Lab2_1_person getAccHolder() {
		return accHolder;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [AccNum="+ accNum +
				", Blance = INR "+String.format("%.2f", balance)+
				", Holder=" + accHolder.getName()+ "]";
	}
}
