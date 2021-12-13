package com.service;

import java.util.List;

import com.dao.StudentDao;
import com.entity.Student;

public class StudentService {
	//insert
StudentDao studentDao = new StudentDao();
public String storeStudentInfo(Student student) {
	if (studentDao.storeStudentInfo(student)){
		return "Record stored Successfully";
		
	}else {
		return "Recrod Didn't stored";
	}
		
	}

//update
public String updateStudentInfo(Student student) {
	if (studentDao.updateStudentInfo(student)>0){
		return "Student info updated Successfully";
		
	}else {
		return "Student info Didn't updated";
	}
}
//delete
public String deleteStudentInfo(int id) {
	if (studentDao.deleteStudentInfo(id)>0){
		return "Student info Deleted Successfully";
		
	}else {
		return "Student info not present";
	}
}
//retrive
public Student getStudentInfo(int id) {
	return studentDao.getStudentInfo(id);
	
}
//Retrive All
public List<Student>getAllStudents(){
	return studentDao.getAllStudents();
}
}

