package com.Controller;

import java.sql.SQLException;
import java.util.ArrayList;

import com.Entity.Student;
import com.Service.StudentService;

public class StudentController {

	
	StudentService service = new StudentService();
	
	
	public String insert(Student student) {
		
		return service.insert(student);
	}
	
	
	public String update(Student student) {
		
		return service.update(student);
	}
	
	
	public String delete(int id) throws SQLException {
		
		return service.delete(id);
	}
	
	
	public Student get(int id) {
		
		return service.get(id);
	}
	
	
	public ArrayList<Student> getAll() {
		
		return service.getAll();
	}
	
	
	
	
	
	
}
