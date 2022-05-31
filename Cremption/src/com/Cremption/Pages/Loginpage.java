package com.Cremption.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Cremption.GenericLib.BaseTest;

public class Loginpage {
@FindBy(name="email")private WebElement emailtb;
@FindBy(name="password")private WebElement pwtb;
@FindBy(xpath="//div[text()='Login']")
private WebElement loginBtn;



public Loginpage()
{
	PageFactory.initElements(BaseTest.driver, this);
}
public void login(String un,String pw)
{
	emailtb.sendKeys(un);
	pwtb.sendKeys(pw);
	loginBtn.click();
	
	
}
public WebElement getemailtb() {
	return emailtb;
}
public WebElement getpwtb() {
	return pwtb;
}
public WebElement getloginBtn() {
	return loginBtn;
}


	
}

