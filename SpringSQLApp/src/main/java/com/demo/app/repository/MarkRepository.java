package com.demo.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.app.model.Mark;

@Repository
public interface MarkRepository extends JpaRepository<Mark, Integer>{

}
