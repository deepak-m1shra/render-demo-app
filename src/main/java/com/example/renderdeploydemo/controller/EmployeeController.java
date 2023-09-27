package com.example.renderdeploydemo.controller;

import com.example.renderdeploydemo.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private static final List<Employee> employees = List.of(
            new Employee(1L, "Deepak", "Mishra", "IT"),
            new Employee(2L, "Divit", "Mishra", "Entertainment"),
            new Employee(3L, "Vijaya", "Kumari", "Finance"),
            new Employee(4L, "Jitendra", "Sharma", "Economics")
    );

    @GetMapping
        public List<Employee> getEmployee() {
        return employees;
    }
}
