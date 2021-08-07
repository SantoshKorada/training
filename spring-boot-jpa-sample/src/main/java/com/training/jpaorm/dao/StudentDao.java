package com.training.jpaorm.dao;

import java.util.List;

import com.training.jpaorm.entity.StudentEntity;

public interface StudentDao {

	public StudentEntity saveStudentData(StudentEntity studentEntity);
	
	public List<StudentEntity> getAllStudentsData();
	
	public StudentEntity getStudentById(Long id);
}
