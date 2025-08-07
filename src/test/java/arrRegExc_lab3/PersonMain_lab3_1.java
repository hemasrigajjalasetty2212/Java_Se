package arrRegExc_lab3;

public class PersonMain_lab3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Person p1 = new Person("Hemasri", "Gajjalsetty", 'F');
			p1.displayDetails();
			
			System.out.println();
			
			Person p2 = new Person(" "," ",'M');
			p2.displayDetails();
		}catch(InvalidNameException_lab3_1 e) {
			System.out.println("Error: "+e.getMessage());
		}
	}

}
