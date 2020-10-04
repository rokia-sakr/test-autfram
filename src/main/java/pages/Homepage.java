package pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Homepage extends pagebase
{
	public Homepage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver; 
		action = new Actions(driver); 
	}

	
	@FindBy(linkText="Register")
	WebElement registerLink ; 

	@FindBy(linkText="Log in")
	WebElement loginLink; 
	
	@FindBy(linkText="Contact us")
	WebElement contactUsLink ; 
	
	@FindBy(id="customerCurrency")
	WebElement currencydrl; 
	
	@FindBy(linkText="Computers")
	WebElement ComputerMenu; 
	
	@FindBy(linkText="Notebooks")
	WebElement NotbooksMenu; 
	
	
	public void openRegistrationPage() 
	{
		registerLink.click();;
	}
	
	public void openLoginPage() 
	{
		loginLink.click();
	}
	
	public void openContactUsPage() 
	
	{
		scrollToBottom();
		contactUsLink.click();;
	}
	
	public void changeCurrency() 
	{
		select = new Select(currencydrl); 
		select.selectByVisibleText("Euro");
	}
	
	public void selectNotebooksMenu() 
	{
		action.moveToElement(ComputerMenu).perform();
	 NotbooksMenu.click();
		
	}
	
}
