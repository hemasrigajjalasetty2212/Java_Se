package pac2;

public class Lab2_1_person {


	private String name;
	private float age;
	
	public Lab2_1_person() {}
	
	public Lab2_1_person(String name, float age) {
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

	public void setAge(float age) {
		this.age = age;
	}
	
	// toString method
	@Override
	public String toString() {
		return "Person [Name = "+name+", Age = "+age+"]";
	}
}
