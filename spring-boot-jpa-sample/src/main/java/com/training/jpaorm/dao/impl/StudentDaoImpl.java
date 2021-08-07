package com.training.jpaorm.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.jpaorm.dao.StudentDao;
import com.training.jpaorm.entity.StudentEntity;
import com.training.jpaorm.repository.StudentRepository;

@Service
public class StudentDaoImpl implements StudentDao {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public StudentEntity saveStudentData(StudentEntity studentEntity) {
		// TODO Auto-generated method stub
		return studentRepository.save(studentEntity);
	}

	@Override
	public List<StudentEntity> getAllStudentsData() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public StudentEntity getStudentById(Long id) {
		// TODO Auto-generated method stub
		Optional<StudentEntity> student = studentRepository.findById(id);
		if (student.isPresent())
			return student.get();
		else
			return null;
	}

}
