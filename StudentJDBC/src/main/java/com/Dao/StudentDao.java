package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.Entity.Student;
import com.jdbcConnection.JDBCUtil;

public class StudentDao {
	
	
	
	Connection con = JDBCUtil.createConnection();
	
	
//	public void createTable() {
//		
//		try {
//			
//			PreparedStatement pst = con.prepareStatement("create table student (id int, name varchar(50), email varchar(50), mobileNo float, city varchar(50), branch varchar(50), cgpa double )");
//			
//			pst.execute();
//			
//			System.out.println("create table");
//		} 
//		catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
//	}
	
	
	
	public String insertStudent(Student student ) {
		
		try {
			
			PreparedStatement pst = con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
			
			pst.setInt(1, student.getId());
			pst.setString(2, student.getName());
			pst.setString(3, student.getEmail());
			pst.setFloat(4, student.getMobileNo());
			pst.setString(5, student.getCity());
			pst.setString(6, student.getBranch());
			pst.setDouble(7, student.getCgpa());
			
			int value = pst.executeUpdate();
			
			if (value > 0) {
				
				return "Student Insert Successfully";
			}
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public String studentUpdate(Student student) {
		
		try {
			
			PreparedStatement pst = con.prepareStatement("update student set name=?, email=?, mobileNo=?, city=?, branch=?, cgpa=? where id=?");
			
			pst.setString(1, student.getName());
			pst.setString(2, student.getEmail());
			pst.setFloat(3, student.getMobileNo());
			pst.setString(4, student.getCity());
			pst.setString(5, student.getBranch());
			pst.setDouble(6, student.getCgpa());
			pst.setInt(7, student.getId());
			
			int value = pst.executeUpdate();
			
			if (value > 0) {
				
				return "Student Update Successfully";
			}
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	
	public String deleteStudent(int id) {
		
		
		try {
			
			PreparedStatement pst = con.prepareStatement("delete from student where id=?");
			
			pst.setInt(1, id);
			
			int value = pst.executeUpdate();
			
			if (value > 0) {
				
				return "Student Delete Successfully";
			}
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public Student getStudent(int id) {
		
		Student student=null;
		
		try {
			
			PreparedStatement pst = con.prepareStatement("select * from student where id=?");
			
			pst.setInt(1, id);
			
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				
				int id1=rs.getInt("id");
				String name=rs.getString("name");
				String email=rs.getString("email");
				float mobileNo=rs.getFloat("mobileNo");
				String city=rs.getString("city");
				String branch=rs.getString("branch");
				double cgpa=rs.getDouble("cgpa");
				
			     student=new Student(id1, name, email, mobileNo, city, branch, cgpa);
				
			}
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return student;
	}
	
	
	
    public ArrayList<Student> getAllStudent() {
		
	   	ArrayList<Student> students=new ArrayList<Student>();
	
		try {
			
			PreparedStatement pst = con.prepareStatement("select * from student");
			
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				
				int id1=rs.getInt("id");
				String name=rs.getString("name");
				String email=rs.getString("email");
				float mobileNo=rs.getFloat("mobileNo");
				String city=rs.getString("city");
				String branch=rs.getString("branch");
				double cgpa=rs.getDouble("cgpa");
				
			    
			    students.add(new Student(id1, name, email, mobileNo, city, branch, cgpa));
			}
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return students;
	}
	
	
	
	
	
	

}
