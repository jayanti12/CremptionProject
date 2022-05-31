package com.Cremption.Tasks;

import org.testng.annotations.Test;

import com.Cremption.GenericLib.BaseTest;
import com.Cremption.GenericLib.FileLib;
import com.Cremption.GenericLib.WebDriverCommon;
import com.Cremption.Login.ValidLoginTest;
import com.Cremption.Pages.EnterTimeTrackPage1;
import com.Cremption.Pages.EnterTimeTrackPage2;

public class VerifyTasks2 extends BaseTest{
	@Test
	public void verifyTesksTest() throws Throwable
	{
		//login to app with valid user data
		ValidLoginTest v1=new ValidLoginTest();
		v1.ValidLogin();
		
		
		//click on Reports Tab
		EnterTimeTrackPage2 et=new EnterTimeTrackPage2();
		et.clickUsersTab();
		//verify Reports page
		
		WebDriverCommon wlib=new WebDriverCommon();
		FileLib flib=new FileLib();
		wlib.verify(wlib.getPageTitle(),
				flib.readPropertyData(PROP_PATH, "usersTitle" )," Users List Page");
	}
		
		
		
		
}
