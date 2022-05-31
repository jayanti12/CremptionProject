package Cremption.Deals;

import org.testng.annotations.Test;

import com.Cremption.Login.ValidLoginTest;
import com.Cremption.Pages.HomePage;

public class VerifyDeals {
	@Test
	public void verifyDealsTabTest() throws Throwable
	{
		//login the browsers
		ValidLoginTest v1=new ValidLoginTest();
		v1.ValidLogin();
		//click on contact tab
		HomePage hp=new HomePage();
		hp.clickContactstab();

}
}
