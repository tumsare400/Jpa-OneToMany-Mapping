package com.capgemini.jpaOneToManyMapping.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.jpaOneToManyMapping.certificate.Certificate;
import com.capgemini.jpaOneToManyMapping.dao.EmployeeDao;
import com.capgemini.jpaOneToManyMapping.employee.Employee;

@RestController
public class EmployeeController {
   @Autowired
   EmployeeDao dao;
   
   @RequestMapping("/")
   public void add() {
	   
	   Set<Certificate> certifications= new HashSet<Certificate>();
	   Certificate  c = new Certificate(11, "Angular");
	   Certificate  c1 = new Certificate(12, "Javascript");
	   certifications.add(c);
	   certifications.add(c1);
	   
	   Employee employee = new Employee(1, "Payal", certifications);
	    dao.save(employee);
   }
   
   @RequestMapping("/get")
   public Employee getAll() {
	   Employee employee= dao.findById(1).get();
	   return employee;
   }
}
