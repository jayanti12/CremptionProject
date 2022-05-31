package Cremption.Contact;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Cremption.GenericLib.BaseTest;
import com.Cremption.GenericLib.WebDriverCommon;
import com.Cremption.Login.ValidLoginTest;
import com.Cremption.Pages.ContactPage;
import com.Cremption.Pages.HomePage;
@Listeners(com.Cremption.GenericLib.MyListeners.class)
public class verifyContactsTab extends BaseTest {
	@Test
	public void verifyContactsTabTest() throws Throwable
	{
		//
		ValidLoginTest v1=new ValidLoginTest();
		v1.ValidLogin();
		//click on contact tab
		HomePage hp=new HomePage();
		hp.clickContactstab();
		//verify contacts Page
		WebDriverCommon wlib=new WebDriverCommon();
		ContactPage cp=new ContactPage();
		wlib.elementDisplayed(cp.getContactsPage(), "Contact Page");
	}
	

}
