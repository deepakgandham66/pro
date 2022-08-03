package com.example.pro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pro.model.Employee;

@RestController
@RequestMapping("/emp")
public class EmployeeRestC {
	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/list")
	public List<Employee> getList(){
		return empService.listEmployee();
	}
	
	@GetMapping("/{name}")
	public Employee getEmpByName(@PathVariable String name) {
		return empService.findEmpName(name);
	}
	
	@GetMapping("/{designation}")
	public Employee getEmpByDesignation(@PathVariable String designation) {
		return empService.findEmpDesignation(designation);
	}
	
	@DeleteMapping("/{name}/delete")
	public String deleteEmpByName(@PathVariable String name) {
		return empService.deleteEmployeeName(name);
	}
	
	@DeleteMapping("/{designation}/delete")
	public String deleteByEmpDesignation(@PathVariable String designation) {
		return empService.deleteEmployeeDesignation(designation);
	}
}
