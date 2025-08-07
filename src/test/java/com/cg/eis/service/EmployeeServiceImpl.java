package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements  EmployeeService {

	@Override
	public String findInsuranceScheme(Employee emp) {
		double salary = emp.getSalary();
		String designation = emp.getDesignation().toLowerCase();
		
		if (salary > 50000 && designation.equals("manager")) {
			return "Scheme A";
		}else if(salary > 20000 || salary <= 50000 && designation.equals("Programmer")) {
			return "Scheme B";
		}else if(salary > 5000 || salary <= 20000 && designation.equals("Clerk")) {
			return "Scheme C";
		}else {
			return "No Scheme";
		}
			
	}
}
