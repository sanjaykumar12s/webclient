package com.project2.employee_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project2.employee_service.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
