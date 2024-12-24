package com.interview.salaryrange.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "employee_info")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double salary;

//    @ManyToOne
//    @JoinColumn(name = "dept_id")
    private Department dept;

//    @ManyToOne
//    @JoinColumn(name = "designation_id")
    private Designation desg;

}
