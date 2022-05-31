package com.Cremption.Tasks;

import org.testng.annotations.Test;

import com.Cremption.GenericLib.BaseTest;
import com.Cremption.Pages.LoginErrorMessage;

public class CreateErrorMessage extends BaseTest {
	@Test
	public void messageError()
	
	{
		LoginErrorMessage lm=new LoginErrorMessage();
		lm.Loginbtn();
		lm.ErrorMsgLine();
		
	}
	

}
