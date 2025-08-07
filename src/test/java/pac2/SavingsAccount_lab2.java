package pac2;

public class SavingsAccount_lab2 extends Account_lab2{

	//private static final double MINMUM_BALANCE = 500;
	
	public SavingsAccount_lab2(int accNum, String accHolder, double balance) {
		super(accNum, accHolder, balance);
	}
	
	@Override
	public boolean withdraw(double amount) {
		if (balance - amount >= 500) {
				balance-= amount;
				System.out.println("Withdraw successful from Saving Account ");
				return true;
		}else {
				System.out.println("Withdrawal failed for "+ accHolder+": Minmum balance  INR 500 required. ");
				return false;
		}
		
	}
}
