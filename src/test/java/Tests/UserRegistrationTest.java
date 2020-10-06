package Tests;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Loginpage;
import pages.UserRegistrationPage;
public class UserRegistrationTest extends Testbase 
{
	Homepage homeObject ; 
	UserRegistrationPage registerObject;
	Loginpage loginObject ; 
	@Test(priority=1,alwaysRun=true)
	public void UserCanRegisterSuccssfully() 
	{
		homeObject = new Homepage(driver); 
		homeObject.openRegistrationPage();
		registerObject = new UserRegistrationPage(driver);
		registerObject.userRegistration("Moataz", "Nabil", "t2test977222@gmail.com", "12345678");
		Assert.assertTrue(registerObject.successMessage.getText().contains("Your registration completed"));
}
	@Test(priority=2)
	public void RegisteredUserCanLogout() 
	{
		registerObject.userLogout();	
	}
	@Test(priority=3)
	public void RegisteredUserCanLogin() 
	{
		homeObject.openLoginPage();
		loginObject = new Loginpage(driver); 
		loginObject.UserLogin("t2test977222@gmail.com","12345678");
		Assert.assertTrue(registerObject.logoutLink.getText().contains("Log out"));
	}
	
}
