package com.qsp.EmployeeaMngmnt.CONTROLLER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.EmployeeaMngmnt.DAO.EmpDao;
import com.qsp.EmployeeaMngmnt.DTO.Employee;

@RestController
public class EmpController 
{

	@Autowired
	EmpDao dao;
	
	@PostMapping("/emp")
	public String addEmp(@RequestBody Employee e)
	{
		return dao.insertEmp(e);
	}
	
	@GetMapping("/emp")
	public Employee findEmp(@RequestParam int id)
	{
		return dao.searchEmp(id);
	}
	
	@GetMapping("/empp")
	public List<Employee> getEmp()
	{
		return dao.getAllEmp();
	}
	
	@PutMapping("/emp")
	public Employee updateEmpById(@RequestParam int id,@RequestParam String dept_name,@RequestParam double sal)
	{
		return dao.updateEmp(id, sal, dept_name);
	}
	
	@DeleteMapping("/emp")
	public void deleteById(@RequestParam int id)
	{
		dao.deleteEmp(id);
	}
}
