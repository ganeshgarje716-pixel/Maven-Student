package com.Entity;

public class Student {
	
	
	private int id;
	
	private String name;
	
	private String email;
	
	private float mobileNo;
	
	private String city;
	
	private String branch;
	
	private double cgpa;

	
	
	public Student(int id, String name, String email, float mobileNo, String city, String branch, double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.city = city;
		this.branch = branch;
		this.cgpa = cgpa;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public float getMobileNo() {
		return mobileNo;
	}



	public void setMobileNo(float mobileNo) {
		this.mobileNo = mobileNo;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getBranch() {
		return branch;
	}



	public void setBranch(String branch) {
		this.branch = branch;
	}



	public double getCgpa() {
		return cgpa;
	}



	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", mobileNo=" + mobileNo + ", city=" + city
				+ ", branch=" + branch + ", cgpa=" + cgpa + "]";
	}
	
	
	
	
	
	
	

}
