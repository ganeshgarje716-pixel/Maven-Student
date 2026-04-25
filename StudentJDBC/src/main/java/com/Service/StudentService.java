package com.Service;

import java.util.ArrayList;

import com.Dao.StudentDao;
import com.Entity.Student;

public class StudentService {
	
	
	StudentDao dao=new StudentDao();
	
	
	public String insert(Student student) {
		
		 String msg = dao.insertStudent(student);
		 
		return msg;
	}
	
	
	public String update(Student student) {
		
		String msg = dao.studentUpdate(student);
		
		return msg;
	}
	
	
	public String delete(int id) {
		
		String msg = dao.deleteStudent(id);
		
		return msg;
	}

	
	public Student get(int id) {
		
		Student student = dao.getStudent(id);
		
		return student;
	}
	
	
	public ArrayList<Student> getAll() {
		
		ArrayList<Student> students = dao.getAllStudent();
		
		return students;
	}
	
	
	
	
}
