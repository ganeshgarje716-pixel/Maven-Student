package com.Main;

import java.util.ArrayList;
import java.util.Scanner;

import com.Controller.StudentController;
import com.Entity.Student;

public class StudentMain {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		
		StudentController controller=new StudentController();
		
		
		
		while (true) {
			
			
			System.out.println("1.Insert Student");
			System.out.println("2.Update Student By Id");
			System.out.println("3.Delete Student By Id");
			System.out.println("4.Get Student By Email");
			System.out.println("5.Get All Students");
			System.out.println("6.Exit");
			
			System.out.println("Enter Your Choise = ");
			int no=sc.nextInt();
			
			
			
			if (no == 1) {
				
				
				System.out.println("Enter Id = ");
				int id=sc.nextInt();
				
				System.out.println("Enter Student Name = ");
				String name=sc.next();
				
				System.out.println("Enter Email = ");
				String email=sc.next();
				
				System.out.println("Enter Mobile No = ");
				float mobileNo=sc.nextFloat();
				
				System.out.println("Enter City = ");
				String city=sc.next();
				
				System.out.println("Enter Branch = ");
				String branch=sc.next();
				
				System.out.println("Enter CGPA =");
				double cgpa=sc.nextDouble();
				
				
				try {
					
					System.out.println(controller.insert(new Student(id, name, email, mobileNo, city, branch, cgpa)));
				} 
				catch (Exception e) {
					
					e.printStackTrace();
				}
				
			break;	
			}
			
			
			else if (no == 2) {
				
				
				System.out.println("Enter Id = ");
				int id=sc.nextInt();
				
				System.out.println("Enter Student Name = ");
				String name=sc.next();
				
				System.out.println("Enter Email = ");
				String email=sc.next();
				
				System.out.println("Enter Mobile No = ");
				float mobileNo=sc.nextFloat();
				
				System.out.println("Enter City = ");
				String city=sc.next();
				
				System.out.println("Enter Branch = ");
				String branch=sc.next();
				
				System.out.println("Enter CGPA =");
				double cgpa=sc.nextDouble();
				
				
				try {
					
					System.out.println(controller.update(new Student(id, name, email, mobileNo, city, branch, cgpa)));
				}
				catch (Exception e) {
					
					e.printStackTrace();
				}
			
			break;
			}
			
			
			
			else if (no == 3) {
				
				
				System.out.println("Enter Id = ");
				int id=sc.nextInt();
				
				
				try {
					
					System.out.println(controller.delete(id));
				} 
				catch (Exception e) {
					
					e.printStackTrace();
				}
			
			break;	
			}
			
			
			
			else if (no == 4) {
				
				
				System.out.println("Enter Id = ");
				int id=sc.nextInt();
				
				
				try {
					
					Student student = controller.get(id);
					
					System.out.println("Id        = "+student.getId());
					System.out.println("Name      = "+student.getName());
					System.out.println("Email     = "+student.getEmail());
					System.out.println("Mobile No = "+student.getMobileNo());
					System.out.println("City      = "+student.getCity());
					System.out.println("Branch    = "+student.getBranch());
					System.out.println("CGPA      = "+student.getCgpa());
					
				} 
				catch (Exception e) {
					
					e.printStackTrace();
				}
			
			break;	
			}
			
			
			
			else if (no == 5) {
				
				
				try {
					
                    ArrayList<Student> all = controller.getAll();
                    
                    for (Student students : all) {
					
					System.out.println("Id        = "+students.getId());
					System.out.println("Name      = "+students.getName());
					System.out.println("Email     = "+students.getEmail());
					System.out.println("Mobile No = "+students.getMobileNo());
					System.out.println("City      = "+students.getCity());
					System.out.println("Branch    = "+students.getBranch());
					System.out.println("CGPA      = "+students.getCgpa());
					
					System.out.println("============================================");
					
                    }
				}
				catch (Exception e) {
					
					e.printStackTrace();
				}
				
			break;	
			}
			
			
            else if (no == 6) {
				
				System.out.println("Thank You");
			
			break;	
			}
			
			
			
		}
		
		
		
		
		
		
	}

}
