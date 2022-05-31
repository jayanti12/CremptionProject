package com.Cremption.Tasks;

import org.testng.annotations.Test;

import com.Cremption.GenericLib.BaseTest;
import com.Cremption.GenericLib.FileLib;
import com.Cremption.Pages.EnterTimeTrackPage5;
import com.Cremption.Pages.EnterTimeTrackPage6;

public class CreateTasksTest extends BaseTest{
	@Test
	public void createnewtest() throws Throwable
	{
		//verify tasklist page
		VerifyTasks vt=new VerifyTasks();
		vt.verifyTesksTest();
		
		//click on add new button
		EnterTimeTrackPage6 tp=new EnterTimeTrackPage6();
		
		//click on new Addnew
		tp.clickAddnewbtn();
		//click on new tasks
		  tp.clickcreatenewtaskbtn();
		//create new tasks
		FileLib flib=new FileLib();
		String taskname=flib.readExcelData(EXCEL_PATH," sheet1", 0, 0);
		tp.getnewtaskbtn();
		tp.clickcreatetaskbtn();

}
}
