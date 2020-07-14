/**
 * 
 */
package com.springboot.elasticbeanstalk.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.elasticbeanstalk.app.model.StudentModel;

/**
 * @author Raj
 *
 */
public interface StudentRepository extends JpaRepository<StudentModel, Integer> {

}
