package com.empwage;

/*
 * To Check Employee Is Present Or Absent
 */
public class CheckEmployeePresentAbsent {

	// constants
	private static final int IS_FULL_TIME = 1;

	// To Check Employee is Present or Absent
	private void empCheck() {

		// Computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
	}

	public static void main(String[] args) {
		// Object Creation
		CheckEmployeePresentAbsent empWageUC1 = new CheckEmployeePresentAbsent();
		// Calling Method
		empWageUC1.empCheck();
	}

}
