package com.wbl.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wbl.base.BasePage;

public class LoginPage extends BasePage{
	 WebElement username1;
	 WebElement password1;
	 WebElement login1;
	 

	public LoginPage(WebDriver driver) {
	super(driver);
	}
	
	 public void login(String username, String Password){
		 username1=driver.findElement(By.xpath("//*[@id='username']"));
		 password1=driver.findElement(By.xpath("//*[@id='password']"));
		 login1=driver.findElement(By.xpath("//*[@id='login']"));
	 
	 }
	 
	 public String getTitle(){
		 return driver.getTitle();
	 }
	
	

}
