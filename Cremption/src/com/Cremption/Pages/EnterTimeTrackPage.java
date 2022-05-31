package com.Cremption.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Cremption.GenericLib.BaseTest;

public class EnterTimeTrackPage {
	@FindBy(xpath="//div[text()='Tasks']")
	
	private WebElement tasksTab;
	@FindBy(xpath="//div[(@class='popup_menu_button popup_menu_button_settings ')]")
	private WebElement settingbtn;
	@FindBy(xpath="//a[text()='Logo Settings']")
	private WebElement logosettingoption;
	
	public EnterTimeTrackPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	public WebElement getTasksTab()
	{
		return tasksTab;
	}
	public void clickTasksTab() {
		
		
	
	tasksTab.click();
	}
	public WebElement getsettingbtn()
	{
		return settingbtn;
	}
	public void clicksettingbtn() {
		
		
	
	settingbtn.click();
	
		
	
	}
	public WebElement getLogosettingoption() {
		return logosettingoption;
	}
	public void Logosettingoption() {
		logosettingoption.click();
	}
	
}

	


