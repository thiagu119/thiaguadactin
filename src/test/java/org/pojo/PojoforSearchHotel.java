package org.pojo;

import java.util.List;

import org.libglobal.AdactinBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoforSearchHotel extends AdactinBaseClass {
	
	public PojoforSearchHotel()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private List<WebElement> location;
	
	@FindBy(id="hotels")
	private List<WebElement> hotels;
	
	@FindBy(id="room_type")
	private List<WebElement> roomtype;
	
	@FindBy(id="room_nos")
	private List<WebElement> roomnos;
	
	@FindBy(id="adult_room")
	private List<WebElement> adultroom;
	
	@FindBy(id="child_room")
	private List<WebElement> child_room;
	
	@FindBy(id="Submit")
	private List<WebElement> Submit;

	public List<WebElement> getLocation() {
		return location;
	}

	public List<WebElement> getHotels() {
		return hotels;
	}

	public List<WebElement> getRoomtype() {
		return roomtype;
	}

	public List<WebElement> getRoomnos() {
		return roomnos;
	}

	public List<WebElement> getAdultroom() {
		return adultroom;
	}

	public List<WebElement> getChild_room() {
		return child_room;
	}

	public List<WebElement> getSubmit() {
		return Submit;
	}
	
}
