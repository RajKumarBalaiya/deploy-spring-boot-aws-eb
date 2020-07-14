package com.springboot.elasticbeanstalk.app.service;

import java.util.List;

import com.springboot.elasticbeanstalk.app.model.StudentModel;

public interface Student_Service {

	public StudentModel saveStudent(StudentModel student);

	public List<StudentModel> getStudents();

	public void deleteStudent(StudentModel student);

	public StudentModel getStudentByID(StudentModel student);

	public StudentModel updateStudent(StudentModel student);
}
