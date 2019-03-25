package com.wbl.page;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wbl.base.BasePage;

public class HomePage extends BasePage {
	@FindBy(xpath="/html/body/div[1]/div/div/div[2]/div[1]/section/div/a")
	WebElement recElement;
	
	public HomePage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	
	public int numberOfSlides(){
	   List<WebElement> slides = driver.findElements(By.cssSelector("#promo-slider > ul > li"));
	   return slides.size();
	}
	
	public String getRecordingsText(){
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight);");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		//recElement = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/section/div/a"));
		return recElement.getText();
	}
	
	public LoginPage clickRecording(){
		recElement.click();
		return new LoginPage(driver);
	
	}

}
