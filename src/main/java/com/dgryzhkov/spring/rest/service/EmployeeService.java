package com.dgryzhkov.spring.rest.service;

import com.dgryzhkov.spring.rest.entity.Employee;

import java.util.List;

/**
 * @author Dgryzhkov
 */
public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
