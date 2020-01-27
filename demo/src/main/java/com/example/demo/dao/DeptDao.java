package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.DeptDto;

@Repository
public class DeptDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<DeptDto>getAllDepartment(){
	    List<DeptDto> deptdto = jdbcTemplate.query("select* from department",(result,rowNum)->new DeptDto(result.getInt("dept_id"),result.getString("dept_name"),result.getString("dept_loc"),result.getInt("emp_id")));
	    return deptdto;
	   
	}

	public DeptDto getDepartment(int dept_id){
	    DeptDto deptdto = jdbcTemplate.queryForObject("select * from department where dept_id=?",new Object[]{dept_id},new BeanPropertyRowMapper<>(DeptDto.class));
	    return deptdto;
	}

	public int addDeptDetails(int id,String name,String location,int empid) {
	    return jdbcTemplate.update("INSERT INTO DEPARTMENT VALUES(?,?,?,?)",id,name,location,empid);
	   
	}

	public int deleteDeptDetails(int id) {
	    return jdbcTemplate.update("DELETE FROM DEPARTMENT WHERE DEPT_ID=?",id);
	}

	public int updateDeptDetails(int id,String name) {
        return jdbcTemplate.update("UPDATE DEPARTMENT SET DEPT_NAME=? WHERE DEPT_ID=?",name,id);
}
}
