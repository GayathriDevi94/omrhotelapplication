package com.omrbranch.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class SelectHotelPage extends BaseClass {
	
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(tagName="h5")
	private List<WebElement> hotels;
	
	@FindBy(xpath="//strong[@class='total-prize']")
	private List<WebElement> totalPrice;
	
	@FindBy(xpath="//a[@class='btn filter_btn']")
	private WebElement hotel;
	
	@FindBy(xpath="//label[contains(text(),'Price low to high')]")
	private WebElement rdoPriceLowToHigh;
	
	@FindBy(xpath="//label[contains(text(),'Name Descending')]")
	private WebElement rdoNameSorting;
	
	@FindBy(xpath="//h5[text()='Select Hotel']")
	private WebElement textHotel;
	

	public String getSelectHotelText() {
		
		String elementGetText = elementGetText(textHotel);
		return elementGetText;
	}

	public void clickSortPriceLowToHigh() {
		
		jsClick(rdoPriceLowToHigh);
		
		
	}

	// return as boolean
	public boolean verifyHotelPriceLowToHigh() {
		
//		List<WebElement> totalPrice = findLocatorByXpathList("\"//strong[@class='total-prize']\"");
		
		List<Integer> devList = new ArrayList<Integer>();
		
		for (int i = 0; i < totalPrice.size(); i++) {
			WebElement price = totalPrice.get(i);
			String priceHotelText = price.getText();
			String replacedText = priceHotelText.replaceAll("[$,]", "");
			int finalText = Integer.parseInt(replacedText.trim());
			devList.add(finalText);
		}
		List<Integer> qaList = new ArrayList<Integer>();
		qaList.addAll(devList);
		Collections.sort(qaList);
		
		boolean result = qaList.equals(devList);
		
		return result;
		

	}

	public void clickSortHotelNameDesc() {
		
		jsClick(rdoNameSorting); 
		
		
	}

	// return as boolean
	public boolean verifyHotelNameDesc() {
		
		List<String> devNameList = new ArrayList<String>();

//		List<WebElement> hotels = findLocatorByTagNameList("h5");
		for (WebElement allHotels : hotels) {
			
			String hotelsList = allHotels.getText();
			
			if(!hotelsList.equals("Select Hotel"))
			{
				devNameList.add(hotelsList);	
			}
			
		}
		List<String> qaNameList = new ArrayList<String>();
		
		qaNameList.addAll(devNameList);
		
		Collections.reverse(qaNameList);
		
		boolean result = qaNameList.equals(devNameList);
		
		return result;

	}

}
