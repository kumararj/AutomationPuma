package com.test.automation.uiAutomation.uiActions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.automation.uiAutomation.testBase.TestBase;

public class Mens_Running_Shoe extends TestBase{
	public WebDriver driver;

@FindBy(xpath=".//*[@id='mp-pusher']//descendant::ul[@class='products-grid products-grid--max-4-col first last odd']")
WebElement clickons2ndshoe;
@FindBy(xpath="//div[@id='header-nav']//descendant::a[normalize-space(text())='MEN']")
WebElement mouseOverMen;
@FindBy(xpath="//li[@id='men-subnav']/descendant::a[text()='Running' and @href='https://in.puma.com/men/shoes/running.html?dir=asc&order=position&in-stock=1']")
WebElement clickOnRunning;
@FindBy(xpath="//*[@class='product-image promainimg']/following::a[@href='https://in.puma.com/men/shoes/running/ignite-3-men-s-running-shoes-18944906.html']")
WebElement clickOn2shoe;

public Mens_Running_Shoe(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

public void mouseHover(){
	Actions act=new Actions(driver);
	act.moveToElement(mouseOverMen);
}
public void clickOptions(){
	clickOnRunning.click();
}
public void clickOnShoe() throws InterruptedException{
	String e = clickOn2shoe.getText();
	List<WebElement> allShoe = driver.findElements(By.xpath(".//*[@id='mp-pusher']/div/div[5]/div[2]/div[2]/div[2]/div/ul[1]"));
	
	for(int i=0; i< allShoe.size();i++){
		WebElement shoe_select = allShoe.get(i);
		if(shoe_select.getText().contains("e")){
			((JavascriptExecutor) driver).executeScript("scroll(0,250)");
			Thread.sleep(30000);
			clickOn2shoe.click();
		}
	}
}

public void automateRunning() throws InterruptedException{
	Mens_Running_Shoe home_page=new Mens_Running_Shoe(driver);
	//mouse over on MEN bar
	Thread.sleep(10000);
	home_page.mouseHover();
	Thread.sleep(3000);
	//Click on menu options
	home_page.clickOptions();
	//click on 2nd shoe from list
	Thread.sleep(3000);
	home_page.clickOnShoe();
	

	
}

}
