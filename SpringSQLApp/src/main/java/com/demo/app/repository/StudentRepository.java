package com.demo.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.app.dto.StudentResponse;
import com.demo.app.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	// JPA query
	@Query("SELECT new com.demo.app.dto.StudentResponse(s.name, m.subject) FROM Student s JOIN s.marks m")
	public List<StudentResponse> getJoinInformation();
}
