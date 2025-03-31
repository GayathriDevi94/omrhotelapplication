package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class ExploreHotelPage extends BaseClass{
	
	public ExploreHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "state")
	private WebElement ddnState;
	
	@FindBy(name = "city")
	private WebElement ddnCity;
	
	@FindBy(name="room_type")
	private WebElement ddnRoomType;
	
	@FindBy(xpath = "//input[@name='check_in']")
	private WebElement txtDateIn;
	
	@FindBy(xpath = "//input[@name='check_out']")
	private WebElement txtDateOut;
	
	@FindBy(xpath = "//select[@name='no_rooms']")
	private WebElement ddnRoom;
	
	@FindBy(id = "no_adults")
	private WebElement ddnAdults;
	
	@FindBy(id = "no_child")
	private WebElement ddnChild;
	
	@FindBy(id = "searchBtn")
	private WebElement clkSearchBtn;
	
	@FindBy(id = "hotelsearch_iframe")
	private WebElement iframe;
	
	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement textLoginMessage;
	
	@FindBy(id = "invalid-state")
	private WebElement textStateNameErrorMessageText;
	
	@FindBy(id = "invalid-city")
	private WebElement textCityNameErrorMessageText;
	
	@FindBy(id = "invalid-check_in")
	private WebElement textCheckInDateErrorMessageText;
	
	@FindBy(id = "invalid-check_out")
	private WebElement textCheckOutDateErrorMessageText;
	
	@FindBy(id = "invalid-no_rooms")
	private WebElement textRoomsErrorMessageText;
	
	@FindBy(id = "invalid-no_adults")
	private WebElement textAdultsErrorMessageText;
	
	public String getLoginMessageText() {
		String elementGetText = elementGetText(textLoginMessage);
		return elementGetText;
	}

	public void selectRoomType(String roomType) {
		String[] split = roomType.split("/");
		for (String eachRoomType : split) {
			selectOptionByText(ddnRoomType, eachRoomType);
		}
	}

	public void searchHotels(String stateName, String cityName, String roomType, String checkInDate,
			String checkOutDate, String noOfRooms, String noOfAdulst, String noOfChildren) {

		// 1. Select State Name
		selectOptionByText(ddnState,stateName);
		// 2. Select city name
		selectOptionByText(ddnCity,cityName);
		// 3. Select the room type
		selectRoomType(roomType);
		// 4. Insert checkInDate
		elementSendKeysJS(txtDateIn,checkInDate);
		// 5. Insert CheckOutDate
		elementSendKeysJS(txtDateOut,checkOutDate);
		// 6. Select NoOf Rooms
		selectOptionByText(ddnRoom,noOfRooms);
		// 7. Select no Of Adults
		selectOptionByText(ddnAdults,noOfAdulst);
		// 8. Insert No of children
		elementSendKeys(ddnChild,noOfChildren);
		
		clickSearchButton();

	}

	public void searchHotels(String stateName, String cityName, String checkInDate, String checkOutDate,
			String noOfRooms, String noOfAdulst) {
		// 1. Select State Name
		selectOptionByText(ddnState,stateName);
		// 2. Select city name
		selectOptionByText(ddnCity,cityName);
		// 3. Insert checkInDate
		elementSendKeysJS(txtDateIn,checkInDate);
		// 4. Insert CheckOutDate
		elementSendKeysJS(txtDateOut,checkOutDate);
		// 5. Select NoOf Rooms
		selectOptionByText(ddnRoom,noOfRooms);
		// 6. Select no Of Adults
		selectOptionByText(ddnAdults,noOfAdulst);
		
		clickSearchButton();

	}

	public void clickSearchButton() {
		
		switchToFrameByWebelement(iframe);
		
		elementClick(clkSearchBtn);
		
		switchToDefaultFrame();

	}

	public String getStateNameErrorMessageText() {
		String elementGetText = elementGetText(textStateNameErrorMessageText);
		return elementGetText;

	}

	public String getCityNameErrorMessageText() {
		String elementGetText = elementGetText(textCityNameErrorMessageText);
		return elementGetText;

	}

	public String getCheckInDateErrorMessageText() {
		String elementGetText = elementGetText(textCheckInDateErrorMessageText);
		return elementGetText;

	}

	public String getCheckOutDateErrorMessageText() {
		String elementGetText = elementGetText(textCheckOutDateErrorMessageText);
		return elementGetText;

	}

	public String getNoOfRoomsErrorMessageText() {
		String elementGetText = elementGetText(textRoomsErrorMessageText);
		return elementGetText;

	}

	public String getNoOfAdultsErrorMessageText() {
		String elementGetText = elementGetText(textAdultsErrorMessageText);
		return elementGetText;

	}


}
