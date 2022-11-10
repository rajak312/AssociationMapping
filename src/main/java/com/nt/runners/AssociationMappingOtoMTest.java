package com.nt.runners;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.PersonInfo;
import com.nt.entity.PhoneNumber;
import com.nt.service.IOneToManyMappingMgmtService;

@Component
public class AssociationMappingOtoMTest implements CommandLineRunner {

	@Autowired
	private IOneToManyMappingMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*
		 * PhoneNumber number1=new PhoneNumber(); number1.setContactNo(4524255L);
		 * number1.setNumberType("resident"); number1.setProvider("Jio");
		 * 
		 * PhoneNumber number2=new PhoneNumber(); number2.setContactNo(362362L);
		 * number2.setNumberType("individual"); number2.setProvider("Airtel");
		 * 
		 * PhoneNumber number3=new PhoneNumber(); number3.setContactNo(8151578L);
		 * number3.setNumberType("office"); number3.setProvider("VI");
		 * 
		 * PersonInfo info=new PersonInfo();
		 * info.setPname("Shubham");info.setPaddrs("Rewa");
		 * info.setPhoneNumber(Set.of(number1,number2,number3));
		 * 
		 * System.out.println(service.saveDataUsingParent(info));
		 */
		 
		
		
		service.loadDataUsingParent();
		
		System.out.println("=====================");
		/*
		 * System.out.println(service.deleteParentAndItsChild(1001));
		 * System.out.println(service.deleteParentAndItsChild(1002));
		 */
		
		/*
		 * System.out.println(service.deleteAllPhoneNoOfPerson(1003));
		 */
		System.out.println("===================");
		System.out.println(service.deleteAllPhoneNoOfPerson(1003));
	}

}
