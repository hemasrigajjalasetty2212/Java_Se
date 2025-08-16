package pac2;

public class Lab2_1_Account {

	private static long accCounter = 1001; //auto-increment starting from 1001
	
	private long accNum;
	private double balance;
	private Lab2_1_person accHolder;
	
	//constructor
	public Lab2_1_Account(double balance, Lab2_1_person accHolder) {
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
	
	public void withdraw (double amount) {
		if (amount > 0 && (balance - amount) >= 500) {
			balance -=amount;
		}else {
			System.out.println("Withdrawal failed: Minmum balance  INR 500 required. ");
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public long getAccNum() {
		return accNum;
	}
	
	public Lab2_1_person getAccHolder() {
		return accHolder;
	}
	
	public void setAccHolder(Lab2_1_person AccHolder) {
		this.accHolder = accHolder;
	}
	
	@Override
	public String toString() {
		return "Account [AccNum="+ accNum +
				", Blance = INR "+String.format("%.2f", balance)+
				", Holder=" + accHolder.getName()+ "]";
	}
}
