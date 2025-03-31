package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement txtEmail;
	
	@FindBy(id="pass")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//button[@value='login']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement txtSuccessMessage;
	
	@FindBy(id = "errorMessage")
	private WebElement textLoginErrorMessage;

	// 1. Login
	public void login(String emailId, String password) {
		elementSendKeys(txtEmail, emailId);
		elementSendKeys(txtPassword, password);
		elementClick(btnLogin);
	}

	// 2. Login using enter key
	public void loginWithEnterKey(String emailId, String password) {
		elementSendKeys(txtEmail, emailId);
		elementSendKeysEnter(txtPassword, password);

	}

	// 3. Login error message text
	public String getLoginErrorMessageText() {
		String elementGetText = elementGetText(textLoginErrorMessage);
		return elementGetText;
	}

}
