package com.task.interview.service;

import com.task.interview.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployee(Long employeeId);
    void deleteEmployee(Long employeeId);
}
