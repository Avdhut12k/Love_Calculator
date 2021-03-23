package com.practiseApp.lc.api;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;





public class UserInfoDTO {
	
	@NotBlank(message = "this is required")
	private String userName;
	
	private String crushName;  //those name exact same as form parameters otherwise binding will not done automatically
	
	@AssertTrue(message = "Need to agree our terms")	
	private Boolean termAndConditions;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}

	public Boolean getTermAndConditions() {
		return termAndConditions;
	}

	public void setTermAndConditions(Boolean termAndConditions) {
		this.termAndConditions = termAndConditions;
	}
	
	

}
