package com.demoacti.tests;

import org.testng.annotations.Test;

public class TaskListPageTest extends BaseLoginTest{
	@Test
 public void testloginfunction() throws InterruptedException {
		loginpage.enterusername("admin");
		loginpage.enterpassword("manager");
		loginpage.clicklogin();
		entertimeStack.testtaskbutton();
		tasklistpage.testButtonadd();
		tasklistpage.testCreatenew();
		tasklistpage.testcustomername("test6");
		tasklistpage.testcustdescription("test6");
		
		
		tasklistpage.testcreatebutton();
		tasklistpage.testtoastbutton();
	Thread.sleep(2000);
	String title = tasklistpage.testpagetitle();
	System.out.println(title);
	tasklistpage.checkcustomername("test6");
	tasklistpage.checkations();
	tasklistpage.checkactionradio();
	tasklistpage.checkdelete();
	tasklistpage.checkdeleteperminant();
	Thread.sleep(2000);
	//tasklistpage.logoutbutton();
 }
}