package Cremption.Calender;

import org.testng.annotations.Test;

import com.Cremption.GenericLib.BaseTest;
import com.Cremption.GenericLib.WebDriverCommon;
import com.Cremption.Login.ValidLoginTest;
import com.Cremption.Pages.CalenderPage;
import com.Cremption.Pages.HomePage;

public class VerifyCalenderTabs extends BaseTest {
	@Test
	public void verifyCalenderTabTest() throws Throwable {
		
		ValidLoginTest v1=new ValidLoginTest();
		v1.ValidLogin();
		
		HomePage hp=new HomePage();
		hp.clickCalendertab();
		
		CalenderPage cp=new CalenderPage();
		WebDriverCommon wlib=new WebDriverCommon();
		wlib.elementDisplayed(cp.getcalenderTab(), "Calender Tab");
		
	}

}
