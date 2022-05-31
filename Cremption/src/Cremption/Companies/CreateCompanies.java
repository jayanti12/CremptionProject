package Cremption.Companies;

import org.testng.annotations.Test;

import com.Cremption.GenericLib.BaseTest;
import com.Cremption.GenericLib.WebDriverCommon;
import com.Cremption.Login.ValidLoginTest;
import com.Cremption.Pages.CompaniesTab;
import com.Cremption.Pages.ContactPage;
import com.Cremption.Pages.HomePage;

public class CreateCompanies extends BaseTest {
	@Test
	public void CreateCompaniesTabTest() throws Throwable
	{
		//
		ValidLoginTest v1=new ValidLoginTest();
		v1.ValidLogin();
		//click on contact tab
		HomePage hp=new HomePage();
		hp.clickContactstab();
		//verify contacts Page
		WebDriverCommon wlib=new WebDriverCommon();
		CompaniesTab cp=new CompaniesTab();
		wlib.elementDisplayed(cp.getcompaniestab(), "Companies Tab");
	}
	

}

	


