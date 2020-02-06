package com.taazsoft.examinationsystembe.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taazsoft.examinationsystembe.exam.dto.ExamDto;
import com.taazsoft.examinationsystembe.exam.model.Exam;
import com.taazsoft.examinationsystembe.exam.service.ExamService;

@RestController
@RequestMapping("/exam")
public class ExamController {

	@Autowired
	private ExamService examService;

	@PostMapping
	public ResponseEntity<String> createExam(@RequestBody ExamDto examDto) {
		String response = examService.createExam(examDto);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Exam>> getAllExam() {
		List<Exam> response = examService.getAllExam();
		return new ResponseEntity<List<Exam>>(response, HttpStatus.OK);
	}

	@PutMapping("/{examId}")
	public ResponseEntity<String> updateExam(@PathVariable String examId, @RequestBody ExamDto examDto) {
		String response = examService.updteExam(examId, examDto);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	@DeleteMapping("/{examId}")
	public ResponseEntity<String> deleteExam(@PathVariable String examId) {
		String response = examService.deleteExam(examId);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	@GetMapping("/{examId}")
	public ResponseEntity<Exam> getExam(@PathVariable String examId) {
		Exam response = examService.getExam(examId);
		return new ResponseEntity<Exam>(response, HttpStatus.OK);
	}
}
