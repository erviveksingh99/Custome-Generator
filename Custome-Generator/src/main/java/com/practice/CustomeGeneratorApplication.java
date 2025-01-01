package com.practice;

import com.practice.entity.Employee;
import com.practice.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CustomeGeneratorApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CustomeGeneratorApplication.class, args);
        System.err.println("Server Started...");

       /* EmployeeRepository repository = context.getBean(EmployeeRepository.class);
        Employee emp = new Employee();
        emp.setEmpName("Smith");
        emp.setAge(24);
        emp.setSalary(5000.00);

        Employee emp2=new Employee();
        emp2.setEmpName("Jhon");
        emp2.setAge(24);
        emp2.setSalary(5000.00);

      List<Employee> empData=  Arrays.asList(emp,emp2);

        try {
            repository.saveAll(empData);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
