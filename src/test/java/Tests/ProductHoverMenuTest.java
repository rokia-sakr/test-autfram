package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Homepage;

public class ProductHoverMenuTest extends Testbase
{
Homepage homeObject ; 
	
	@Test
	public void UserCanSelectSubCategoryFromMainMenu() 
	{
		homeObject = new Homepage(driver); 
		homeObject.selectNotebooksMenu();
		Assert.assertTrue(driver.getCurrentUrl().contains("notebooks"));
	}
}
