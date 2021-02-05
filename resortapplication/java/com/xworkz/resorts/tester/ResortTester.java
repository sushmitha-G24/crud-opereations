package com.xworkz.resorts.tester;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.resorts.dao.ResortDAO;
import com.xworkz.resorts.dao.ResortDAOImpl;
import com.xworkz.resorts.dto.ResortDTO;

public class ResortTester {
	public static void main(String[] args) {
		List<ResortDTO> list = new LinkedList<ResortDTO>();

		ResortDAO dao = new ResortDAOImpl(list);


		ResortDTO dto = new ResortDTO("hoppery", "hyd", 2000,4.5f,1562782821l, false, "reddy", 13);
		dao.save(dto);
		
		ResortDTO dto1=new ResortDTO("hampi","bala",1550,4f,5256277272l,true,"kiran",25);
		dao.save(dto1);
		dao.updateLocationByName("pune", "bala");
		
		ResortDTO dto2=new ResortDTO("olive bistro","banglore",1550,4f,5256277272l,true,"sunil",25);
		dao.save(dto2);
		dao.getByName("hoppery");
		dao.getAll();
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	
		
		
		
		
		
	}
		
	}


