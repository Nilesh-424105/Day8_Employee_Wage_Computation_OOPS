package com.empwage;

/*
 * Solving Using Switch Case Statement
 */
public class SolvingUsingSwitchCase {

	// constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;

	// To Calculate Employee Wage
	private void computeEmpWage() {

		// Variables
		int empHrs = 0, empWage = 0;

		// computations
		int empCheck = (int) Math.floor(Math.random() * 10) % 3; // type casting (int) all belong to Number family
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
		System.out.println("Emp Wage: " + empWage);
	}

	public static void main(String[] args) {
		// Object Creation
		SolvingUsingSwitchCase empWageUC4 = new SolvingUsingSwitchCase();
		// Calling Method
		empWageUC4.computeEmpWage();
	}
}
