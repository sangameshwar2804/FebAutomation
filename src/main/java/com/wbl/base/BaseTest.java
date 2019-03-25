package com.wbl.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.wbl.utility.ConfigUtil;
import com.wbl.utility.Constants;
import com.wbl.utility.ScreenShotUtil;
import com.wbl.utility.WebDriverUtil;

public class BaseTest {
	protected WebDriver driver;

	protected static String url;
	
	protected static String browser;
	static Logger log = LogManager.getLogger(BaseTest.class);
	
	
	@BeforeSuite//(alwaysRun=true)
	public void beforeSuite(){
		ConfigUtil configUtils = new ConfigUtil(Constants.RESOURCES_PROPERTIES_PATH +"config.properties");
		url=configUtils.getProperty("url");
		browser=configUtils.getProperty("browser");
	}
	
	

	@BeforeClass//(alwaysRun=true)
	public void beforeClass() {
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\resources\\newChrome\\chromedriver.exe");
		driver = WebDriverUtil.getDriver(browser); //new ChromeDriver();
		driver.get(url); //"http://whiteboxqa.com/");
	}
	
	@AfterMethod//(alwaysRun=true)
	public void afterMethod(ITestResult rs){
		log.info("rs test case name after every method:"+ rs.getName());		
		if(ITestResult.FAILURE==rs.getStatus()){
			ScreenShotUtil.takeScreenShot(rs.getName(), driver);
		}
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}

/*
 * 
 * mocking the dependencies  advantage time, network issues, paid service --  junit mockito api
 * https://examples.javacodegeeks.com/core-java/mockito/junit-mockito-example/
 * 
 * stubs
 *  It can be created quickly and is most commonly used by developers to mimick behaviour of objects and components not available in their development environment.
 * 
 * 
 * virtual assests
 * The application of virtual assets in test environments is commonly called service virtualization.
 * 
 * 
 */

















