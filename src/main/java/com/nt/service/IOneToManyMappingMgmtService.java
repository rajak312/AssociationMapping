package com.nt.service;

import com.nt.entity.PersonInfo;

public interface IOneToManyMappingMgmtService {
	
	public String saveDataUsingParent(PersonInfo info);
	
	public void loadDataUsingParent();
	
	public String deleteParentAndItsChild(Integer id);
	


	public String deleteAllPhoneNoOfPerson(int id);

}
