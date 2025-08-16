package arrRegExc_lab3;

public class Person {
	private String firstName;
	private String lastName;
	private char gender;
	
	//constructor
	public Person(String firstName, String lastName, char gender) throws InvalidNameException_lab3_1 {

		if (firstName == null || firstName.trim().isEmpty() ||
				lastName == null || lastName.trim().isEmpty()) {
			throw new InvalidNameException_lab3_1("Name Cannot be blank. ");
		}
			
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String getFullName() {
		return firstName+" "+lastName;
	}
	
	//Display
	public void displayDetails() {
		System.out.println("Person Details: ");
		System.out.println("-------------------------");
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name: "+lastName);
		System.out.println("gender: "+gender);
	}

}
