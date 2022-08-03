package com.example.pro;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pro.model.Employee;

@Service
@Transactional
public class EmployeeService {
	@Autowired
	private EmployeeRepo emprepo;
	
	public String addEmployee(Employee emp) {
		emprepo.save(emp);
		return "saved";
	}
	public String updateEmployee(Employee emp) {
		emprepo.save(emp);
		return "saved";
	}
	public String deleteEmployee(Employee emp) {
		emprepo.delete(emp);
		return "Deleted";
	}
	public List<Employee> listEmployee(){
		return emprepo.findAll();
	}
	public Employee findEmpName(String name) {
		return emprepo.findByName(name);
	}
	public Employee findEmpDesignation(String designation) {
		return emprepo.findByDesignation(designation);
	}
	public String deleteEmployeeName(String name) {
		emprepo.deleteByName(name);
		return "Deleted";
	}
	public String deleteEmployeeDesignation(String designation) {
		emprepo.deleteByDesignation(designation);
		return "Deleted";
	}
}
