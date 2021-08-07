package com.training.jpaorm.service.impl;

import java.util.Arrays;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.jpaorm.dao.StudentDao;
import com.training.jpaorm.entity.StudentEntity;
import com.training.jpaorm.requestmodal.StudentRequestModal;
import com.training.jpaorm.responsemodal.StudentResponseModal;
import com.training.jpaorm.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	ModelMapper modelMapper;

	@Autowired
	StudentDao studentDao;

	@Override
	public StudentResponseModal registerStudent(StudentRequestModal studentRequestModal) {
		// TODO Auto-generated method stub
		StudentEntity studentEntity = modelMapper.map(studentRequestModal, StudentEntity.class);
		return modelMapper.map(studentDao.saveStudentData(studentEntity), StudentResponseModal.class);
	}

	@Override
	public List<StudentResponseModal> getListOfStudents() {
		// TODO Auto-generated method stub
		return Arrays.asList(modelMapper.map(studentDao.getAllStudentsData(), StudentResponseModal[].class));
	}

	@Override
	public StudentResponseModal getStudentData(Long id) {
		// TODO Auto-generated method stub
		return modelMapper.map(studentDao.getStudentById(id), StudentResponseModal.class);
	}

}
