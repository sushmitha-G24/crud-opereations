package com.xworkz.resorts.dao;

import java.util.List;

import com.xworkz.resorts.dto.ResortDTO;

public interface ResortDAO {
	boolean save(ResortDTO dto);
	
	
	

	boolean updateLocationByName(String location, String name);

	boolean deleteByNameAndLocation(String name, String location);
	
	boolean getByName(String name);
	 
	List<ResortDTO> getAll();









}
