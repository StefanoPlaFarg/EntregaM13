/**
 * 
 */
package com.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.domain.Employee;
import com.application.service.EmployeeService;

/**
 * @author stefano
 *
 */

@RestController
//@RequestMapping("/api")
public class EmployeeController {

	//@Autowired
	//EmployeeService employeeService;

	// http://localhost:8080/api/test (GET)
	//@RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
	//@ResponseBody
	@GetMapping("/test")
	public String test() {
		return "Test done";
	}

	/*
	
	// http://localhost:8080/api/employees (GET) -> GET all Employees
	@RequestMapping(path = "/employees", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<Employee> getEmployees() {
		return employeeService.getAllEmployees();

	}

	// http://localhost:8080/api/employees (DELETE) -> DELETE all Employees
	@RequestMapping(path = "/employees/", method = RequestMethod.DELETE, produces = "application/json")
	@ResponseBody
	public String deleteAllEmployees() {
		return employeeService.deleteAllEmployees();

	}

	// http://localhost:8080/api/employees/id (GET) -> GET Employee by ID
	@RequestMapping(path = "/employees/{id}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public Employee getEmployeeById(@PathVariable("id") int id) {
		return employeeService.getEmployeeById(id);

	}

	// http://localhost:8080/api/employees/add (POST) -> CREATE New Employee
	@RequestMapping(path = "/employees/add", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public String addEmployee(@RequestBody Employee newEmployee) {

		return employeeService.saveEmployee(newEmployee);

	}

	// http://localhost:8080/api/employees/delete/id (PUT) -> UPDATE Employee by ID
	@RequestMapping(path = "/employees/{id}", method = RequestMethod.PUT, produces = "application/json")
	@ResponseBody
	public String updateEmployeeById(@PathVariable("id") int id, @RequestBody Employee employeeUpdated) {
		return employeeService.updateEmployee(id, employeeUpdated);

	}

	// http://localhost:8080/api/employees/id (DELETE) -> DELETE Employee by ID
	@RequestMapping(path = "/employees/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
	@ResponseBody
	public String deleteEmployee(@PathVariable("id") int id) {
		return employeeService.deleteEmployee(id);

	}
    
    */
	

}
