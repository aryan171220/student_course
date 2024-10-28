package com.studentManagement.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long rollNumber;

	private String name;

	public Student(Long rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}

	public Student() {
		super();
	}

	public Long getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Long rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
