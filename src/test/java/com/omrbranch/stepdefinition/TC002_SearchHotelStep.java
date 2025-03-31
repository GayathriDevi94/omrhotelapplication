package com.omrbranch.stepdefinition;

import io.cucumber.java.en.*;

public class TC002_SearchHotelStep {
	

	@When("User search hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userSearchHotelAnd(String stateName, String cityName, String checkInDate, String checkOutDate,String roomType, String noOfRooms, String noOfAdults, String noOfChild) {
	  
	}
	
	@Then("User should verify after search hotel success message {string}")
	public void userShouldVerifyAfterSearchHotelSuccessMessage(String ExpectHotelLoginSuccessMessage) {
	
	}

	@When("User search hotel {string},{string},{string},{string},{string} and {string}")
	public void userSearchHotelAnd(String stateName, String cityName, String checkInDate, String checkOutDate, String noOfRooms, String noOfAdults) {
	   
	}

	@Then("User click Search button")
	public void userClickSearchButton() {
	   
	}
	@Then("User should verify after search hotel error message {string} ,{string} ,{string} ,{string} ,{string} and {string}")
	public void userShouldVerifyAfterSearchHotelErrorMessageAnd(String stateName, String cityName, String checkInDate, String checkOutDate, String noOfRooms, String noOfAdults) {
	   
	}
	

	@When("User click sort from low to high")
	public void userClickSortFromLowToHigh() {
	   
	}
	@Then("User should verify after sorting that price are listed from low to high")
	public void userShouldVerifyAfterSortingThatPriceAreListedFromLowToHigh() {
	  
	}

	@When("User click sort from Descending order")
	public void userClickSortFromDescendingOrder() {
	  
	}
	@Then("User should verify after sorting that name in Descending order")
	public void userShouldVerifyAfterSortingThatNameInDescendingOrder() {
	   
	}
	
	@Then("User should verify the header contains {string}")
	public void userShouldVerifyTheHeaderContains(String roomType) {
	   
	}

	@When("User click Standard room type")
	public void userClickStandardRoomType() {
	   
	}
	@Then("User should verify after sorting that Standard room type is listed")
	public void userShouldVerifyAfterSortingThatStandardRoomTypeIsListed() {
	    
	}

















}
