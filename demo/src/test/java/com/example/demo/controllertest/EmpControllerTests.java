package com.example.demo.controllertest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.controller.EmpController;
import com.example.demo.dao.EmpDao;
import com.example.demo.dto.EmpDto;

public class EmpControllerTests {
	
	@Mock
	EmpDao empdao;
	
	
	EmpController empcon;
	
	@Autowired
	EmpDto empdto;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	
	
	@Test
	public void getAllEmployee()
	{
        List<EmpDto> list=new ArrayList<EmpDto>();
        EmpDto e1=new EmpDto(1733117,"Venkatachalam","Trainee","Siruseri","9629617734");
        EmpDto e2=new EmpDto(1733606,"NehruKumar","Trainee","Siruseri","8675091571");
        EmpDto e3=new EmpDto(1623930,"DeepakGupta","Trainee","Siruseri","9506001402");
        EmpDto e4=new EmpDto(1438182,"Ramshad","Trainee","Siruseri","8675091571");
        
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        
        for(EmpDto e:list)
         {
        	System.out.println(e.getEmp_id()+" "+e.getEmp_name()+" "+e.getDesignation()+" "+e.getAddress()+" "+e.getPhone());
         }
        
       when(empdao.getAllEmployee()).thenReturn(list);
        List<EmpDto> lest=empcon.getAll();
        assertEquals(list,lest);
         
	     }
	
	
	
	

}
