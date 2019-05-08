package com.capgemini.jpaOneToManyMapping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.jpaOneToManyMapping.employee.Employee;

@Repository
public interface EmployeeDao  extends JpaRepository<Employee, Integer> {
    
}
