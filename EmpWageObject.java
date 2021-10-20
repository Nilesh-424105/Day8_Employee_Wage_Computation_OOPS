package com.empwage;

/*
 * Ability to save the Total Wage for Each Company 
 */

public class EmpWageObject {

	// constants
	private static final int IS_PART_TIME = 1;
	private static final int IS_FULL_TIME = 2;

	// Instance Variables
	String company;
	// Employee Rate Per Hour
	int empRate;
	// Number of Working Days
	int numOfDays;

	// parameterized Constructor
	EmpWageObject(String company, int empRate, int numOfDays) {
		this.company = company;
		this.empRate = empRate;
		this.numOfDays = numOfDays;
	}

	// Instance Method For Calculate Employee Wage For Each Company
	public void calculateEmpWageForCompany() {
		System.out.println("Employee Rate For Company is: " + this.empRate);
		// variables
		int empHrs = 0, totalEmpWage = 0, empWage = 0; // this variable made it global at the functional
														// level
		// computation
		for (int day = 1; day <= numOfDays; day++) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			empWage = empHrs * empRate;
			System.out.println("Employee Wage on Day " + day + " is " + empWage);
			totalEmpWage = totalEmpWage + empWage;
		}
		System.out.println("Total Emp Wage For Company : " + company + " is: " + totalEmpWage);

	}

	public static void main(String[] args) {
		// object Creation and Initialization For DMart Company
		EmpWageObject dMart = new EmpWageObject("DMart", 20, 2);
		// Calling Method By Using Object DMart
		dMart.calculateEmpWageForCompany();
		// object Creation and Initialization For Reliance Company
		EmpWageObject reliance = new EmpWageObject("Reliance", 25, 3);
		// Calling Method By Using Object Reliance
		reliance.calculateEmpWageForCompany();

	}

}
