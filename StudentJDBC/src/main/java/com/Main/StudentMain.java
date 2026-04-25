package com.Main;

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
			
			
		}
		
		
		
		
		
		
	}

}
