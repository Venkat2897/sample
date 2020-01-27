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

import com.example.demo.dao.EmpDao;
import com.example.demo.dto.EmpDto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@Api(value="Employee Management System",description ="Operations pertaining to employee in Employee Management System")
@RestController
public class EmpController
{
	@Autowired
	EmpDao empdao;
	
	  @ApiOperation(value = "View a list of available employees", response = List.class)
	  
	  @GetMapping("/getAll")
      @ResponseBody
      public List<EmpDto> getAll(){
              return empdao.getAllEmployee();
      }
     
	  @ApiOperation(value ="get a employee details by id")
	  
	  @GetMapping("/getEmployee")
      @ResponseBody
      public EmpDto getId(@RequestParam int id) {
             
              return empdao.getEmployee(id);
	  }
     
	  @ApiOperation(value ="add the employee details")
      @PostMapping("/AddDetails")
      public String addDetails(@RequestParam("emp_id")int id,@RequestParam("emp_name")String emp_name,@RequestParam("designation")String emp_desg,@RequestParam("address")String emp_addr,@RequestParam("phone")String emp_phn) {
              if(empdao.addDetails(id,emp_name,emp_desg,emp_addr,emp_phn)>=1) {
                      return "Details Successfully Added";
              }else {
              return"Something went Wrong";}
      }
     
	  @ApiOperation(value ="delete the employee details")
      @DeleteMapping("/DeleteDetails")
      public String deleteDetails(@RequestParam("emp_id")int id) {
              if(empdao.deleteDetails(id)>=1) {
                      return "Deleted Successfully";
              }else {
              return "Something Went Wrong";}
      }
      
	  
	  @ApiOperation(value ="update the employee details")
      @PutMapping("/UpdateDetails")
      public String updateDetails(@RequestParam("emp_id")int id,@RequestParam("emp_name")String name) {
              if(empdao.updateDetails(id,name)>=1) {
                      return "Successfully Updated";
              }else {
                      return "Something went wrong";
              }
      }
     
     


}
