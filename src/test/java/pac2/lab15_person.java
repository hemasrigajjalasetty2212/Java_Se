package pac2;

import java.time.LocalDate;
import java.time.Period;

public class lab15_person {
	
	private String firstName;
	private String lastName;
	private char gender;
	private int age;
	private double weight;
	
	//Default constructor
	public lab15_person() {
		this.firstName = "Unknown";
        this.lastName  = "Unknown";
        this.gender    = 'U';
        this.age       = 0;
        this.weight    = 0.0;
	}

	// parameterized constructor
	public lab15_person(String firstName, String lastName, char gender, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.weight= weight;
	}
	
	// method Dob
	public void calculateAge(LocalDate dob) {
		LocalDate currentDate = LocalDate.now();
		this.age = Period.between(dob, currentDate).getYears();
	}
	
	//method full name
	public String getFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void displayDetails() {
		System.out.println("Person Details:  ");
		System.out.println("----------------");
		System.out.println();
		System.out.println("Full Name: "+getFullName(firstName, lastName));
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.printf("weight: %.2f%n", weight);
	}
	
}
