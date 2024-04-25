package com.qsp.EmployeeaMngmnt.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.EmployeeaMngmnt.DTO.Employee;
import com.qsp.EmployeeaMngmnt.REPOSITORY.EmpRepository;

@Repository
public class EmpDao 
{
	@Autowired
	EmpRepository repository;
	
	public String insertEmp(Employee e)
	{
		repository.save(e);
		return "Employee added sucessfully!!";
	}
	
	public Employee searchEmp(int id)
	{
		Optional<Employee> opt=repository.findById(id);
		
		if(opt.isPresent())
		{
			return opt.get();
			
		}
		return null;
	}
	
	public List<Employee> getAllEmp()
	{
		List<Employee> e=repository.findAll();
		return e;
	}
	
	public Employee updateEmp(int id,double newSal,String newDname)
	{
		Employee e=searchEmp(id);
		if(e!=null)
		{
			e.setDept_name(newDname);
			e.setSalary(newSal);
			return repository.save(e);
		}
		return null;
	}
	
	public void deleteEmp(int id)
	{
		Employee e=searchEmp(id);
		if(e!=null)
		{
			repository.delete(e);
		}
	}

}
