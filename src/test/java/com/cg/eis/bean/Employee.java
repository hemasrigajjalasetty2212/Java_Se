package com.cg.eis.bean;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme = "";
	
	//constructor
	public Employee(int id, String name, double salary, String designation) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.designation=designation;
		this.insuranceScheme=insuranceScheme;
		
	}
	
	//Getter and Setter
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getDesignation() {
		return designation;
	}

	public String getInsuranceScheme() {
		return insuranceScheme;
	}

	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}

	@Override
	public String toString() {
		return "Employee [ID=" +id + ", Name="+ name +", salary = "+ salary+
				", Designation = " + designation + ", Insurance Scheme="+ insuranceScheme+"]";
	}
}
