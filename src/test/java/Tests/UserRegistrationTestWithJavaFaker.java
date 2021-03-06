package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.Homepage;
import pages.Loginpage;
import pages.UserRegistrationPage;

public class UserRegistrationTestWithJavaFaker extends Testbase
{
	Homepage homeObject ; 
	UserRegistrationPage registerObject ; 
	Loginpage loginObject ; 
	Faker fakeData=new Faker();
	String firstname = fakeData.name().firstName(); 
	String lastname = fakeData.name().lastName(); 
	String email = fakeData.internet().emailAddress(); 
	String password = fakeData.number().digits(8).toString();
	@Test(priority=1,alwaysRun=true)
	public void UserCanRegisterSuccssfully() 
	{
		homeObject = new Homepage(driver); 
		homeObject.openRegistrationPage();
		registerObject = new UserRegistrationPage(driver); 
		registerObject.userRegistration(firstname,lastname,email,password);
		System.out.println("The Userr Data is : "+ firstname + " " + lastname + " " + email + " " + password);
		Assert.assertTrue(registerObject.successMessage.getText().contains("Your registration completed"));
	}
	@Test(priority = 2)
	public void RegisteredUserCanLogout() 
	{
		registerObject.userLogout();
	}
	@Test(priority = 3)
	public void RegisteredUserCanLogin() 
	{
		homeObject.openLoginPage();
		loginObject = new Loginpage(driver); 
		loginObject.UserLogin(email,password);
		Assert.assertTrue(registerObject.logoutLink.getText().contains("Log out"));
	}
	
}
