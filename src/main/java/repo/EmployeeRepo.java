package org.rnt.SpringMVCRNT.repo;

import java.util.List;

import org.rnt.SpringMVCRNT.model.Company;
import org.rnt.SpringMVCRNT.model.Employee;

public interface EmployeeRepo {

	//Add Employee
	public boolean isAddEmployee(Employee e);

	//View Employee
	public List viewAllEmployee();

	//Delete Employee
	public boolean deleteEmployee(int id);

	//Update Employee
	public boolean updateEmploee(Employee e);

	//Search Employee By Name
	public List searchEmployee(String name);

	//Email Validation
	public boolean validateEmail(Employee e);

	//Name Validation
	public boolean validateName(Employee e);
	
//	//Contact Validation
//	public  boolean isValidContact(Employee e);

	//Add Company
	public boolean isAddCompany(Company c);

	//View Company
	public List viewAllComapny();

	//Delete Company
	public boolean deleteCompany(int cid);

	//Update Company
	public boolean updateCompany(Company c);

	//Company Name Validation
	public boolean validateCname(Company c);

}
