package com.Service;

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

}
