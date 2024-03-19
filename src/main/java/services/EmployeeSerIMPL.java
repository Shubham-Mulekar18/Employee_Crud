package org.rnt.SpringMVCRNT.services;

import java.util.List;

import org.rnt.SpringMVCRNT.model.Company;
import org.rnt.SpringMVCRNT.model.Employee;
import org.rnt.SpringMVCRNT.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ser")
public class EmployeeSerIMPL implements EmployeeSer{

	@Autowired
	EmployeeRepo repo;

	public boolean isAddEmployee(Employee e) {

		return repo.isAddEmployee(e) ;
	}

	public List viewAllEmployee() {

		return repo.viewAllEmployee();
	}

	public boolean isAddCompany(Company c) {

		return repo.isAddCompany(c);
	}

	public List viewAllCompany() {

		return repo.viewAllComapny();
	}

    public List<Employee> searchEmployee(String name) {

		return repo.searchEmployee(name);

    }

	public boolean validateEmail(Employee e)
	{
		return repo.validateEmail(e);

	}

	public boolean deleteEmployee(int id) {

		return repo.deleteEmployee(id);
	}

	public boolean updateEmployee(Employee e) {

		return repo.updateEmploee(e);
	}

	public boolean deleteCompany(int cid) {

		return repo.deleteCompany(cid);
	}

	public boolean updateCompany(Company c) {

		return repo.updateCompany(c);
	}

	public boolean validateCname(Company c) {

		return repo.validateCname(c);
	}

	public boolean validateName(Employee e) {

		return repo.validateName(e);
	}

//	public boolean isValidContact(Employee e) {
//		
//		return repo.isValidContact(e);
//	}

}
