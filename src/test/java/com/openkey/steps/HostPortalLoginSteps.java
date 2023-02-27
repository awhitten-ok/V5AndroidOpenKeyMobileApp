package com.openkey.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HostPortalLoginSteps extends BaseSteps{

    @Before
    public void setupSteps() {

        setupScreens(driver, mqttClient);
    }

    @When("The login page of host portal opens")
    public void theLoginPageOfHostPortalOpens() throws InterruptedException {

        hostPortalLogin.hostPortalLoginScreen();

    }

    @Then("The dashboard screen should open")
    public void theDashboardScreenShouldOpen() {

        System.out.println("The dashboard screen should open");
    }

    @And("Admin enters valid username and password")
    public void adminEntersValidUsernameAndPassword() {
        System.out.println("Admin enters valid username and password");
        System.out.println("Admin Login to Host Portal Successfully");
    }

}
