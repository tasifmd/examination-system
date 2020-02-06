package com.taazsoft.examinationsystembe.exam.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taazsoft.examinationsystembe.exam.dto.ExamDto;
import com.taazsoft.examinationsystembe.exam.model.Exam;
import com.taazsoft.examinationsystembe.exam.repository.ExamRepository;
import com.taazsoft.examinationsystembe.exam.service.ExamService;

@Service("examService")
public class ExamServiceImpl implements ExamService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private ExamRepository examRepository;

	@Override
	public String createExam(ExamDto examDto) {
		Exam exam = modelMapper.map(examDto, Exam.class);
		examRepository.save(exam);
		return "Exam created";
	}

	@Override
	public String updteExam(String examId, ExamDto examDto) {
		Exam exam = examRepository.findById(examId).orElseThrow(() -> new RuntimeException("Exam doesn't exist"));
		exam.setEndDate(examDto.getEndDate());
		exam.setExamName(examDto.getExamName());
		exam.setFinalExam(examDto.isFinalExam());
		exam.setStartDate(examDto.getStartDate());
		examRepository.save(exam);
		return "Exam updated";
	}

	@Override
	public String deleteExam(String examId) {
		Exam exam = examRepository.findById(examId).orElseThrow(() -> new RuntimeException("Exam doesn't exist"));
		examRepository.delete(exam);
		return "Exam deleted";
	}

	@Override
	public Exam getExam(String examId) {
		Exam exam = examRepository.findById(examId).orElseThrow(() -> new RuntimeException("Exam doesn't exist"));
		return exam;
	}

	@Override
	public List<Exam> getAllExam() {
		List<Exam> allExam = examRepository.findAll();
		return allExam;
	}

}
