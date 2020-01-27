package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.DeptDao;
import com.example.demo.dto.DeptDto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@Api(value="Department Management System",description ="Operations pertaining to department in Department Management System")
@RestController
public class DeptController {

	
		@Autowired
		DeptDao deptdao;
		
          @ApiOperation(value="views list if available departments", response=List.class)
		  @GetMapping("/getAllDept")
	      @ResponseBody
	      public List<DeptDto> getAll(){
	              return deptdao.getAllDepartment();
	      }
	     
          @ApiOperation(value="get department details by id")
	      @GetMapping("/getDepartment")
	      @ResponseBody
	      public DeptDto getId(@RequestParam int id) {
	             
	              return deptdao.getDepartment(id);
	      }
	     
          @ApiOperation(value="add department details")
	      @PostMapping("/AddDeptDetails")
	      public String addDeptDetails(@RequestParam("dept_id")int id,@RequestParam("dept_name")String dept_name,@RequestParam("dept_loc")String location,@RequestParam("emp_id")int empid) {
	              if(deptdao.addDeptDetails(id,dept_name,location,empid)>=1) {
	                      return "Details Successfully Added";
	              }else {
	              return"Something went Wrong";}
	      }
	     
          @ApiOperation(value="delete department details")
	      @DeleteMapping("/DeleteDeptDetails")
	      public String deleteDeptDetails(@RequestParam("dept_id")int id) {
	              if(deptdao.deleteDeptDetails(id)>=1) {
	                      return "Deleted Successfully";
	              }else {
	              return "Something Went Wrong";}
	      }
	     
          @ApiOperation(value="update department details")
	      @PutMapping("/UpdateDeptDetails")
	      public String updateDeptDetails(@RequestParam("dept_id")int id,@RequestParam("dept_name")String name) {
	              if(deptdao.updateDeptDetails(id,name)>=1) {
	                      return "Successfully Updated";
	              }else {
	                      return "Something went wrong";
	              }
	      }
	     
	     


	}


