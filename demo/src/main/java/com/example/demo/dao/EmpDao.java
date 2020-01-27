package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.example.demo.dto.EmpDto;


@Repository
public class EmpDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<EmpDto>getAllEmployee(){
	    List<EmpDto> empdto = jdbcTemplate.query("select* from employee",(result,rowNum)->new EmpDto(result.getInt("emp_id"),result.getString("emp_name"),result.getString("designation"),result.getString("address"),
	                                                                            result.getString("phone")));
	    return empdto;
	   
	}
	
	public EmpDto getEmployee(int emp_id){
	    EmpDto empdto = jdbcTemplate.queryForObject("select * from employee where EMP_ID=?",new Object[]{emp_id},new BeanPropertyRowMapper<>(EmpDto.class));
	    return empdto;
	}

	
	public int addDetails(int id,String name,String desg,String addr,String phone) {
	    return jdbcTemplate.update("INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)",id,name,desg,addr,phone);
	   
	}

	public int deleteDetails(int id) {
	    return jdbcTemplate.update("DELETE FROM EMPLOYEE WHERE EMP_ID=?",id);
	}

	public int updateDetails(int id,String name) {
        return jdbcTemplate.update("UPDATE EMPLOYEE SET EMP_NAME=? WHERE EMP_ID=?",name,id);
}

}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
