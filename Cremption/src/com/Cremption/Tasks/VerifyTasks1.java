package com.Cremption.Tasks;

import org.testng.annotations.Test;

import com.Cremption.GenericLib.BaseTest;
import com.Cremption.GenericLib.FileLib;
import com.Cremption.GenericLib.WebDriverCommon;
import com.Cremption.Login.ValidLoginTest;
import com.Cremption.Pages.EnterTimeTrackPage;
import com.Cremption.Pages.EnterTimeTrackPage1;

public class VerifyTasks1 extends BaseTest{
	@Test
	public void verifyTesksTest() throws Throwable
	{
		//login to app with valid user data
		ValidLoginTest v1=new ValidLoginTest();
		v1.ValidLogin();
		
		
		//click on users list Tab
		EnterTimeTrackPage1 et=new EnterTimeTrackPage1();
		et.clickReportsTab();
		//verify users list page
		
		WebDriverCommon wlib=new WebDriverCommon();
		FileLib flib=new FileLib();
		wlib.verify(wlib.getPageTitle(),
				flib.readPropertyData(PROP_PATH, "reportsTitle" )," Reports Dashboard Page");
	}
		
		
		
		
		
		
}
