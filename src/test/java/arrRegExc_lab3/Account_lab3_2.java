package arrRegExc_lab3;

public class Account_lab3_2 {

	private long accNum;
	private double balance;
	private Person_lab3_2 accHolder;
	
	public Account_lab3_2(long accNum, double balance, Person_lab3_2 accHolder) {
		this.accHolder = accHolder;
		this.accNum = accNum;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance += amount;
		}
	}
	
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
	
		if(amount >0 && amount<= balance) {
			balance -= amount;
		}else {
			System.out.println("Insufficient funds or invalid amount.");
		}
	}
	
	
	public double getBalance() {
		return balance;
	}
	
	public void displayAccountDetails() {
		System.out.println("Account Number: "+accNum);
		System.out.println("Account Holder: "+accHolder.getName());
		System.out.println("Holder Age: "+accHolder.getAge());
		System.out.println("Balance: "+balance);
		
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public Person_lab3_2 getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person_lab3_2 accHolder) {
		this.accHolder = accHolder;
	}

	
	
}
