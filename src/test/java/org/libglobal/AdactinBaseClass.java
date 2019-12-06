package org.libglobal;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinBaseClass {

	public static WebDriver driver;
	
	

	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cex\\eclipse-workspace\\MavenTestNGSample\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public static void loadUrl(String url) {
		driver.get(url);

	}

	public static void type(WebElement e, String value) {
		e.sendKeys(value);

	}

	public static void btnClick(WebElement e) {
		e.click();
	}

	public static void dropDown(WebElement sel, String selectoption) {
		Select s = new Select(sel);
		s.selectByVisibleText(selectoption);
	}

}
