package pac2;

public class Lab2_1_BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// a) Create account
		Lab2_1_person hemasri = new Lab2_1_person("Hemasri", 30f);
		Lab2_1_Account hemasriAccount = new Lab2_1_Account (2000.0, hemasri);
		
		Lab2_1_person mounika = new Lab2_1_person("Mounika", 30f);
		Lab2_1_Account mounikaAccount = new Lab2_1_Account (3000.0, mounika);
		
		//b) deposite 2000 to hemasri
		hemasriAccount.deposit(2000.0);
		
		//c)withdraw 2000 from mounika
		mounikaAccount.withdraw(2000.0);
		
		//d) display updated balances
		System.out.println("Updated Account Details: ");
		System.out.println(hemasriAccount);
		System.out.println(mounikaAccount);
	}

}
