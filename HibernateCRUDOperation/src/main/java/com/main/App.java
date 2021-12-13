package com.main;

import java.util.List;

import com.entity.Student;
import com.service.StudentService;

public class App {

	public static void main(String[] args) {
		//insert record
//	Student ss=new Student();
//	ss.setId(5);
//	ss.setName("vijay");
//	ss.setAge(25);
//	StudentService ser= new StudentService();
//	String result=ser.storeStudentInfo(ss);
//	String res=ser.updateStudentInfo(ss);
//	System.out.println(res);
//	
	//Update record
//	Student ss=new Student();
//	ss.setId(5);
//	ss.setAge(25);
//	StudentService ser= new StudentService();
//	String res=ser.updateStudentInfo(ss);
//	System.out.println(res);
		
		//Delete Record
//		StudentService ser= new StudentService();
//		String res=ser.deleteStudentInfo(5);
//        System.out.println(res);
		
		
//		retrived
//		StudentService ser= new StudentService();
//		Student ss=ser.getStudentInfo(2);// if id 4 is not presesent in table it will print null .
//		System.out.println(ss);
		
		//retrive all
		StudentService ser=new StudentService();
		ser.getAllStudents().forEach(s->System.out.println(s));

	}

}
