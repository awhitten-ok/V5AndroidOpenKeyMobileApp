package com.openkey.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HostPortalCreateSessionSteps extends BaseSteps{

    @Before
    public void setupSteps() {

        setupScreens(driver, mqttClient);
    }

    @When("Admin selects Add Guest option and provides all valid details")
    public void adminSelectsAddGuestOptionAndProvidesAllValidDetails() throws InterruptedException {

        hostPortalCreateSessionScreen.createNewSession();
        System.out.println("Admin selects Add Guest option and provides all valid details");
    }

    @Then("A new session should be created for the guest")
    public void aNewSessionShouldBeCreatedForTheGuest() {
        System.out.println("A new session should be created for the guest");
    }

}
