package com.nt.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.PersonInfo;
import com.nt.entity.PhoneNumber;
import com.nt.repo.PersonRepo;
import com.nt.repo.PhoneNumberRepo;

@Service("amService")
public class OneToManyMappingMgmtServiceImpl implements IOneToManyMappingMgmtService {

	@Autowired
	private PersonRepo person;
	
	@Autowired
	private PhoneNumberRepo phoneNumber;
	
	@Override
	public String saveDataUsingParent(PersonInfo info) {
		// TODO Auto-generated method stub
		return person.save(info).getPid()+" Person is saved";
	}

	@Override
	public void loadDataUsingParent() {
		// TODO Auto-generated method stub
		List<PersonInfo> info=person.findAll();
		info.forEach(list->{
			System.out.println("per "+list);
			Set<PhoneNumber> number=list.getPhoneNumber();
			number.forEach(num->{
				System.out.println("child "+num);
			});
		});
		
	}

	@Override
	public String deleteParentAndItsChild(Integer id) {
		// TODO Auto-generated method stub
		Optional<PersonInfo> info=person.findById(id);
		if(info.isPresent()) {
			person.deleteById(id);
			return "Person and its Phone Number Deleted Successfull";
		}else
		   return " Record Not Found with id "+id;
	}

	@Override
	public String deleteAllPhoneNoOfPerson(int id) {
		// TODO Auto-generated method stub
		Optional<PersonInfo> opt=person.findById(id);
		if(opt.isPresent()) {
			Set<PhoneNumber> numbers=opt.get().getPhoneNumber();
			numbers.forEach(num->{
			    phoneNumber.delete(num);
			});
		    return "All Child Phone Number has been deleted Successfully";
		}else
		   return "Record Not Foundd" ;
	}



}
