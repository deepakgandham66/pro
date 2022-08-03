package com.example.pro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pro.model.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
	public Employee findByName(String name);
	public Employee findByDesignation(String designation);
	public Employee deleteByName(String name);
	public Employee deleteByDesignation(String designation);
}
