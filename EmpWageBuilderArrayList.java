package com.empwage;

import java.util.ArrayList;
import java.util.List;

public class EmpWageBuilderArrayList {
	// constants
	private static final int IS_PART_TIME = 1;
	private static final int IS_FULL_TIME = 2;

	private List<CompanyEmpWage> companyWage;

	private EmpWageBuilderArrayList() {
		companyWage = new ArrayList<>();
	}

	private void addCompany(String company, int empRate, int numOfDays) {
		companyWage.add(new CompanyEmpWage(company, empRate, numOfDays));
	}

	private void calculateEmpWage() {
		for (int index = 0; index < companyWage.size(); index++) {
			calculateEmpWageForCompany(companyWage.get(index));
		}

	}

	private int calculateEmpWageForCompany(CompanyEmpWage companyEmpWage) {

		int empHrs = 0, totalEmpWage = 0, empWage = 0;
		// computation
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
		return totalEmpWage;
	}

	public static void main(String[] args) {
		EmpWageBuilderArrayList empWageBuilder = new EmpWageBuilderArrayList();
		empWageBuilder.addCompany("Dmart", 20, 2);
		empWageBuilder.addCompany("Reliance", 25, 3);
		empWageBuilder.calculateEmpWage();
	}

}
