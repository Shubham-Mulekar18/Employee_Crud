package org.rnt.SpringMVCRNT.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.rnt.SpringMVCRNT.model.Company;
import org.rnt.SpringMVCRNT.model.Employee;
import org.rnt.SpringMVCRNT.services.EmployeeSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@Autowired
	EmployeeSer ser;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws Exception{
		return new ModelAndView("home");
	}

	@RequestMapping("addemp")
	public String addeEmployee()
	{
		return "addnewemployee";
	}

	@RequestMapping("saveemp")
	public String addemployee(Employee e,Map m)
	{
	boolean NameValidate=ser.validateName(e);
	boolean emailValidate = ser.validateEmail(e);
//	boolean contactvalidate=ser.isValidContact(e);
	
	if(NameValidate)
	{
			if(emailValidate)
			{
//				if(contactvalidate)
//				{
			 		if(ser.isAddEmployee(e))
			 		{
			 			m.put("m", "Employee Added SuccessFully.........");
			 			return "addnewemployee";
			 		}
			 		else
			 		{
			 			m.put("m", "Some problrm is there.........");
			 			return "addnewemployee";
			 		}
//				}
//				else
//				{
//					m.put("m", "Contact already present in Database.........");
//					return "addnewemployee";
//				}
			}
			else
			{
				m.put("m", "Email already present in Database.........");
				return "addnewemployee";
			}
	}
	else
	{
		m.put("m", "Name already present in Database.........");
		return "addnewemployee";
	}

}

	@RequestMapping("viewemp")
	public String view(Map m)
	{
		List l = ser.viewAllEmployee();
		m.put("m", l);

		return "viewEmployeeDetails";

	}

	@RequestMapping("addcmp")
	public String addCompany()
	{
		return "addnewcompany";
	}

	@RequestMapping("savecmp")
	public String addecompany(Company c,Map m)
	{
	boolean Cname=ser.validateCname(c);
	if(Cname)
	{
	boolean b=ser.isAddCompany(c);
		if(b)
		{
			m.put("m", "Company Added Successfully.......");
			return "addnewcompany";
		}
		else
		{
			m.put("m", "Some problrm is there.......");
			return "addnewcompany";
		}
	}
	else
	{
		m.put("m", "Name Must Be Unique.......");
		return "addnewcompany";
	}

	}

	@RequestMapping("viewcmp")
	public String viewCmp(Map m)
	{
		List<Company> l = ser.viewAllCompany();
		m.put("m", l);

		return "viewCompanyDetails";

	}

	@RequestMapping("search")
	public String searchEmployee()
	{
		return "searchemp";

	}

	@RequestMapping("viewname")
	public String searchemp(@RequestParam("name") String name,Map m)
	{
		List<Employee> l =ser.searchEmployee(name);
		m.put("m", l);
		return "searchemp";

	}

	@RequestMapping("deleteEmp")
	public String DeleteEmployee(@RequestParam("id")int id,Map m)
	{
		ser.deleteEmployee(id);
		List<Employee> l= ser.viewAllEmployee();
		m.put("m", l);
		return "viewEmployeeDetails";

	}

	@RequestMapping(value="up",method=RequestMethod.GET)
	public String updateEmployee(@RequestParam("id")int id,@RequestParam("name")String n,@RequestParam("email")String e,@RequestParam("gender")String g,@RequestParam("contact")String c,Map m)
	{
		m.put("id", id);
		m.put("name", n);
		m.put("email", e);
		m.put("gender", g);
		m.put("contact", c);

		return "updateEmployee";
	}

	@RequestMapping(value="xupdateEmp",method=RequestMethod.POST)
	public String xupateEmp(Employee e,Map<String,List<Employee>> m)
	{
		boolean b=ser.updateEmployee(e);
		if(b)
		{
			List l = ser.viewAllEmployee();
			m.put("m", l);
			return "viewEmployeeDetails";
		}
		else
		{
		return "viewEmployeeDetails";
		}
	}

	@RequestMapping("deleteCmp")
	public String DeleteCompany(@RequestParam("cid")int cid,Map m)
	{
		ser.deleteCompany(cid);
		List<Employee> l= ser.viewAllCompany();
		m.put("m", l);
		return "viewCompanyDetails";

	}

	@RequestMapping(value="upCmp",method=RequestMethod.GET)
	public String updateCompany(@RequestParam("cid")int cid,@RequestParam("cname")String n,@RequestParam("position")String p,Map m)
	{
		m.put("cid", cid);
		m.put("cname", n);
		m.put("position", p);

		return "updateCompany";
	}

	@RequestMapping(value="xupdateCmp",method=RequestMethod.POST)
	public String xupateCmp(Company c,Map<String,List<Company>> m)
	{
		boolean b=ser.updateCompany(c);
		if(b)
		{
			List<Company>l=ser.viewAllCompany();
			m.put("m", l);
			return "viewCompanyDetails";
		}
		else
		{
		return "viewCompanyDetails";
		}
	}

}
