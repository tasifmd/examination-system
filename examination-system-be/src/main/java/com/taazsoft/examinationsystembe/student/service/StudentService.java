package com.taazsoft.examinationsystembe.student.service;

import java.util.List;

import com.taazsoft.examinationsystembe.student.dto.StudentDto;
import com.taazsoft.examinationsystembe.student.model.Student;

public interface StudentService {

	public String createStudent(StudentDto studentDto);

	public List<Student> getAllStudents();

	public String upteStudent(String studentId, StudentDto studentDto);

	public Student getStudent(String studentId);

	public String deleteStudent(String studentId);
}
