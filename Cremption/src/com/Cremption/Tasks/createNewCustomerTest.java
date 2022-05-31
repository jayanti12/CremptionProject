package com.Cremption.Tasks;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Cremption.GenericLib.BaseTest;
import com.Cremption.GenericLib.FileLib;
import com.Cremption.Pages.EnterTimeTrackPage;
import com.Cremption.Pages.EnterTimeTrackPage4;
@Listeners(com.Cremption.GenericLib.MyListeners.class)

public class createNewCustomerTest extends BaseTest{
	@Test
	public void createnewtest() throws Throwable
	{
		//verify tasklist page
		VerifyTasks vt=new VerifyTasks();
		vt.verifyTesksTest();
		
		//click on add new button
		EnterTimeTrackPage tp=new EnterTimeTrackPage();
		
		//click on new customer
		tp.clickAddnewbtn();
		//click on new customer
		  tp.clickcreatenewcustomerbtn();
		//create new customer
		FileLib flib=new FileLib();
		String cusname=flib.readExcelData(EXCEL_PATH, "Sheet1", 0, 0);
		tp.getentercustomerbtn().sendKeys(cusname);
		tp.clickcretecustomerbtn();
		tp.getToastContainerLine();
		
	}

}
