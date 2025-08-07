package com.cg.eis.pl;

import java.util.Scanner;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;

public class MainApp {

	private static String insuranceScheme;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		EmployeeService service = new EmployeeServiceImpl();
		
		System.out.println("Enter Emp ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Emp name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Emp Salary: ");
		double salary = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter Emp Designation (Manager/Programmer/Clerk): ");
		String designation = sc.nextLine();
		
		//Create Empl Object
		Employee emp = new Employee(id, name, salary, designation);
		
		//DEtermine & set Insurance Scheme
		String scheme = service.findInsuranceScheme(emp);
		emp.setInsuranceScheme(scheme);
		
		//Display Employee Details
		System.out.println("\n=====Employee Details ====");
		System.out.println(emp);
		
		sc.close();
	}

}
