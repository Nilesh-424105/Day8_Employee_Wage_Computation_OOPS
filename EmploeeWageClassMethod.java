package com.empwage;

/*
 * Re factor the Code to write a Class Method to Compute Employee Wage 
 */

public class EmploeeWageClassMethod {

	// constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	// instance Variables
	String company;
	int empRate;
	int numOfDays;
	int maxHrsInMonth;

	private static void computeEmpWageForCompany(String company, int empRate, int numOfDays, int maxHrsInMonth) {

		// Variables
		int empWage = 0, totalEmpHrs = 0, totalEmpWage = 0, totalWorkingDays = 0;

		// computation
		while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays < numOfDays) {
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
			empWage = empHrs * empRate;
			System.out.println("Employee Wage on Day " + totalWorkingDays + " is " + empWage);
			totalEmpWage = totalEmpWage + empWage;
		}
		System.out.println("Total Emp Wage: " + totalEmpWage);
	}

	public static void main(String[] args) {

		System.out.println("Employee Wage for company Dmart is: ");
		computeEmpWageForCompany("DMart", 20, 2, 100);
		System.out.println("Employee Wage for company Reliance is: ");
		computeEmpWageForCompany("Reliance", 25, 3, 200);

	}

}
