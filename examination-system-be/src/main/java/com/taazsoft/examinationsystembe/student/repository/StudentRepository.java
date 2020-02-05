package com.taazsoft.examinationsystembe.student.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taazsoft.examinationsystembe.student.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
	Optional<Student> findByStudentId(String studentId);
}
