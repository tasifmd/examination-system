package com.taazsoft.examinationsystembe.student.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taazsoft.examinationsystembe.student.dto.StudentDto;
import com.taazsoft.examinationsystembe.student.model.Student;
import com.taazsoft.examinationsystembe.student.repository.StudentRepository;
import com.taazsoft.examinationsystembe.student.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public String createStudent(StudentDto studentDto) {
		Student student = modelMapper.map(studentDto, Student.class);
		studentRepository.save(student);
		return "Student created";
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public String upteStudent(String studentId, StudentDto studentDto) {
		Student student = studentRepository.findByStudentId(studentId)
				.orElseThrow(() -> new RuntimeException("No student exist"));
		student.setDob(studentDto.getDob());
		student.setFirstName(studentDto.getFirstName());
		student.setGuardianName(studentDto.getGuardianName());
		student.setLastName(studentDto.getLastName());
		student.setSection(studentDto.getSection());
		student.setStudentClass(studentDto.getStudentClass());
		studentRepository.save(student);
		return "Student updated";
	}

	@Override
	public Student getStudent(String studentId) {
		Student student = studentRepository.findByStudentId(studentId)
				.orElseThrow(() -> new RuntimeException("No student exist"));
		return student;
	}

	@Override
	public String deleteStudent(String studentId) {
		Student student = studentRepository.findByStudentId(studentId)
				.orElseThrow(() -> new RuntimeException("No student exist"));
		studentRepository.delete(student);
		return "Student deleted";
	}

}
