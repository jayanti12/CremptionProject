package com.Cremption.Tasks;

import org.testng.annotations.Test;

import com.Cremption.GenericLib.BaseTest;
import com.Cremption.GenericLib.FileLib;
import com.Cremption.GenericLib.WebDriverCommon;
import com.Cremption.Login.ValidLoginTest;
import com.Cremption.Pages.EnterTimeTrackPage;
import com.Cremption.Pages.EnterTimeTrackPage2;
import com.Cremption.Pages.EnterTimeTrackPage3;

public class VerifyTask3 extends BaseTest{
	@Test
	public void verifyTesksTest3() throws Throwable
	{
		//login to app with valid user data
		ValidLoginTest v1=new ValidLoginTest();
		v1.ValidLogin();
		
		
		//click on Reports Tab
		EnterTimeTrackPage3 et=new EnterTimeTrackPage3();
		et.clicksettingbtn();
		
	
		
	
		
		
	}
	
	
		
		
		
		

}
