package com.dgryzhkov.spring.rest.dao;

import com.dgryzhkov.spring.rest.entity.Employee;

import java.util.List;

/**
 * @author Dgryzhkov
 */
public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
