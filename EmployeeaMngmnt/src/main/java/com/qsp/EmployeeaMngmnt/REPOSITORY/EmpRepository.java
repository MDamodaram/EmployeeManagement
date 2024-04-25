package com.qsp.EmployeeaMngmnt.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qsp.EmployeeaMngmnt.DTO.Employee;

public interface EmpRepository extends JpaRepository<Employee,Integer>
{

}
