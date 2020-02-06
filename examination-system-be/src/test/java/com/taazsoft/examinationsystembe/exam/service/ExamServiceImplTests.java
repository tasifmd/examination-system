package com.taazsoft.examinationsystembe.exam.service;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.taazsoft.examinationsystembe.exam.dto.ExamDto;
import com.taazsoft.examinationsystembe.exam.repository.ExamRepository;
import com.taazsoft.examinationsystembe.exam.service.impl.ExamServiceImpl;

@SpringBootTest
@RunWith(SpringRunner.class)
class ExamServiceImplTests {

	@InjectMocks
	private ExamServiceImpl examService;

	@Mock
	private ExamRepository examRepository;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	public void createExamTest() {
		ExamDto examDto = new ExamDto("test exam", "12/2/20", "12/03/20", false);
		String response = examService.createExam(examDto);
		assertEquals("Exam created", response);
	}

//	@Test
//	public void updateExamTest() {
//		String examId = "8a8086c2701963380170196370fa00";
//		ExamDto examDto = new ExamDto("test changed", "15/4/20", "20/4/20", true);
//		String response = examService.updteExam(examId, examDto);
//		assertEquals("Exam updated", response);
//	}

}
