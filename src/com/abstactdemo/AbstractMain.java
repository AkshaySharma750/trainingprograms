package com.abstactdemo;

public class AbstractMain {

	public static void main(String[] args) {
		
		PermanentEmployee permanentEmployee= new PermanentEmployee();
		ContractEmployee contractEmployee = new ContractEmployee();
		
		String companyName = permanentEmployee.getCompanyName();
		double salaryOfPermanentEmployee = permanentEmployee.calculateSalary("permanent");
		double salaryOfContractEmployee = contractEmployee.calculateSalary("contractual");
		
		System.out.println("Company name is" +companyName);
		System.out.println("Salary of Permanent Employee is"+salaryOfPermanentEmployee);
		System.out.println("Salary of Contract Employee is"+salaryOfContractEmployee);
	}

}
