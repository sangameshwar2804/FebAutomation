package com.wbl.base;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.wbl.page.HomePage;
import com.wbl.page.LoginPage;
import com.wbl.page.SchedulePage;

public class BasePage {
	protected  WebDriver driver;
	 
	 
	 
	 
	 @FindBy(how=How.XPATH, using="//*[@id='logo']")//xpath="//*[@id='logo']")
	 WebElement logo;
	 
	 @FindBy(how=How.XPATH, using="//*[@id='navbar-collapse']/ul/li[1]/a")
	 WebElement home;
	 
	 @FindBy(how=How.XPATH, using="//*[@id='navbar-collapse']/ul/li[2]/a")
	 WebElement schedule;
	 
	 @FindBy(how=How.XPATH, using="//*[@id='loginButton']")
	 WebElement login;
	

	//WebElement logo;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 public HomePage logoClick(){
		 //logo=driver.findElement(By.xpath("//*[@id='logo']"));
		 logo.click();
		return new HomePage(driver);
		 
	 }
	
	 public HomePage HomeClick(){
		 //logo=driver.findElement(By.xpath("//*[@id='navbar-collapse']/ul/li[1]/a"));
		 logo.click();
		return new HomePage(driver);
		 
	 }
	 public SchedulePage ScheduleClick(){
		 //logo=driver.findElement(By.xpath("//*[@id='navbar-collapse']/ul/li[2]/a"));
		 //logo.click();
		 schedule.click();
		return new SchedulePage(driver);
		 
	 }
	 public LoginPage LoginClick(){
		 //logo=driver.findElement(By.xpath("//*[@id='loginButton']"));
		 //logo.click();
		 login.click();
		return new LoginPage(driver);
		 
	 }
}
