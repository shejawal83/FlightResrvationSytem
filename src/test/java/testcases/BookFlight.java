package testcases;

import org.testng.annotations.Test;
import common.BaseTestClass;
import junit.framework.Assert;
import pages.confirmationPage;
import pages.fillPassengerDetails;
import pages.flighDetailsPage;
import pages.welcomePage;


public class BookFlight extends BaseTestClass  {
	
	
	welcomePage welcome=new welcomePage();	
	flighDetailsPage flightDetails=new flighDetailsPage();
	fillPassengerDetails passengerDetail=new fillPassengerDetails();
	confirmationPage confirmation = new confirmationPage();	
	
	
	@Test	
	public void findFlight(){		
		String departureCity="Boston";
		String destinationCity="New York";
		
		comm.stepInfo("Verify Welcome Page Message." );		
		String wlecomeTitle=welcome.getWelcomeElementTitle().getText();		
		Assert.assertTrue(wlecomeTitle.equals("Welcome to the Simple Travel Agency!"));
	
		comm.stepInfo("Populate departure and destination city." );
		welcome.populateSourceDestinationCity(departureCity,destinationCity);	
		
		welcome.getFindFlighButton().click();	
		
		comm.stepInfo("Verify Filght Details page message" );
		String flightDetailTitle=flightDetails.getFlightDetalPageTitle().getText();		
		Assert.assertTrue(flightDetailTitle.equals("Flights from " + departureCity + " to " + destinationCity + ":" ));
		
		
	}
	
	@Test	(dependsOnMethods="findFlight")
	public void bookFlight(){		

		comm.stepInfo("Book first flight" );
		flightDetails.getFirstFlightChooseButton("1").click();	
		
		comm.stepInfo("Verify meesage on passenger details page" );
		String flightreservedTitle=passengerDetail.getFlightDetalPageTitle().getText();
		Assert.assertTrue(flightreservedTitle.equals("Your flight from TLV to SFO has been reserved."));
		
		
	}
	
	@Test	(dependsOnMethods="bookFlight",priority=1)
	public void confirmFlight(){		
	

		comm.stepInfo("Populate the passenger details." );
		passengerDetail.populatePassengerDetails("Rajesh","Raj Society","ABC peth","Maharshtra","411046");
				
		comm.stepInfo("Populate the Credit Card details.");			
		passengerDetail.populateCreditCardDetails("dinersclub","1234567890","12","2020","Rajesh");
		
		comm.stepInfo("Confirm Flight." );
		passengerDetail.getrememberMeChecktBox().click();
		passengerDetail.getPurchaseFlightButton().click();	
		
		String actualconfirmationMessage=confirmation.getConfirmationSuccessTitle().getText();
		String expectedconfirmationMessage="Thank you for your purchase today!";
		
		comm.stepInfo("Verify Reservation Confirmation message." );		
		Assert.assertEquals("Flight Reservation Confirmation is not successfull", expectedconfirmationMessage, actualconfirmationMessage);
	
		String confirmationID=confirmation.getConfirmationID().getText();		
			
		boolean flighbooked=confirmationID.isEmpty()?false:true;
		
		comm.stepInfo("Verify Confirmation ID created." );			
		if (flighbooked)			
			comm.stepInfo("Flight reservation confirmed sucessfully." );
		else
			Assert.assertTrue("Flight not confirmed sucessfully.",flighbooked);				
	
		
	}

	

}
