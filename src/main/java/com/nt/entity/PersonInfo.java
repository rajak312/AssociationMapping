package com.nt.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="AM_Person_Details")
public class PersonInfo implements Serializable{
	
	@Id
	@SequenceGenerator(name="gen1",initialValue = 1000, allocationSize = 1,sequenceName = "PID_Sequence")
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer pid;
	
	@Column(length=20)
	private String pname;
	
	@Column(length=20)
	private String paddrs;
	
	@OneToMany(targetEntity = PhoneNumber.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="PERSON_ID",referencedColumnName = "pid")
	private Set<PhoneNumber> phoneNumber;

	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", pname=" + pname + ", paddrs=" + paddrs + ", phoneNumber=" + phoneNumber
				+ "]";
	}

}
