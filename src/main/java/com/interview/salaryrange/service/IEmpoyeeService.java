package com.interview.salaryrange.service;

import com.interview.salaryrange.entity.Employee;

import java.util.List;

public interface IEmpoyeeService {
    // create
     Employee createEmp(Employee emp);

    // get single record
       Employee getRecordById(Long id);
    // get all records
     List<Employee> getAllRecords();
    // get record for salary in range
        List<Employee> getHighSalaryPaidEmployees();
    // update record

    // delete record

}
