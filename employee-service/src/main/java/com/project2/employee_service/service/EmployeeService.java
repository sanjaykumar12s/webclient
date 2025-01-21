package com.project2.employee_service.service;

import com.project2.employee_service.model.Employee;
import com.project2.employee_service.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private  EmployeeRepository repository;

    public Employee createEmployee(Employee employee) {
        return repository.save(employee);
    }

    // Add this method to resolve the error
    public Optional<Employee> getEmployeeById(Long id) {
        return repository.findById(id);
    }
}
