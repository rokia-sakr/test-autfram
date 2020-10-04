package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Loginpage extends pagebase
{

	public Loginpage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="Email")
	WebElement emailTxtBox ; 

	@FindBy(id="Password")
	WebElement passwordTxtBox ; 

	@FindBy(css="input.button-1.login-button")
	WebElement loginBtn ; 
	
	public void UserLogin(String email , String password) 
	{
		emailTxtBox.sendKeys(email);
		passwordTxtBox.sendKeys(password);
		//setTextElementText(emailTxtBox, email);
		//setTextElementText(passwordTxtBox, password);
		loginBtn.click();
	}
}
