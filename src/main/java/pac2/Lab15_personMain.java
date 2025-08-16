package pac2;

import java.time.LocalDate;

public class Lab15_personMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lab15_person person = new lab15_person ("Hemasri","Gajjalasetty",'F',46.68);
		
		LocalDate dob = LocalDate.of(2002, 12, 22);
		person.calculateAge(dob);
		
		person.displayDetails();
	}

}
