package com.Controller;

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
	
	
	public String delete(int id) {
		
		return service.delete(id);
	}
	
	
	
	
	
	
}
