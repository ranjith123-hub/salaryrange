package com.interview.salaryrange;


import com.interview.salaryrange.entity.Employee;
import com.interview.salaryrange.service.IEmpoyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class SalaryrangeApplication {


	public static void main(String[] args) {
		SpringApplication.run(SalaryrangeApplication.class, args);
//		List<Employee> employees = new ArrayList<>();
//		employees.stream().filter(e->e.getSalary()>10000)
//				.map(Employee::getName)
//				.sorted()
//				.distinct()
//				.collect(Collectors.toList());
//		System.out.println(employees);

	}

}
