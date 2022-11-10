package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="AM_PHONENUMBERS_DETAILS")
public class PhoneNumber implements Serializable {
	
	@Id
	@GeneratedValue
	private Integer regNo;
	
	private Long contactNo;
	
	@Column(length=20)
	private String numberType;
	
	@Column(length=20)
	private String Provider;

	@Override
	public String toString() {
		return "PhoneNumber [regNo=" + regNo + ", contactNo=" + contactNo + ", numberType=" + numberType + ", Provider="
				+ Provider + "]";
	}

}
