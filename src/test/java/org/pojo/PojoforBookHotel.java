package org.pojo;

import java.util.List;

import org.libglobal.AdactinBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoforBookHotel extends AdactinBaseClass {
	
	public PojoforBookHotel()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private List<WebElement> firstname;
	
	@FindBy(id="last_name")
	private List<WebElement> lastname;
	
	@FindBy(id="address")
	private List<WebElement> address;
	
	@FindBy(id="cc_num")
	private List<WebElement> ccnum;
	
	@FindBy(id="cc_type")
	private List<WebElement> cctype;
	
	@FindBy(id="cc_exp_month")
	private List<WebElement> ccexpmonth;
	
	@FindBy(id="cc_exp_year")
	private List<WebElement> cc_exp_year;
	
	@FindBy(id="cc_cvv")
	private List<WebElement> cvv;
	
	@FindBy(id="book_now")
	private List<WebElement> book_now;

	public List<WebElement> getFirstname() {
		return firstname;
	}

	public List<WebElement> getLastname() {
		return lastname;
	}

	public List<WebElement> getAddress() {
		return address;
	}

	public List<WebElement> getCcnum() {
		return ccnum;
	}

	public List<WebElement> getCctype() {
		return cctype;
	}

	public List<WebElement> getCcexpmonth() {
		return ccexpmonth;
	}

	public List<WebElement> getCc_exp_year() {
		return cc_exp_year;
	}

	public List<WebElement> getCvv() {
		return cvv;
	}

	public List<WebElement> getBook_now() {
		return book_now;
	}
	
	
	

}
