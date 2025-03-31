package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class BookingConfirmPage extends BaseClass {
	
	public BookingConfirmPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[contains(text(),' Booking is Confirmed ')]")
	private WebElement bookingMessage;

}
