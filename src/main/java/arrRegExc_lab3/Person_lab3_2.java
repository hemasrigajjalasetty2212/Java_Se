package arrRegExc_lab3;

public class Person_lab3_2 {
	private String name;
	private float age;
	
	public Person_lab3_2(String name, float age) throws AccountMain_lab3_2.InvalidAgeException{
		if (age<=15) {
			throw new AccountMain_lab3_2.InvalidAgeException("Age must be grater than 15. ");
			
		}
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) throws AccountMain_lab3_2.InvalidAgeException {
		if (age<=15) {
			throw new AccountMain_lab3_2.InvalidAgeException("Age must be grater than 15. ");
		}
		
		this.age = age;
	}
	
	

}
