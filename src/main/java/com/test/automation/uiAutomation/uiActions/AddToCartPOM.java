package com.test.automation.uiAutomation.uiActions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.test.automation.uiAutomation.testBase.TestBase;



public class AddToCartPOM extends TestBase{
public WebDriver driver;
public WebElement element;
public WebElement Quantity_IT;

@FindBy(xpath="//div[@class='add-to-cart-qty']//preceding::div[@class='product-size-click-btn']")
WebElement SelectShoeSize;

@FindBy(xpath="//select[@id='qty']//following::option[@value='1']")
WebElement selectQuantity;


@FindBy (xpath="//ul[@class='add-to-links']//preceding::span[text()='Add to Cart']")
WebElement AddToCart;

@FindBy(xpath="//div[@class='product-name']//span")
WebElement ShoeTitle;



public AddToCartPOM(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void selectProductSize() throws InterruptedException{
	SelectShoeSize.click();
	 Thread.sleep(30000);
	 List<WebElement> size_dropdown = driver.findElements(By.xpath("//ul[@id='configurable_swatch_size']//li/a"));
	 for(int i=0; i< size_dropdown.size();i++){
		 element = size_dropdown.get(i); 
		System.out.println(element);
		if(element.getAttribute("name").contains("7")){
			element.click();
			
		}
	 }
}
	 public void selectProductQuantity(){
		 WebElement quantity_dropdown = driver.findElement(By.xpath("//select[@id='qty']"));
			Select select=new Select(quantity_dropdown);
			List<WebElement> Quantity_value = select.getOptions();
			for(int i=0; i< Quantity_value.size();i++){
				 Quantity_IT = Quantity_value.get(i);
				if(Quantity_IT.getAttribute("value").equals("4")){
					Quantity_IT.click();
		 
		 
	 }
		}

			//return Quantity_IT;
}
	 public void clickOnAddToCart(){
		 AddToCart.click();
	 }

	 public String productTitle(){
		//String title = ShoeTitle.getText();
		 return ShoeTitle.getText();
	 }
	 public void verifyProductAdded(){
		 String text = driver.findElement(By.xpath("//div[@class='product-details']//following::a[text()=\"Speed IGNITE NETFIT Men's Running Shoes\"]")).getText();
	 }
     public String verifyQuantiy(){
    	 
	    return Quantity_IT.getAttribute("value");
}
	 public String verifyProductSize(){
		 
		return element.getAttribute("name");
		 
	 }
	 
public void winowHandle(){
	String parent_window = driver.getWindowHandle();
Set<String>	s1=driver.getWindowHandles();
Iterator<String> i1 = s1.iterator();
while(i1.hasNext()){
	String child_window=i1.next();
	if(!parent_window.equalsIgnoreCase(child_window))
	{
		driver.switchTo().window(child_window);
		
	}
}
}
public void automateAddToCart() throws InterruptedException{
	AddToCartPOM cart_page=new AddToCartPOM(driver);
		cart_page.winowHandle();
		Thread.sleep(3000);
		//
		cart_page.selectProductSize();
		Thread.sleep(30000);
		
		cart_page.selectProductQuantity();
		Thread.sleep(3000);
}
	 
	 
	 
	 
}