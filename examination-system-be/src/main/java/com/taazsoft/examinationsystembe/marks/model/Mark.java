package com.taazsoft.examinationsystembe.marks.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table
public class Mark implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "mark-uuid")
	@GenericGenerator(name = "mark-uuid", strategy = "uuid")
	private String markId;
	private String subjectName;
	private int maxMarks;
	private int gotMarks;
	private String grade;

}
