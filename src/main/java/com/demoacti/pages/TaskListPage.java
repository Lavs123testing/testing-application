package com.demoacti.pages;

import org.openqa.selenium.WebElement;
/*
 * Name : DriverScripts
 * developed by : Lavanya
 * reviewed by : Michael
 * created : Mar 9
 * Description : This class will take care of the all driver related stuff
 * 
 */
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.demoacti.base1.DriverScripts;

public class TaskListPage extends DriverScripts {
	@FindBy(xpath="//a[@id='logoutLink']") WebElement logoutlink;
	@FindBy(id="username") WebElement textboxusername;
	@FindBy(name ="pwd") WebElement textboxpassword;
	@FindBy(xpath ="//div[text() ='Login ']") WebElement loginbutton;
	
	@FindBy(xpath="//div[@id='container_tasks']") WebElement taskbutton;
	@FindBy(className ="taskSearchField") WebElement searchfield;
	@FindBy(xpath="//div[@class='title ellipsis']") WebElement buttonaddnew;
	@FindBy(xpath="//div[@class='item createNewCustomer']")  WebElement createnew;
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']") WebElement customername;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']") WebElement description;
	@FindBy(xpath="//div[text()='Create Customer']") WebElement customerbutton;
	@FindBy(xpath="//span[@class='innerHtml']") WebElement toastbutton;
	@FindBy(xpath="//input[@placeholder='Start typing name ...']") WebElement textboxstarttyping;
	@FindBy(xpath ="//span[text() ='test5']") WebElement clickthename;
	@FindBy(xpath="(//div[@class='editButton'])[1]") WebElement actionbutton;
	@FindBy(xpath="(//div[@class='action'])[1]") WebElement actionsradiobutton;
	@FindBy(xpath="(//div[@class='deleteButton'] )[1]") WebElement deletebutton;
	@FindBy(xpath="//td[@class='logoCell navCell']") WebElement deletepermanant;

	
	public void checkdeleteperminant() {
		deletepermanant.click();
	}
	
	public void checkdelete() {
		deletebutton.click();
	}
	public void checkactionradio() {
		actionsradiobutton.click();
	}
	
	public void checkations() {
		actionbutton.click();
	}
	
public void checkcustomername(String customername)	{
	textboxstarttyping.sendKeys(customername);
}
public void checkthecustomername() {
	clickthename.click();
}

	
	
public TaskListPage() {
	PageFactory.initElements(driver, this);
}
public void testTaskButton() {
	taskbutton.click();
}
public void testButtonadd() {
	buttonaddnew.click();
}
public void testCreatenew() {
	createnew.click();
}
public void testcustomername(String name) {
	customername.sendKeys(name);
}
public void testcustdescription(String name) {
	description.sendKeys(name);
}

public void testcreatebutton() {
	customerbutton.click();
}
public String testtoastbutton() {
	return toastbutton.getText();
}
public String testpagetitle() {
	return driver.getTitle();
}
public void logoutbutton() {
	logoutlink.click();
}

}