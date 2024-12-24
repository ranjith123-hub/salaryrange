package com.interview.salaryrange.repository;

import com.interview.salaryrange.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeRepo extends JpaRepository<Employee, Long> {
    @Query("SELECT e FROM Employee e WHERE e.salary = (SELECT MAX(e2.salary) FROM Employee e2)")
    List<Employee> findHighSalaryPaidEmployees();

}
