package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
			
			pst.executeUpdate();
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return "Student Insert Successfully";
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
			
			pst.executeUpdate();
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return "Student Update Successfully";
	}
	
	
	
	public String deleteStudent(int id) {
		
		
		try {
			
			PreparedStatement pst = con.prepareStatement("delete from student where id=?");
			
			pst.setInt(1, id);
			
			pst.executeUpdate();
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return "Student Delete Successfully";
	}
	
	

}
