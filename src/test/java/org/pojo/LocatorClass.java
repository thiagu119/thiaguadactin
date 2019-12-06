package org.pojo;

import java.util.List;

import org.libglobal.AdactinBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocatorClass extends AdactinBaseClass {

	public LocatorClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private List<WebElement> user;

	@FindBy(id = "password")
	private List<WebElement> password;

	@FindBy(id = "login")
	private List<WebElement> submit;

	public List<WebElement> getUser() {
		return user;
	}

	public List<WebElement> getPassword() {
		return password;
	}

	public List<WebElement> getsubmit() {
		return submit;
	}

}
