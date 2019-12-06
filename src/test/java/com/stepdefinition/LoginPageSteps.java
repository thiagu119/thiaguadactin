package com.stepdefinition;

import org.libglobal.AdactinBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pojo.LocatorClass;
import org.pojo.PageObjectManager;
import org.pojo.PojoClassforSelectHotel;
import org.pojo.PojoforBookHotel;
import org.pojo.PojoforBookingConfirmation;
import org.pojo.PojoforSearchHotel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends AdactinBaseClass {

	WebDriver driver;
	static PageObjectManager page;
	// User is now on Home Page

	@Given("User is on Adaction Home Page")
	public void user_is_on_Adaction_Home_Page() {

		launchBrowser();
		loadUrl("http://www.adactin.com/HotelApp/ ");

	}

	@When("User Enters {string} and {string}")
	public void user_Enters_and(String username, String password) {
		page=new PageObjectManager();
		type(page.getLocatorClass().getUser().get(0), username);
		type(page.getLocatorClass().getPassword().get(0), password);

	}

	@Then("Click the Login button")
	public void click_the_Login_button() {

		btnClick(page.getLocatorClass().getsubmit().get(0));

	}

	// User is now on Search Hotel Page

	@Given("User is on Adaction Search Hotel Page")
	public void user_is_on_Adaction_Search_Hotel_Page() {

	}

	@When("User Enters {string} and {string} and {string} and {string}  and {string} and {string}")
	public void user_Enters_and_and_and_and_and(String location, String hotel, String roomtype, String roomnos,
			String AdultsperRoom, String ChildrenperRoom) {

		dropDown(page.getPojoforSearchHotel().getLocation().get(0), location);
		dropDown(page.getPojoforSearchHotel().getHotels().get(0), hotel);
		dropDown(page.getPojoforSearchHotel().getRoomtype().get(0), roomtype);
		dropDown(page.getPojoforSearchHotel().getRoomnos().get(0), roomnos);
		dropDown(page.getPojoforSearchHotel().getAdultroom().get(0), AdultsperRoom);
		dropDown(page.getPojoforSearchHotel().getChild_room().get(0), ChildrenperRoom);

	}

	@Then("Click the Submit button")
	public void click_the_Submit_button() {

		btnClick(page.getPojoforSearchHotel().getSubmit().get(0));
	}

	// User is now on Select Hotel Page

	@Given("User is on Adaction Select Hotel Page")
	public void user_is_on_Adaction_Select_Hotel_Page() {

	}

	@When("User Click the radio button")
	public void user_Click_the_radio_button() {
		btnClick(page.getPojoClassforSelectHotel().getRadiobutton().get(0));
	}

	@Then("Click the Continue button")
	public void click_the_Continue_button() {
		btnClick(page.getPojoClassforSelectHotel().getContinuebutton().get(0));

	}

	// User is now on Book Hotel Page

	@Given("User is on Adaction Book Hotel Page")
	public void user_is_on_Adaction_Book_Hotel_Page() {

	}

	@When("User Enters {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_Enters_and_and_and_and_and_and_and(String firstname, String lastname, String address, String ccnum,
			String cctype, String ccexpmonth, String cc_exp_year, String cvv) {

		type(page.getPojoforBookHotel().getFirstname().get(0), firstname);
		type(page.getPojoforBookHotel().getLastname().get(0), lastname);
		type(page.getPojoforBookHotel().getAddress().get(0), address);
		type(page.getPojoforBookHotel().getCcnum().get(0), ccnum);
		dropDown(page.getPojoforBookHotel().getCctype().get(0), cctype);
		dropDown(page.getPojoforBookHotel().getCcexpmonth().get(0), ccexpmonth);
		dropDown(page.getPojoforBookHotel().getCc_exp_year().get(0), cc_exp_year);
		type(page.getPojoforBookHotel().getCvv().get(0), cvv);
	}

	@Then("Click the Submit button1")
	public void click_the_Submit_button_Book() {

		btnClick(page.getPojoforBookHotel().getBook_now().get(0));
	}

	// User is now on BookingConfirmation Hotel Page

	@Given("User is on Adaction confirmation Page")
	public void user_is_on_Adaction_confirmation_Page() {

	}

	@When("User gets his order no")
	public void user_gets_his_order_no() throws InterruptedException {

		Thread.sleep(5000);

		WebElement orderno = page.getPojoforBookingConfirmation().getOrderno().get(0);

		String val = orderno.getAttribute("value");
		System.out.println(val);

	}

	@Then("Click the finalconfirmation button")
	public void click_the_finalconfirmation_button() {

	}
}
