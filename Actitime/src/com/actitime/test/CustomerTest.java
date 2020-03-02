package com.actitime.test;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;

public class CustomerTest extends BaseClass {
@Test
public void testCreateCustomer() throws Exception {
String ExpectedCustomer = f.getExcelData("CreateCustomer", 1, 2);
String description = f.getExcelData("CreateCustomer", 1, 3);
WebDriverWait wait=new WebDriverWait(driver, 10);	
EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	e.getTaskTab().click();
	TaskListPage t=new TaskListPage(driver);
	wait.until(ExpectedConditions.visibilityOf(t.getAddNewBtn()));
	t.getAddNewBtn().click();
	t.getNewCustomerOption().click();
	t.getEnterCustomerTbx().sendKeys(ExpectedCustomer);
	t.getDescriptionTbx().sendKeys(description);
	t.getDropDownBtn().click();
	t.getDropDownOption().click();
	t.getCreateCustomerBtn().click();
	Thread.sleep(4000);
	String ActualCustomer = t.getCustomerCreated().getText();
	Assert.assertEquals(ActualCustomer, ExpectedCustomer);
	Reporter.log("Customer created successfully",true);
	
}
}
