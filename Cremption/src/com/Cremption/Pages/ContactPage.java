package com.Cremption.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Cremption.GenericLib.BaseTest;

public class ContactPage {
	@FindBy(xpath="//button[@class='ui linkedin button'][2]")
	private WebElement createbtn;
	@FindBy(name="first_name") private WebElement firstnamebox;
	@FindBy(name="last_name") private WebElement lastnamebox;
	@FindBy(name="middle_name") private WebElement middlenamebox;
	
	public void ContactPageTest()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getContactsPage() {
		
		return createbtn;
	}
	public void clickcreatebtn() {
		createbtn.click();
	}
	public WebElement getfirstnamebox() {
		return firstnamebox;
	}
	public void clickfirstnamebox() {
		firstnamebox.click();
	}
	public WebElement getlastnamebox() {
		return lastnamebox;
	}
	public void clicklastnamebox() {
		lastnamebox.click();
	
	}
	public WebElement getmiddlenamebox() {
		return middlenamebox;
	}
	public void clickmiddlenamebox() {
		middlenamebox.click();
	}

}
