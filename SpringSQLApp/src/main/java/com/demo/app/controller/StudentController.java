package com.demo.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.app.dto.StudentRequest;
import com.demo.app.dto.StudentResponse;
import com.demo.app.model.Student;
import com.demo.app.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;
	
//	@Autowired
//	private MarkRepository markRepository;
	
	@PostMapping("/newstudent")
	public Student saveStudent(@RequestBody StudentRequest studentRequest) {
		return studentRepository.save(studentRequest.getStudent());
	}
	
	@GetMapping("/students")
	public List<Student> findAllStudents(){
		return studentRepository.findAll();
	}
	
	@GetMapping("/getInfo")
	public List<StudentResponse> getJoinInformation(){
		return studentRepository.getJoinInformation();
	}
}
