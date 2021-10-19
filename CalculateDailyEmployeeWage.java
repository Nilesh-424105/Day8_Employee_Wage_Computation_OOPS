package com.empwage;

/*
 * To Check Employee Is Present Or Absent
 */
public class CalculateDailyEmployeeWage {

	// constants
	private static final int IS_FULL_TIME = 1;
	private static final int EMP_RATE_PER_HOUR = 20;

	// To Calculate Employee Wage
	private void computeEmpWage() {

		// Variables
		int empHrs = 0, empWage = 0;
		// computations
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME)
			empHrs = 8;
		else
			empHrs = 0;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("EmpWage: " + empWage);

	}

	public static void main(String[] args) {
		// Object Creation
		CalculateDailyEmployeeWage empWageUC2 = new CalculateDailyEmployeeWage();
		// Calling Method
		empWageUC2.computeEmpWage();
	}
}
