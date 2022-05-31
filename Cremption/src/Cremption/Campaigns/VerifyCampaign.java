package Cremption.Campaigns;

import org.testng.annotations.Test;

import com.Cremption.GenericLib.BaseTest;
import com.Cremption.Login.ValidLoginTest;
import com.Cremption.Pages.HomePage;

public class VerifyCampaign extends BaseTest{
	@Test
	public void verifyCampaign() throws Throwable {
		
		ValidLoginTest v1=new ValidLoginTest();
		v1.ValidLogin();
		
		HomePage hp=new HomePage();
		hp.clickCampaigntab();

}
}
