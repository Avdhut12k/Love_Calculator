package com.practiseApp.lc.api;

import java.util.Arrays;

public class SignInInfo {
	
	private String name;
	
	private String userName;
	
	private String password;
	
	private String gender;
	
	private String[] hobby;
	
	private String country;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "SignInInfo [name=" + name + ", userName=" + userName + ", password=" + password + ", gender=" + gender
				+ ", hobby=" + Arrays.toString(hobby) + ", country=" + country + "]";
	}
	
	
	

}
