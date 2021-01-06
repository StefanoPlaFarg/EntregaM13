/**
 * 
 */
package com.domain;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author stefano
 *
 */
public class Employee {
	
	private static int id=1;
	private double salary;
	private String name;
	
	@Autowired
	private Jobs job;
	/**
	 * @return the id
	 */
	
	public Employee () {
		
		id=id++;
		
	}
	
	public static int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public static void setId(int id) {
		Employee.id = id;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the job
	 */
	public Jobs getJob() {
		return job;
	}
	/**
	 * @param job the job to set
	 */
	public void setJob(Jobs job) {
		this.job = job;
	}
	
	
	
	

}
