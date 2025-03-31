package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class BookHotelPage extends BaseClass {
	
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="booking_for")
	private WebElement bookingFor;
	
	@FindBy(id="user_title")
	private WebElement userTitle;
	
	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="user_phone")
	private WebElement txtMobile;
	
	@FindBy(id="user_email")
	private WebElement txtMail;
	
	@FindBy(id="gst")
	private WebElement chkGst;
	
	@FindBy(id="gst_registration")
	private WebElement txtReg;
	
	@FindBy(id="company_name")
	private WebElement txtName;
	
	@FindBy(id="company_address")
	private WebElement txtAddress;
	
	@FindBy(id="btnNext")
	private WebElement step1next;
	
	@FindBy(id="high")
	private WebElement rdoReq;
	
	@FindBy(id="step2next")
	private WebElement btnNext1;
	
	@FindBy(id="payment_type")
	private WebElement payment;
	
	@FindBy(id="card_type")
	private WebElement cardType;
	
	@FindBy(id="card_no")
	private WebElement txtCard;
	
	@FindBy(id="card_name")
	private WebElement cardHolderName;
	
	@FindBy(id="CardMonth")
	private WebElement card_month;
	
	@FindBy(id="cvv")
	private WebElement cvv;
	
	@FindBy(id="submitBtn")
	private WebElement btnSubmit;
	
	@FindBy(xpath="//h5[text()='Credit/Debit/ATM Card']")
	private WebElement btnPayment;

}
