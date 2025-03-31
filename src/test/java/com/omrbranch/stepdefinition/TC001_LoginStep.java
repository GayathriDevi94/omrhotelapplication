package com.omrbranch.stepdefinition;

import io.cucumber.java.en.*;

public class TC001_LoginStep {
	
	

	@Given("User is on the OMR Branch hotel page")
	public void userIsOnTheOMRBranchHotelPage() {
	   
	}
	@When("User login {string} and {string}")
	public void userLoginAnd(String userName, String password) {
	 
	}
	@Then("User should verify success message after login {string}")
	public void userShouldVerifySuccessMessageAfterLogin(String expectLogInSuccessMessage) {
	  
	}
	

	@When("User login {string} and {string} with enter key")
	public void userLoginAndWithEnterKey(String userName, String password) {
	    
	}
	

	@Then("User should verify error message after login {string}")
	public void userShouldVerifyErrorMessageAfterLogin(String expectLogInErrorMessage) {
	   
	}










}
