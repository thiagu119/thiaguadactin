package org.pojo;

import java.util.List;

import org.libglobal.AdactinBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClassforSelectHotel extends AdactinBaseClass {
	
	
	
	public PojoClassforSelectHotel()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private List<WebElement> radiobutton;

	public List<WebElement> getRadiobutton() {
		return radiobutton;
	}
	
	@FindBy(id="continue")
	private List<WebElement> continuebutton;

	public List<WebElement> getContinuebutton() {
		return continuebutton;
	}

	

}
