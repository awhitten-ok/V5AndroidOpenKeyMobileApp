package com.openkey.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HostPortalDeleteSessionSteps extends BaseSteps{

    @Before
    public void setupSteps() {

        setupScreens(driver, mqttClient);
    }

    @When("Admin selects delete image icon")
    public void adminSelectsDeleteImageIcon() throws InterruptedException {
        hostPortalDeleteSessionScreen.deleteSession();
        System.out.println("Admin selects delete image icon");
    }

    @Then("Session should be expired for this particular guest")
    public void sessionShouldBeExpiredForThisParticularGuest() {

        System.out.println("Guest Session should be expired");
    }
}
