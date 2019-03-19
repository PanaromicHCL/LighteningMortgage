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
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {

	public User(long id, String userName, String password, String dob, String gender, long phone, String email,
			String pan, long salary, long secondIncome, long otherIncome) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.dob = dob;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.pan = pan;
		this.salary = salary;
		this.secondIncome = secondIncome;
		this.otherIncome = otherIncome;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public long getSecondIncome() {
		return secondIncome;
	}

	public void setSecondIncome(long secondIncome) {
		this.secondIncome = secondIncome;
	}

	public long getOtherIncome() {
		return otherIncome;
	}

	public void setOtherIncome(long otherIncome) {
		this.otherIncome = otherIncome;
	}

}
