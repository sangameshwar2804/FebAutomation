package com.wbl.test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

import org.testng.annotations.Test;

import com.wbl.base.BasePage;
import com.wbl.base.BaseTest;
import com.wbl.page.HomePage;

public class HomePageTest extends BaseTest{
	
	BasePage bp;
	HomePage hp;
	

	
	@Test(priority=1)
	public void assertSlides(){
		hp = new HomePage(driver);
		int num = hp.numberOfSlides();
		assertTrue(num > 6);
	}

	
	@Test(priority=2)
	public void assertRecText(){
		hp = new HomePage(driver);
	
		String actual = hp.getRecordingsText();
		assertEquals(actual,"Recordings....");
	}
	
	@Test(priority=3)
	public void assertClickRecording(){
		hp = new HomePage(driver);
		hp.getRecordingsText();
		String actual = hp.clickRecording().getTitle();
		assertEquals(actual,"QA/QE/SDET Training.");
	}
	
	
	
	
	
	
}
