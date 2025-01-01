package com.practice.repository;

import com.practice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface EmployeeRepository extends JpaRepository<Employee, Serializable> {
}
