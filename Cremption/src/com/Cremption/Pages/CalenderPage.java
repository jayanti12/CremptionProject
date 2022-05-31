package com.Cremption.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Cremption.GenericLib.BaseTest;

public class CalenderPage {
	@FindBy(xpath="//button[@class='ui linkedin button']")
	private WebElement calenderTab;
	public CalenderPage() {
		PageFactory.initElements(BaseTest.driver,this );
	}
		public WebElement getcalenderTab() {
			return calenderTab;
		}
		public void clickcalenderTab()
		{
			calenderTab.click();
		}
	}


