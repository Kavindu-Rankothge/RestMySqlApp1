package com.demo.app.dto;

public class StudentResponse {
	
	private String name;
	private String subject;
	
	public StudentResponse() {}
	
	public StudentResponse(String name, String subject) {
		this.name = name;
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}
