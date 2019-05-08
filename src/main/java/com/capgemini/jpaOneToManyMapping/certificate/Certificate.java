package com.capgemini.jpaOneToManyMapping.certificate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.capgemini.jpaOneToManyMapping.employee.Employee;

@Entity
public class Certificate {
	@Id
	private int certificateId;
	private String certificateName;
	
	@ManyToOne
	private Employee employee;

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificate(int certificateId, String certificateName) {
		super();
		this.certificateId = certificateId;
		this.certificateName = certificateName;
	}

	public int getCertificateId() {
		return certificateId;
	}

	public void setCertificateId(int certificateId) {
		this.certificateId = certificateId;
	}

	@Override
	public String toString() {
		return "certificate [certificateId=" + certificateId + ", certificateName=" + certificateName + "]";
	}

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

}
