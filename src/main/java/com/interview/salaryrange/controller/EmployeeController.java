package com.interview.salaryrange.controller;

import com.interview.salaryrange.service.IEmpoyeeService;
import com.interview.salaryrange.entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employee")
@RequiredArgsConstructor
public class EmployeeController {

   private final IEmpoyeeService empoyeeService;
  // private final EmployeeServiceImpl employeeService;
    // create
    @PostMapping
    public ResponseEntity<Employee> insertRecord(@RequestBody Employee emp){
        return ResponseEntity.status(HttpStatus.CREATED).body(empoyeeService.createEmp(emp));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeId(@PathVariable Long id){
        return ResponseEntity.ok(empoyeeService.getRecordById(id));
    }

}
