package com.empwage;

public class EmployeeWageBuilder {

	// constants
	private static final int IS_PART_TIME = 1;
	private static final int IS_FULL_TIME = 2;

	// Declared Array
	CompanyEmpWage[] companyWage;
	// Initially number of company is zero
	int numOfCompany = 0;

	// constructor
	private EmployeeWageBuilder() {
		// Assigning Value In Array
		companyWage = new CompanyEmpWage[5];
	}

	// Instance Method user for Add Company
	private void addCompany(String company, int empRate, int numOfDays) {
		companyWage[numOfCompany++] = new CompanyEmpWage(company, empRate, numOfDays);
	}

	// Instance Method used to calculate Employee Wage
	private void calculateEmpWage() {
		for (int index = 0; index < companyWage.length; index++) {
			calculateEmpWageForCompany(companyWage[index]);
		}

	}

	// Instance Method used to calculate Employee Wage For Each Company
	private int calculateEmpWageForCompany(CompanyEmpWage companyEmpWage) {

		int empHrs = 0, totalEmpWage = 0, empWage = 0;
		// computation
		if (companyEmpWage != null) {
			int numOfDays = companyEmpWage.getNumOfDays();
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
				empWage = empHrs * companyEmpWage.getEmpRate();
				System.out.println("Employee Wage on Day " + day + " is " + empWage);
				totalEmpWage = totalEmpWage + empWage;
			}
			System.out.println("Total Emp Wage For Company : " + companyEmpWage.getCompany() + " is: " + totalEmpWage);
		}
		return totalEmpWage;
	}

	public static void main(String[] args) {
		// Object Creation
		EmployeeWageBuilder empWageBuilder = new EmployeeWageBuilder();
		// Calling Method For Add Company By Using Object
		empWageBuilder.addCompany("Dmart", 20, 2);
		empWageBuilder.addCompany("Reliance", 30, 3);
		empWageBuilder.addCompany("Flipkart", 25, 4);
		empWageBuilder.calculateEmpWage();
	}

}
