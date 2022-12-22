package com.Employees.Employees.service;

import com.Employees.Employees.entities.Employee;
import com.Employees.Employees.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    public Employee updateEmployee(Long id, Employee employee) {
        Employee emp = employeeRepository.findById(id).get();
        emp.setName(employee.getName());
        emp.setPhone(employee.getPhone());
        return employeeRepository.save(emp);
    }

    public void deleteAllEmployee() {
        employeeRepository.deleteAll();
    }

    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }


}
