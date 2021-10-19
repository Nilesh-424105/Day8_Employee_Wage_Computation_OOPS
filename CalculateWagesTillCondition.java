package com.empwage;

/*
 * Calculate Wages till a condition of total working hours or 
 * days is reached for a month - Assume 100 hours
 */

public class CalculateWagesTillCondition {

	// constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;

	// To Calculate Employee Wage
	private void computeEmpWage() {

		// Variables
		int totalEmpHrs = 0, totalEmpWage = 0, totalWorkingDays = 0;

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
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs);
			System.out.println("Total Emp Hrs: " + totalEmpHrs);
		}
		totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("Total Emp Wage: " + totalEmpWage);
	}

	public static void main(String[] args) {
		// Object Creation
		CalculateWagesTillCondition empWageUC6 = new CalculateWagesTillCondition();
		empWageUC6.computeEmpWage();
	}

}
