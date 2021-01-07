/**
 * 
 */
package com.application.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.application.domain.Employee;

/**
 * @author stefano
 *
 */

@Service
public class EmployeeService {

	List<Employee> employeeRepository = new ArrayList<Employee>();
	
	
	//Create	
	public String saveEmployee(Employee employee) {

		employeeRepository.add(employee);		
		return "Employee saved";

	}
	
	//Read
	public Employee getEmployeeById(int id) {

		if (employeeRepository.get(id) != null) {

			return employeeRepository.get(id);

		}

		return null;

	}
	
	
	//Update
	public String updateEmployee (int id, Employee employeeUpdated) {
		
		if (employeeRepository.get(id) != null) {

			employeeRepository.get(id).setJob(employeeUpdated.getJob());
			employeeRepository.get(id).setName(employeeUpdated.getName());
			employeeRepository.get(id).setSalary(employeeUpdated.getSalary());
			 
			
			return "Employee updated";

		}
		
		return "Employee not found";
		
	}
	

    //Delete
     public String deleteEmployee (int id) {
		
		if (employeeRepository.get(id) != null) {

			employeeRepository.remove(id);
			
			return "Employee deleted";

		}
		
		return "Employee not found";
	}
	
	
     
   //Get all Employees
     public List<Employee> getAllEmployees () {
		
		return employeeRepository;
	}
     
     
     
   //Delete All Employees
     public String deleteAllEmployees () {
		
		if (employeeRepository.isEmpty() != false) {

			employeeRepository.removeAll(employeeRepository);
			
			return "All Employees deleted";

		}
		
		return "Any Employee found";
	}
     
	
}
