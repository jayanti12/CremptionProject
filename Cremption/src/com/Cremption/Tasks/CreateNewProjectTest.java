package com.Cremption.Tasks;

import org.testng.annotations.Test;

import com.Cremption.GenericLib.BaseTest;
import com.Cremption.GenericLib.FileLib;
import com.Cremption.Pages.EnterTimeTrackPage4;
import com.Cremption.Pages.EnterTimeTrackPage5;

public class CreateNewProjectTest extends BaseTest{
	@Test
	public void createnewtest() throws Throwable
	{
		//verify tasklist page
		VerifyTasks vt=new VerifyTasks();
		vt.verifyTesksTest();
		
		//click on add new button
		EnterTimeTrackPage5 tp=new EnterTimeTrackPage5();
		
		//click on new project
		tp.clickAddnewbtn();
		//click on new project
		  tp.clickcreatenewprojectbtn();
		//create new project
		FileLib flib=new FileLib();
		String proname=flib.readExcelData(EXCEL_PATH, "sheet1", 0, 1);
		tp.getenterprojectnamebtn().sendKeys(proname);
		tp.getAddcustomerbtn().sendKeys(proname);

		tp.clickcreteprojectbtn();
		
	}

}


