package com.empwage;

/*
 * Re factor the Code to write a Class Method to Compute Employee Wage 
 */

public class EmploeeWageClassMethod {

	// constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;

	// Method Used To Calculate Employee Wage For Company
	private static void computeEmpWageForCompany() {

		// Variables
		int empWage = 0, totalEmpHrs = 0, totalEmpWage = 0, totalWorkingDays = 0;

		// computation
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			int empHrs = 0; // local variable
			totalWorkingDays++;
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
			empWage = empHrs * EMP_RATE_PER_HOUR;
			System.out.println("Employee Wage on Day " + totalWorkingDays + " is " + empWage);
			totalEmpWage = totalEmpWage + empWage;
		}
		System.out.println("Total Emp Wage: " + totalEmpWage);
	}

	public static void main(String[] args) {

		System.out.println("Employee Wage for company is: ");
		// Method Calling
		computeEmpWageForCompany();

	}

}
