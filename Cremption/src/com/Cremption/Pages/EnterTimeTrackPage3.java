package com.Cremption.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Cremption.GenericLib.BaseTest;

public class EnterTimeTrackPage3 {
	@FindBy(xpath="//div[(@class='popup_menu_button popup_menu_button_settings ')]")
	private WebElement settingbtn;
	

	public EnterTimeTrackPage3()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	public WebElement getsettingbtn()
	{
		return settingbtn;
	}
	public void clicksettingbtn() {
		
		
	
	settingbtn.click();
}
}


