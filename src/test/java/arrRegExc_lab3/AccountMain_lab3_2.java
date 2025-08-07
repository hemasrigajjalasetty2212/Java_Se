package arrRegExc_lab3;

public class AccountMain_lab3_2 {
	
	//user defined exception
	static class InvalidAgeException extends Exception{
		public InvalidAgeException(String message) {
			super (message);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Person_lab3_2 p1 = new Person_lab3_2("Hemasri", 22);
			Account_lab3_2 a1 = new Account_lab3_2(1234567890L, 5000.0, p1);
			a1.deposit(1500);
			a1.withdraw(1000);
			a1.displayAccountDetails();
			
			System.out.println();
			
			Person_lab3_2 p2 = new Person_lab3_2("Tommy", 12);
		}catch (InvalidAgeException e) {
			System.out.println("Error: "+e.getMessage());
		}
	}

}
