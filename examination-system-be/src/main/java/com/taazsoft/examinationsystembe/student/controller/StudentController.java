package com.taazsoft.examinationsystembe.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taazsoft.examinationsystembe.student.dto.StudentDto;
import com.taazsoft.examinationsystembe.student.model.Student;
import com.taazsoft.examinationsystembe.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;

	@PostMapping
	public ResponseEntity<String> createStudent(@RequestBody StudentDto studentDto) {
		String response = studentService.createStudent(studentDto);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Student>> getAllStudents() {
		List<Student> response = studentService.getAllStudents();
		return new ResponseEntity<List<Student>>(response, HttpStatus.OK);
	}

	@PutMapping("/{studentId}")
	public ResponseEntity<String> updateStudent(@PathVariable String studentId, @RequestBody StudentDto studentDto) {
		String response = studentService.upteStudent(studentId, studentDto);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

}
