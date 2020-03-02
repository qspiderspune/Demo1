package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath="//div[.='Add New']")
	private WebElement AddNewBtn;
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement NewCustomerOption;
	@FindBy(xpath="//input[contains(@class,'inputNameField')]")
	private WebElement EnterCustomerTbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement DescriptionTbx;
	@FindBy(xpath="(//div[@class='dropdownButton'])[15]")
	private WebElement DropDownBtn;
	@FindBy(xpath="//div[@class='searchItemList']/div[.='Our company']")
	private WebElement DropDownOption;
	@FindBy(xpath="(//div[.='  Create Customer'])[2]")
	private WebElement CreateCustomerBtn;
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement CustomerCreated;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCreateCustomerBtn() {
		return CreateCustomerBtn;
	}
	public WebElement getAddNewBtn() {
		return AddNewBtn;
	}
	public WebElement getNewCustomerOption() {
		return NewCustomerOption;
	}
	public WebElement getEnterCustomerTbx() {
		return EnterCustomerTbx;
	}
	public WebElement getDescriptionTbx() {
		return DescriptionTbx;
	}
	public WebElement getDropDownBtn() {
		return DropDownBtn;
	}
	public WebElement getDropDownOption() {
		return DropDownOption;
	}
	public WebElement getCustomerCreated() {
		return CustomerCreated;
	}
}
