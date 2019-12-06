package org.pojo;

import java.util.List;

import org.libglobal.AdactinBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoforBookingConfirmation extends AdactinBaseClass {
	
	public PojoforBookingConfirmation()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private List<WebElement> orderno;

	public List<WebElement> getOrderno() {
		return orderno;
	}

	

}
