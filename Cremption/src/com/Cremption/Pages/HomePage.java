package com.Cremption.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Cremption.GenericLib.BaseTest;

public class HomePage {
	@FindBy(xpath="//span[text()='Calendar']") private WebElement calendertab;
	@FindBy(xpath="//span[text()='Contacts']") private WebElement contactstab;
	@FindBy(xpath="//span[text()='Companies']") private WebElement companiestab;
	@FindBy(xpath="//span[text()='Deals']") private WebElement dealstab;
	@FindBy(xpath="//span[text()='Cases']") private WebElement casetab;
	@FindBy(xpath="//span[text()='Calls']") private WebElement callstab;
	@FindBy(xpath="//span[text()='Documents']") private WebElement documentstab;
	@FindBy(xpath="//span[text()='Email']") private WebElement emailtab;
	@FindBy(xpath="//span[text()='Campaigns']") private WebElement campaigntab;
	@FindBy(xpath="//span[text()='Forms']") private WebElement formtab;
	public HomePage(){
		PageFactory.initElements(BaseTest.driver,this);
	}
	public WebElement getCalendertab() {
		return calendertab;
	}
	public void clickCalendertab() {
		calendertab.click();
	}
	public WebElement getContactstab() {
		return contactstab;
	}
	public void clickContactstab() {
		contactstab.click();
	}
	public WebElement getCompaniestab() {
		return companiestab;
	}
	public void clickCompaniestab() {
		companiestab.click();
	}
	public WebElement getDealstab() {
		return dealstab;
	}
	public void clickDealstab() {
		dealstab.click();
	}
	public WebElement getCasetab() {
		return casetab;
	}
	public void clickCasetab() {
		casetab.click();
	}
	public WebElement getCallstab() {
		return callstab;
	}
	public void clickCallstab() {
		callstab.click();
	}
	public WebElement getDocumentstab() {
		return documentstab;
	}
	public void clickDocumentstab() {
		documentstab.click();
	}
	public WebElement getEmailtab() {
		return emailtab;
	}
	public void clickEmailtab() {
		emailtab.click();
	}
	public WebElement getCampaigntab() {
		return campaigntab;
	}
	public void clickCampaigntab() {
		campaigntab.click();
	}
	public WebElement getFormtab() {
		return formtab;
	}
	public void clickFormtab() {
		formtab.click();
	}

		
	}
	
		
	
	
	
	

