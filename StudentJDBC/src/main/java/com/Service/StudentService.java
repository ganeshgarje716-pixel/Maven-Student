package com.Service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.Dao.StudentDao;
import com.Entity.Student;
import com.Exception.SomthingWentWrongException;
import com.Exception.StudentIsNullException;

public class StudentService {
	
	
	StudentDao dao=new StudentDao();
	
	
	public String insert(Student student) {
		
		if (student == null) {
			
			throw new StudentIsNullException("Student is Null");
		}
		 String msg = dao.insertStudent(student);
		 
		return msg;
	}
	
	
	public String update(Student student) {
		
		String msg = dao.studentUpdate(student);
		
		if (msg == null) {
			
			throw new SomthingWentWrongException("Cheak your SQL Query Again");
		}
		
		return msg;
	}
	
	
	public String delete(int id) throws SQLException {
		
		String msg = dao.deleteStudent(id);
		
		if (msg == null) {
			
			throw new SQLException("Id Not Found");
		}
		
		return msg;
	}

	
	public Student get(int id) {
		
		Student student = dao.getStudent(id);
		
		if (student == null) {
			
			throw new StudentNotFoundException("Student Not Found With Id = "+id);
		}
		
		return student;
	}
	
	
	public ArrayList<Student> getAll() {
		
		ArrayList<Student> students = dao.getAllStudent();
		
		if (students.isEmpty()) {
			
			throw new StudentsNotFoundException("No Student Present in DB");
		}
		
		return students;
	}
	
	
	
	
}
