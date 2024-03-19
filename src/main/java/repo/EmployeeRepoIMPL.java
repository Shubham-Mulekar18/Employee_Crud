package org.rnt.SpringMVCRNT.repo;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.rnt.SpringMVCRNT.model.Company;
import org.rnt.SpringMVCRNT.model.Employee;
import org.springframework.stereotype.Repository;

@Repository("repo")
public class EmployeeRepoIMPL extends DB implements EmployeeRepo{

	public boolean isAddEmployee(Employee e) {
		try
		{
			stmt=conn.prepareStatement("insert into Employee values('0',?,?,?,?,?)");
			stmt.setString(1, e.getName());
			stmt.setString(2, e.getEmail());
			stmt.setString(3, e.getGender());
			stmt.setString(4, e.getContact());
			stmt.setInt(5, e.getCid());
			int value=stmt.executeUpdate();
			if(value>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is : "+ex);
		}
		return false;
	}

	public List viewAllEmployee() {

		try
		{
			stmt=conn.prepareStatement("select e.id,e.name,e.email,e.gender,e.contact,c.cname,c.position from employee e inner join company c on e.cid=c.cid ");
			rs=stmt.executeQuery();
			List l = new ArrayList();
			while(rs.next())
			{
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setEmail(rs.getString(3));
				e.setGender(rs.getString(4));
				e.setContact(rs.getString(5));
				e.setCname(rs.getString(6));
				e.setPosition(rs.getString(7));
				l.add(e);

			}

			return l;
		}
		catch(Exception ex)
		{
			System.out.println("Error is : "+ex);
		}
		return null;
	}

	public boolean isAddCompany(Company c) {
		try
		{
			stmt=conn.prepareStatement("insert into Company values('0',?,?)");
			stmt.setString(1, c.getCname());
			stmt.setString(2, c.getPosition());
			int value=stmt.executeUpdate();
			if(value>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is : "+ex);
		}
		return false;
	}

	public List viewAllComapny() {

		try
		{
		stmt=conn.prepareStatement("select * from Company");
		rs=stmt.executeQuery();
		List l =  new ArrayList();
		while(rs.next())
		{
			Company c = new Company();
			c.setCid(rs.getInt(1));
			c.setCname(rs.getString(2));
			c.setPosition(rs.getString(3));
			l.add(c);
		}

		return l;

		}
		catch(Exception ex)
		{
			System.out.println("Error is : "+ex);
		}
		return null;
	}

public List<Employee>searchEmployee(String name) {

		try
		{
			List<Employee> l=new ArrayList<Employee>();
			stmt=conn.prepareStatement("select e.id,e.name,e.email,e.gender,e.contact,c.cname,c.position from employee e inner join company c on e.cid=c.cid where e.name=?");
			stmt.setString(1, name);
			rs=stmt.executeQuery();
			while(rs.next())
			{
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setEmail(rs.getString(3));
				e.setGender(rs.getString(4));
				e.setContact(rs.getString(5));
				e.setCname(rs.getString(6));
				e.setPosition(rs.getString(7));
				l.add(e);
			}
			return l;
		}
		catch(Exception ex)
		{
			System.out.println("Error is : "+ex);
		}
		return null;
	}

	public boolean validateEmail(Employee e)
	{

		boolean validateEmailStatus=false;
		try
		{
			stmt=conn.prepareStatement("select * from Employee where email=?");
			stmt.setString(1, e.getEmail());
			rs=stmt.executeQuery();
			if(rs.next())
			{
				return validateEmailStatus;
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is : "+ex);
		}
		return true;
	}

	public boolean deleteEmployee(int id) {
		try
		{
			stmt=conn.prepareStatement("delete from employee where id=?");
			stmt.setInt(1, id);
			int value=stmt.executeUpdate();
			if(value>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is : "+ex);
		}
		return false;
	}

	public boolean updateEmploee(Employee e) {
		try
		{
			stmt=conn.prepareStatement("update Employee set name=?,email=?,gender=?,contact=? where id=?");
			stmt.setString(1, e.getName());
			stmt.setString(2, e.getEmail());
			stmt.setString(3, e.getGender());
			stmt.setString(4, e.getContact());
			stmt.setInt(5, e.getId());
			int value=stmt.executeUpdate();
			if(value>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is : "+ex);
		}
		return false;
	}

	public boolean deleteCompany(int cid) {
		try
		{
			stmt=conn.prepareStatement("delete from Company where cid=?");
			stmt.setInt(1, cid);
			int value=stmt.executeUpdate();
			if(value>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is : "+ex);
		}
		return false;
	}

	public boolean updateCompany(Company c) {
		try
		{
			stmt=conn.prepareStatement("update Company set cname=?,position=? where cid=?");
			stmt.setString(1, c.getCname());
			stmt.setString(2, c.getPosition());
			stmt.setInt(3, c.getCid());
			int value=stmt.executeUpdate();
			if(value>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is : "+ex);
		}
		return false;
	}

	public boolean validateCname(Company c) {
		try
		{
			stmt=conn.prepareStatement("select cname from Company where cname=?");
			stmt.setString(1, c.getCname());
			rs=stmt.executeQuery();
			if(rs.next())
			{
		    return false;
			}
		}
		catch(Exception ex)
		{
		     System.out.println("Error is : "+ex);
		}
		return true;
	}

	public boolean validateName(Employee e) {
		try
		{
			stmt=conn.prepareStatement("select * from Employee where name=?");
			stmt.setString(1, e.getName());
			rs=stmt.executeQuery();
			if(rs.next())
			{
			return false;
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error : "+ex);
		}
		return true;
	}

//	public boolean isValidContact(Employee e) {
//		try
//		{
//			stmt=conn.prepareStatement("select * from Employee where contact=?");
//			stmt.setString(1, e.getContact());
//			String regex = "^[0-9]{10}$";
//	        Pattern pattern = Pattern.compile(regex);
//	        Matcher matcher = pattern.matcher(e.getContact());
//	        return matcher.matches();
//		}
//		catch(Exception ex)
//		{
//			System.out.println("Error is : "+ex);
//		}
//		return true;
//	}


}
