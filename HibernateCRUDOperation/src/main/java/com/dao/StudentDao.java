package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class StudentDao {
public boolean storeStudentInfo(Student student) {
	try {//insert
	Configuration con=new Configuration();
	con.configure("hibernate.cfg.xml");
	SessionFactory sf=con.buildSessionFactory();// like a connection
	Session session=sf.openSession();//statement or prepared stmt 
	Transaction tran=session.getTransaction();
	tran.begin();
	session.save(student);//insert query
	tran.commit();
}catch (Exception e) {
System.out.println(e);
return false;
}
	return true;
}
//update
public int updateStudentInfo(Student student) {
	Configuration con=new Configuration();
	con.configure("hibernate.cfg.xml");
	SessionFactory sf=con.buildSessionFactory();// like a connection
	Session session=sf.openSession();//statement or prepared stmt 
	Student ss=session.find(Student.class, student.getId());
	if(ss==null) {
		return 0;
	}else {
		Transaction tran=session.getTransaction();
		tran.begin();
		ss.setAge(student.getAge());
		
		session.update(ss);
		tran.commit();
		return 1;
	}
//	Transaction tran=session.getTransaction();
//	tran.begin();
}
//delete
public int deleteStudentInfo(int id) {
	Configuration con=new Configuration();
	con.configure("hibernate.cfg.xml");
	SessionFactory sf=con.buildSessionFactory();// like a connection
	Session session=sf.openSession();//statement or prepared stmt 
	Student ss=session.find(Student.class, id);
	if(ss==null) {
		return 0;
	}else {
		Transaction tran=session.getTransaction();
		tran.begin();
		//ss.setAge(student.getAge());
		
		session.delete(ss);
		tran.commit();
		return 1;
	}
//	Transaction tran=session.getTransaction();
//	tran.begin();
}
//Retrive
public Student getStudentInfo(int id) {
	Configuration con=new Configuration();
	con.configure("hibernate.cfg.xml");
	SessionFactory sf=con.buildSessionFactory();// like a connection
	Session session=sf.openSession();//statement or prepared stmt 
	Student ss=session.find(Student.class, id);
	if(ss==null) {
		return null;
	}else {
		return ss;
	}
	
}
//Retrive all
public List<Student> getAllStudents() {
	Configuration con=new Configuration();
	con.configure("hibernate.cfg.xml");
	SessionFactory sf=con.buildSessionFactory();// like a connection
	Session session=sf.openSession();
	Query<Student> qry=session.createQuery("Select s from Student s");
	List<Student> listOfStudent=qry.list();
	return listOfStudent;
	
}
}
