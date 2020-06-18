package net.devsaci.springboot.service;

import java.util.List;

import net.devsaci.springboot.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();

	void saveEmployee(Employee employee);

}
