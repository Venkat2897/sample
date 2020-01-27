package com.example.demo.dto;

import io.swagger.annotations.ApiModelProperty;

public class EmpDto 
{
	@ApiModelProperty(notes = "The database generated Employee ID")
	private int emp_id;
	
    @ApiModelProperty(notes = "The Employee name")
	private String emp_name;
	 
	@ApiModelProperty(notes = "The Employee Designation")
	private String designation;
	 
	@ApiModelProperty(notes = "The Employee's Address")
	private String address;
	 
	@ApiModelProperty(notes = "The Employee's Contact Number")
	private String phone;
	
	
	public EmpDto() {
		super();
		
	}


	public EmpDto(int emp_id, String emp_name, String designation, String address, String phone) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.designation = designation;
		this.address = address;
		this.phone = phone;
	}


	public int getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}


	public String getEmp_name() {
		return emp_name;
	}


	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}

    




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
