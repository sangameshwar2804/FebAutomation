package com.wbl.test;

import com.wbl.base.BasePage;
import com.wbl.base.BaseTest;
import com.wbl.page.SchedulePage;

public class SchedulePageTest extends BaseTest{

	BasePage bp;
	SchedulePage sp;
	
	public SchedulePageTest(){
		super();
		bp = new BasePage(driver);
		sp = bp.ScheduleClick();
	}
	
	
	
}
