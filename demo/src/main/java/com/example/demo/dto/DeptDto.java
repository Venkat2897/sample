package com.example.demo.dto;

public class DeptDto {
	
	private int dept_id;
	private String dept_name;
	private String dept_loc;
	private int emp_id;
	
	public DeptDto() {
		super();
		
	}

	public DeptDto(int dept_id, String dept_name, String dept_loc, int emp_id) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
		this.dept_loc = dept_loc;
		this.emp_id = emp_id;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public String getDept_loc() {
		return dept_loc;
	}

	public void setDept_loc(String dept_loc) {
		this.dept_loc = dept_loc;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	@Override
	public String toString() {
		return "DeptDto [dept_id=" + dept_id + ", dept_name=" + dept_name + ", dept_loc=" + dept_loc + ", emp_id="
				+ emp_id + "]";
	}

	
	
	
	
	
	
	
}
