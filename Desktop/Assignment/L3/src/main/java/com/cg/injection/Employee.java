package com.cg.injection;
import java.awt.List;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int emp_id;
	private String emp_name;
	private double salary;
	private String BU;
	private int age;
	 List Employeelist;

			
			
	public int getEmp_id() {
		return emp_id;
	}



	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}



	public String getEmp_name() {
		return emp_name;
	}



	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public String getBU() {
		return BU;
	}



	public void setBU(String bU) {
		BU = bU;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}
	

	
	   

		public List getEmployeelist() {
			return Employeelist;
		}

		public void setEmployeelist(List employeelist) {
			Employeelist = employeelist;
		}
		
		
	




	public void showResult() {
		System.out.println("\nEmployee Details?\n EmployeeId= " + emp_id + "\n EmployeeName= " + emp_name + "\n Salary= " + salary +" \n BusinnessUnit=" +BU+ " \n Age=" +age+"\n Employeelist="+Employeelist);     	
	
	}

	}
