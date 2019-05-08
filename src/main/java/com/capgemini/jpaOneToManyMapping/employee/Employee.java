package com.capgemini.jpaOneToManyMapping.employee;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.capgemini.jpaOneToManyMapping.certificate.Certificate;

@Entity
public class Employee {

	@Id
	private int employeeId;
	private String employeeName;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Certificate> certifications;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, Set<Certificate> certifications) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.certifications = certifications;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Set<Certificate> getCertifications() {
		return certifications;
	}

	public void setCertifications(Set<Certificate> certifications) {
		this.certifications = certifications;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", certifications="
				+ certifications + "]";
	}

}
