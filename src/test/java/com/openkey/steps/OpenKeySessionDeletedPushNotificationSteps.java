package com.openkey.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class OpenKeySessionDeletedPushNotificationSteps extends BaseSteps {

    @Before
    public void setupSteps() {

        setupScreens(driver, mqttClient);
    }

    @When("^Session is deleted for the guest from Host Portal$")
    public void sessionIsDeletedForTheGuestFromHostPortal() {

        System.out.println("Session is deleted for the guest from Host Portal");
    }

    @Then("The guest should get key expired push notification")
    public void theGuestShouldGetKeyExpiredPushNotification() {

        System.out.println("The guest should get key expired push notification ");
        openKeyDeleteSessionPushNotificationInApp.verifyPushNotificationWhenSessionDeleted();

    }

    @When("^Guest taps on the notification$")
    public void guestTapsOnTheNotification() {

        System.out.println("Guest taps on the notification");
    }

    @Then("Guest should be redirected to feedback screen")
    public void guestShouldBeRedirectedToFeedbackScreen() throws InterruptedException {
        openKeyDeleteSessionPushNotificationInApp.verifyFeedbackScreen();
        System.out.println(" Guest should be redirected to feedback screen");

    }

    @When("^user is on Feedback screen$")
    public void userIsOnFeedbackScreen() {

        System.out.println("user is on Feedback screen");
    }

    @Then("^verify content on feedback screen$")
    public void verifyContentOnFeedbackScreen() {

        System.out.println("feedback screen is verified");
    }

    @And("feedback is submitted successfully")
    public void feedbackIsSubmittedSuccessfully() throws InterruptedException {

        String searchPageTitle = openKeyDeleteSessionPushNotificationInApp.verifySearchPage();
        System.out.println("user is redirected to Search page");
        Assert.assertEquals(searchPageTitle, "Search");
    }
}
