package com.Cremption.GenericLib;

import java.io.File;
import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.common.io.Files;

public class WebDriverCommon {
	public String getPageTitle()
	{
		return BaseTest.driver.getTitle();
		
	}
	public void verify(String actual,String expected,String Page)
	{
		Assert.assertEquals(actual, expected);
		Reporter.log(Page+" is Displayed,PASS",true);
	}
	public  void elementSelected(WebElement element,String elementName){
		if(element.isSelected()) {
			Reporter.log(elementName+"is already Selected",true);
		}
		else
		{
			Reporter.log("Selecting now:"+elementName,true);
			element.click();
		}
		
	}
	public void mouseHover(WebElement element)
	{
		Actions ac=new Actions(BaseTest.driver);
		ac.moveToElement(element).perform();
	}
	public void rightClick(WebElement element)
	{
		Actions ac=new Actions(BaseTest.driver);
		ac.contextClick(element).perform();
	}
	public void selectOption(WebElement ddAddr,int index)
	{
		Select sel=new Select(ddAddr);
		sel.selectByIndex(index);
	}
	public void selectOption(WebElement ddAddr, String Value)
	{
		Select sel=new Select(ddAddr);
		sel.selectByValue(Value);
	}
	public void selectOption(String text,WebElement ddAddr)
	{
		Select sel=new Select(ddAddr);
		sel.selectByVisibleText(text);
	}
	public void switchToFrame(int index)
	{
		BaseTest.driver.switchTo().frame(index);
	}
	public void switchToFrame(String value)
	{
		BaseTest.driver.switchTo().frame(value);
	}
	public void switchToFrame(WebElement frameElement)
	{
	BaseTest.driver.switchTo().frame(frameElement);	
	}
	public void waitForPageTitle(String title)
	{
		WebDriverWait wait=new WebDriverWait(BaseTest.driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains(title));
	}
	public void getFullScreenshot(String path)
	{
		TakesScreenshot ts=(TakesScreenshot)BaseTest.driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path);
		try {
			Files.copy(src, dest);
		}catch(IOException e) {
		e.printStackTrace();	
			
		}
	}
		public void  elementDisplayed(WebElement element,String elementName)
		{
			if(element.isDisplayed())
			{
				Assert.assertTrue(true);
				Reporter.log(elementName+"is  Displayed",true);
			}
			else
			{
				Reporter.log(elementName+"is notDisplayed",true);
				Assert.assertTrue(false);
			}
				
		
		

}
}
