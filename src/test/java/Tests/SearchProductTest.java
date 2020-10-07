package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetailsPage;
import pages.SearchPage;

public class SearchProductTest extends Testbase
{
	String productName = "Apple MacBook Pro 13-inch"; 
	SearchPage searchObject ; 
	ProductDetailsPage detailsObject ;
	@Test
	public void UserCanSearchForProducts() 
	{
		searchObject  = new SearchPage(driver); 
		detailsObject = new ProductDetailsPage(driver); 
		searchObject.ProductSearch(productName);
		searchObject.OpenProductDetailsPage();
		Assert.assertEquals(detailsObject.productNamebreadCrumb.getText(), productName);
	}
}
