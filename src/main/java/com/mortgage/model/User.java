package com.mortgage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name= "user")
@Getter @Setter @NoArgsConstructor @ToString
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	private String userName;
	
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
