package com.student.service;

import java.util.List;

//import com.bookapp.model.Book;
import com.student.exceptions.StudentNotFoundException;
import com.student.model.Student;

public interface StudentService {
	Student addStudent(Student student);
	Student getStudentById(Integer id) throws StudentNotFoundException;
	boolean deleteStudentById(Integer id);
	List<Student> getAllStudents();
	//Derived queries
	List<Student> findByAddressCity(String city) throws StudentNotFoundException;
	List<Student> findByDepartment(String department) throws StudentNotFoundException;
	//JPQL
	List<Student> findByAge(int age);
}
