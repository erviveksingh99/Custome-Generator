package com.practice.service;

import com.practice.entity.Employee;
import com.practice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepo;

    @Override
    public Employee create(Employee employee) {
        return employeeRepo.save(employee);
    }
}
