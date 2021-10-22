package com.empwage;

/*
 * Ability to get the Total Wage when queried by Company
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpWageBuilderMap {

	// constants
	private static final int IS_PART_TIME = 1;
	private static final int IS_FULL_TIME = 2;

	private List<CompanyEmpWage> companyWage;
	private Map<String, Integer> mapCompanyWage;

	// Constructore
	private EmpWageBuilderMap() {
		companyWage = new ArrayList<>();
		mapCompanyWage = new HashMap<>();
	}

	/*
	 * key-Value pair Company - key EmpWage - value key-value pair is basically
	 * dictionary
	 */
	// Instance Method To Add Company
	private void addCompany(String company, int empRate, int numOfDays) {
		companyWage.add(new CompanyEmpWage(company, empRate, numOfDays));
	}

	// Instance Method To Calculate Employee Wage
	private void calculateEmpWage() {
		for (int index = 0; index < companyWage.size(); index++) {
			CompanyEmpWage cmpWage = companyWage.get(index);
			int empWage = calculateEmpWageForCompany(cmpWage);
			mapCompanyWage.put(cmpWage.getCompany(), empWage);
		}

	}

	// Instance Method To Calculate Employee Wage For Each Company
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
			totalEmpWage = totalEmpWage + empWage;

		}
		return totalEmpWage;
	}

	public static void main(String[] args) {
		// Creating Object
		EmpWageBuilderMap empWageBuilder = new EmpWageBuilderMap();
		// Calling Method
		empWageBuilder.addCompany("Dmart", 20, 2);
		empWageBuilder.addCompany("Reliance", 25, 3);
		empWageBuilder.calculateEmpWage();
		System.out.println("Employee Wage For The Company Dmart is: " + empWageBuilder.mapCompanyWage.get("Dmart"));
		System.out
				.println("Employee Wage For The Company Reliance is: " + empWageBuilder.mapCompanyWage.get("Reliance"));
	}

}
