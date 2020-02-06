package com.taazsoft.examinationsystembe.exam.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExamDto {
	private String examName;
	private String StartDate;
	private String endDate;
	private boolean isFinalExam;
}
