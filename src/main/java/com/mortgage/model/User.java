package com.mortgage.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name= "user")
@Getter @Setter @NoArgsConstructor
public class User {

	private String name;
	
	private String password;
	
	private String dob;
	
	private String gender;
	
	private long phone;
	
	private String email;
	
	private String pan;
	
	private long salary;
	
	private long secondIncome;
	
	private long otherIncome;
	
}
