package com.taazsoft.examinationsystembe.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taazsoft.examinationsystembe.exam.model.Exam;

@Repository
public interface ExamRepository extends JpaRepository<Exam, String> {

}
