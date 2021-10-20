package com.empwage;

/*
 * Ability to manage Employee Wage of multiple companies
 */

public class CompanyEmpWage {

	// Instance Variables
	String company;
	// Employee Rate Per Hour
	int empRate;
	// Number of Working Days
	int numOfDays;

	// constructor
	public CompanyEmpWage(String company, int empRate, int numOfDays) {
		super();
		this.company = company;
		this.empRate = empRate;
		this.numOfDays = numOfDays;
	}

	// getters and setters
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getEmpRate() {
		return empRate;
	}

	public void setEmpRate(int empRate) {
		this.empRate = empRate;
	}

	public int getNumOfDays() {
		return numOfDays;
	}

	public void setNumOfDays(int numOfDays) {
		this.numOfDays = numOfDays;
	}

}
