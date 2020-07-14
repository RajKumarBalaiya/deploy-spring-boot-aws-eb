package com.springboot.elasticbeanstalk.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.elasticbeanstalk.app.model.StudentModel;
import com.springboot.elasticbeanstalk.app.repository.StudentRepository;

@Service

public class Student_Service_Imp implements Student_Service {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public StudentModel saveStudent(StudentModel student) {

		return studentRepository.save(student);
	}

	@Override
	public List<StudentModel> getStudents() {
		return studentRepository.findAll();

	}

	@Override
	public void deleteStudent(StudentModel student) {
		studentRepository.delete(student);
	}

	@Override
	public StudentModel getStudentByID(StudentModel student) {
		return studentRepository.findById(student.getStudent_id()).get();

	}

	@Override
	public StudentModel updateStudent(StudentModel student) {
		return studentRepository.saveAndFlush(student);

	}

}
