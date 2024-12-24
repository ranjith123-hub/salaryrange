package com.interview.salaryrange.service.impl;

import com.interview.salaryrange.exceptions.ResourceNotFoundException;
import com.interview.salaryrange.repository.DepartmentRepository;
import com.interview.salaryrange.repository.DesignationRepository;
import com.interview.salaryrange.repository.IEmployeeRepo;
import com.interview.salaryrange.service.IEmpoyeeService;
import com.interview.salaryrange.entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements IEmpoyeeService {

    private final IEmployeeRepo repo;
    private final DepartmentRepository departmentRepository;
    private final DesignationRepository designationRepository;

   @Override
    public Employee createEmp(Employee emp) {
        return repo.save(emp);
    }

   @Override
    public Employee getRecordById(Long id) {
        return repo.findById(id).orElseThrow(()->
                new ResourceNotFoundException("record is not available with gievn id!! try again"));
    }

   @Override
    public List<Employee> getAllRecords() {
       List<Employee> employees = this.repo.findAll();
       return employees;
    }

   @Override
    public List<Employee> getHighSalaryPaidEmployees() {

       return repo.findHighSalaryPaidEmployees();
    }
}
