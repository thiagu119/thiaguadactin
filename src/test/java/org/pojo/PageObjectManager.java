package org.pojo;

public class PageObjectManager {
	
	 LocatorClass loginPage;
	 PojoClassforSelectHotel selectPage;
	 PojoforSearchHotel searcHotel;
	 PojoforBookHotel bookHotel;
	 PojoforBookingConfirmation homePage;
	 
	 public LocatorClass getLocatorClass() {
		 return (loginPage==null)?loginPage=new LocatorClass():loginPage;

	}
	 
	 public PojoClassforSelectHotel getPojoClassforSelectHotel() {
		 return (selectPage==null)?selectPage=new PojoClassforSelectHotel():selectPage;


		}
	 
	 public PojoforSearchHotel getPojoforSearchHotel() {
		 return (searcHotel==null)?searcHotel=new PojoforSearchHotel():searcHotel;


		}
	 public PojoforBookHotel getPojoforBookHotel() {
		 return (bookHotel==null)?bookHotel=new PojoforBookHotel():bookHotel;


		}
	 public PojoforBookingConfirmation getPojoforBookingConfirmation() {
		 return (homePage==null)?homePage=new PojoforBookingConfirmation():homePage;


		}

}
