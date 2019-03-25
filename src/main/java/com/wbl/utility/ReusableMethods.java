package com.wbl.utility;

import org.openqa.selenium.WebElement;

public class ReusableMethods {

	
	 public static void enterText(WebElement obj, String textval, String objName)
	 {
		 if (obj.isDisplayed()){
			 obj.sendKeys(textval);
			 System.out.println("Pass:" +textval +"is entered in"+objName );
		 }
	 }
}
