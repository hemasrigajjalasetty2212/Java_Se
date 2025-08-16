package pac2;

public class Lab5_SavingAccount extends Lab5_Account {

	public Lab5_SavingAccount(double balance, Lab2_1_person accHolder) {
		super(balance, accHolder);
	}
	
	@Override
	public void withdraw(double amount) {
		if (amount > 0 && (getBalance() - amount) >= 500) {
				setBalance(getBalance()- amount);
		}else {
				System.out.println("Withdrawal failed for "+ getAccHolder()+": Minmum balance  INR 500 required. ");
		}
		
	}
}
