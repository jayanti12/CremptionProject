package com.Cremption.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Cremption.GenericLib.BaseTest;

public class CompaniesTab  {
	@FindBy(xpath="//button[@class='ui linkedin button']")
	private WebElement companiestab;
	
	public CompaniesTab() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	public WebElement getcompaniestab() {
		return companiestab;
	}
	public void clickcompaniestab() {
		companiestab.click();
	}
	
	

}
