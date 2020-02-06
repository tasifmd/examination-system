package com.taazsoft.examinationsystembe.exam.service;

import java.util.List;

import com.taazsoft.examinationsystembe.exam.dto.ExamDto;
import com.taazsoft.examinationsystembe.exam.model.Exam;

public interface ExamService {

	public String createExam(ExamDto examDto);

	public String updteExam(String examId, ExamDto examDto);

	public String deleteExam(String examId);

	public Exam getExam(String examId);

	public List<Exam> getAllExam();
}
