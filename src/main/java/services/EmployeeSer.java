package org.rnt.SpringMVCRNT.services;

import java.util.List;

import org.rnt.SpringMVCRNT.model.Company;
import org.rnt.SpringMVCRNT.model.Employee;

public interface EmployeeSer {

	public boolean isAddEmployee(Employee e);

	public List viewAllEmployee();

	public boolean isAddCompany(Company c);

	public List viewAllCompany();

	public List searchEmployee(String name);

	public boolean deleteEmployee(int id);

	public boolean updateEmployee(Employee e);

	public boolean deleteCompany(int cid);

	public boolean updateCompany(Company c);

	public boolean validateEmail(Employee e);

	public boolean validateName(Employee e);
	
//	public boolean isValidContact(Employee e);

	public boolean validateCname(Company c);

}
