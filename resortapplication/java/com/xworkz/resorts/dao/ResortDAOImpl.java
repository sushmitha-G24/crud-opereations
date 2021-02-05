package com.xworkz.resorts.dao;

import java.util.Iterator;
import java.util.List;

import com.xworkz.resorts.dto.ResortDTO;

public class ResortDAOImpl implements ResortDAO {

	private List<ResortDTO> resortList;

	public ResortDAOImpl(List<ResortDTO> resortDTOs) {
		this.resortList = resortDTOs;

	}

	@Override
	public boolean save(ResortDTO dto) {
		boolean added = false;
		System.out.println("invoked save in dao");
		added = this.resortList.add(dto);
		if (added) {
			System.out.println("dto is added:" + dto);
			return true;
		} else {
			System.out.println("dto is not added");
		}
		return false;
	}

	@Override
	public boolean updateLocationByName(String location, String name) {
		System.out.println("invoked upadateLocationByName");
		for (ResortDTO resortDTO : resortList) {
			String resortName = resortDTO.getName();
			if (resortName != null && resortDTO.getName().equals(name)) {
				System.out.println("resort name found can upadate location");
				resortDTO.setLocation(location);
				System.out.println("update locarion" + resortDTO);
				return true;
			} else {
				System.out.println("resort not found");
			}
		}
		return false;
	}

	@Override
	public boolean deleteByNameAndLocation(String name, String location) {
		System.out.println("invoked deleteByNameAndLocation");
		Iterator<ResortDTO> iterator = this.resortList.iterator();
		while (iterator.hasNext()) {
			ResortDTO dto = iterator.next();
			if (dto.getName().equals(name) && ((ResortDTO) resortList).getLocation().equals(location)) {
				System.out.println("name and location found can delete");
				iterator.remove();
				System.out.println("name and location deleted " + dto);
				return true;
			} else {
				System.out.println("name and location not match");
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean getByName(String name) {
		System.out.println("invoked getByName");
		for (ResortDTO resortDTO : resortList) {
			String resortName=resortDTO.getName();
			if (resortName != null && resortName.equals(name)) {
				System.out.println("Resrt Name found");

				return true;
			}
			
		}
		System.out.println("Not Found ");
		return false;
	}

	@Override
	public List<ResortDTO> getAll() {
		System.out.println("invoked");
		return this.resortList;
	}
}
