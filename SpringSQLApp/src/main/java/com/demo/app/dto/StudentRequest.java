package com.demo.app.dto;

import com.demo.app.model.Student;

public class StudentRequest {

	private Student student;

	public StudentRequest() {}
	
	public StudentRequest(Student student) {
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}
