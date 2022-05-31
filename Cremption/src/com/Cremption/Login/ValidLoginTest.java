package com.Cremption.Login;

import org.testng.annotations.Listeners;

import org.testng.annotations.Test;

import com.Cremption.GenericLib.BaseTest;
import com.Cremption.GenericLib.FileLib;
import com.Cremption.GenericLib.WebDriverCommon;
import com.Cremption.Pages.Loginpage;

@Listeners(com.Cremption.GenericLib.MyListeners.class)
public class ValidLoginTest extends BaseTest{
	

	@Test
	public void ValidLogin() throws Throwable 
	{
		//open the browser
		//enter the url
		//verify LoginPage is displayed
		FileLib flib=new FileLib();
		//Login to App
		//verify Home page is displayed
		Loginpage lp=new Loginpage();
		 lp.login(flib.readPropertyData(PROP_PATH,"emailaddress"),
				flib.readPropertyData(PROP_PATH, "password"));
		//verify Home page is displayed
		WebDriverCommon wlib=new WebDriverCommon();
		wlib.waitForPageTitle(flib.readPropertyData(PROP_PATH, "homeTitle"));
		wlib.verify(wlib.getPageTitle(),
				flib.readPropertyData(PROP_PATH, "homeTitle"),"Cogmento CRM");
		
	}	
				
	
		
	}


