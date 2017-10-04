package com.test.automation.uiAutomation.addToCart;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiActions.AddToCartPOM;
import com.test.automation.uiAutomation.uiActions.Mens_Running_Shoe;

public class Main_TestScript extends TestBase {
	public WebDriver driver;
	public Mens_Running_Shoe home_page;
	public AddToCartPOM cart_page;
	public Properties OR = new Properties();
	@BeforeClass
	public void setUp1() throws IOException {
		      init(); 
			}
	@Test
	public void pumaAutomate() throws InterruptedException{
		Mens_Running_Shoe home_page=new Mens_Running_Shoe(driver);
		home_page.automateRunning();
		
      AddToCartPOM home_page2=new AddToCartPOM(driver);
      home_page2.automateAddToCart();
		Thread.sleep(3000);
		Assert.assertEquals(cart_page.productTitle(), OR.getProperty("expected_title"),"Both are not matched");
		Thread.sleep(3000);
		Assert.assertEquals(cart_page.verifyProductSize(), OR.getProperty("expected_size"),"Size doesnot match");
		Thread.sleep(3000);
		Assert.assertEquals(cart_page.verifyQuantiy(), OR.getProperty("expected_quantity"),"quantity not as expected");
		
		
		}
	}

