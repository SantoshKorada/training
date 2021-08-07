package com.training.jpaorm.service;

import java.util.List;

import com.training.jpaorm.requestmodal.StudentRequestModal;
import com.training.jpaorm.responsemodal.StudentResponseModal;

public interface StudentService {

	public StudentResponseModal registerStudent(StudentRequestModal studentRequestModal);
	
	public List<StudentResponseModal> getListOfStudents();
	
	public StudentResponseModal getStudentData(Long id);
}
