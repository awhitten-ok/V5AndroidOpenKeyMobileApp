package com.openkey.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class OpenKeyShareKeySteps extends BaseSteps {

    String name;
    String mobile;

    @Before
    public void setupSteps() {

        setupScreens(driver, mqttClient);
    }

    @When("Guest selects Share Key on Active Key Screen")
    public void guestSelectsShareKeyOnActiveKeyScreen() throws InterruptedException {
        openKeyShareKeyScreen.clickOnShareKeyBottomNavigation();
        allureReportingManager.stepsScreenshots();
    }

    @Then("Share Key screen is displayed")
    public void shareKeyScreenIsDisplayed() {
        System.out.println("Share Key screen is displayed title " + openKeyShareKeyScreen.verifyShareKeyScreenTitle());
        allureReportingManager.stepsScreenshots();
    }

    @And("Verify content on the Share Key Screen")
    public void verifyContentOnTheShareKeyScreen() {
       /* Assert.assertTrue(openKeyShareKeyScreen.isBackIconDisplayed());
        Assert.assertEquals(openKeyShareKeyScreen.verifyShareKeyScreenTitle(), "Share Key Menu");
        Assert.assertTrue(openKeyShareKeyScreen.isShareKeyBtnDisplayed());
        System.out.print("Share Key screen verified ");*/
        allureReportingManager.stepsScreenshots();
    }

    @When("Main Guest enters {string} {string} and {string} and taps on Share key button")
    public void mainGuestEntersNameCtrycodeAndMobilenumberAndTapsOnShareKeyButton(String name, String country, String mobile) throws InterruptedException {
        this.name = name;
        this.mobile = mobile;
        openKeyShareKeyScreen.clickOnShareKey(name, country, mobile);
        allureReportingManager.stepsScreenshots();
    }

    @Then("Success pop up should be displayed")
    public void successPopUpShouldBeDisplayed() {
        allureReportingManager.stepsScreenshots();
        String popUpTitle = openKeyShareKeyScreen.verifyPopup();
        if (popUpTitle.equals("Success")) Assert.assertEquals(popUpTitle, "Success");
        else if (popUpTitle.equals("ERROR")) {
            Assert.assertEquals(popUpTitle, "ERROR");
            allureReportingManager.stepsScreenshots();
        }
    }

    @When("Guest selects OK from Success pop up")
    public void guestSelectsOKFromSuccessPopUp() {

        openKeyShareKeyScreen.clickOnOKonSuccessPopup();
        allureReportingManager.stepsScreenshots();
    }

    @Then("This guest should be added to the list")
    public void thisGuestShouldBeAddedToTheList() {
        Assert.assertTrue(openKeyShareKeyScreen.isAddedGuestNameDisplayed());
        Assert.assertTrue(openKeyShareKeyScreen.isAddedGuestMobileNumberDisplayed());
        Assert.assertTrue(openKeyShareKeyScreen.isRemoveIconDisplayed());
        allureReportingManager.stepsScreenshots();
    }

    @And("The additional guest detail name and mobile number should display on share key screen")
    public void theAdditionalGuestDetailNameAndMobileNumberShouldDisplayOnShareKeyScreen() {
        /*if (openKeyShareKeyScreen.isAddedGuestNameDisplayed() && openKeyShareKeyScreen.isAddedGuestMobileNumberDisplayed()) {
           // System.out.println("Key is shared with an additional guest");
            Assert.assertTrue(openKeyShareKeyScreen.isAddedGuestNameDisplayed());
            Assert.assertTrue(openKeyShareKeyScreen.isAddedGuestMobileNumberDisplayed());*/
        allureReportingManager.stepsScreenshots();
    }

    @When("The mobile number already added")
    public void theMobileNumberAlreadyAdded() {

        allureReportingManager.stepsScreenshots();
    }

    @Then("A popup saying \"Guest has already CheckedIn\" should be displayed")
    public void aPopupSayingShouldBeDisplayed() {

        allureReportingManager.stepsScreenshots();
    }

    @When("Guest selects x to remove the added additional guest")
    public void guestSelectsXToRemoveTheAddedAdditionalGuest() {
        openKeyShareKeyScreen.clickOnX();
        System.out.println("Guest selects x to remove the added additional guest");
        allureReportingManager.stepsScreenshots();
    }

    @Then("An Alert pup up should be displayed")
    public void anAlertPupUpShouldBeDisplayed() {
        Assert.assertTrue(openKeyShareKeyScreen.isCheckoutAlertPopupDisplayed());
        allureReportingManager.stepsScreenshots();
    }

    @When("Guest selects Cancel")
    public void guestSelectsCancel() {
        openKeyShareKeyScreen.clickOnCancel();
        System.out.println("Guest selected Cancel so the option will not be removed");
        allureReportingManager.stepsScreenshots();
    }

    @Then("The additional guest detail item should not be removed from the list")
    public void theAdditionalGuestDetailItemShouldNotBeRemovedFromTheList() {
        System.out.println("The additional guest detail item not removed from the list");
        allureReportingManager.stepsScreenshots();
    }

    @When("Guest selects CONFIRM")
    public void guestSelectsCONFIRM() {
        // openKeyShareKeyScreen.clickOnX();
        // openKeyShareKeyScreen.clickOnConfirm();
        System.out.println("Guest selected Confirm so the option is removed");
        allureReportingManager.stepsScreenshots();
    }

    @Then("The additional guest detail item should be removed from the list")
    public void theAdditionalGuestDetailItemShouldBeRemovedFromTheList() {
        openKeyShareKeyScreen.removeGuest();
        //System.out.println("The additional guest detail item is removed from the list");
        allureReportingManager.stepsScreenshots();
    }

    @When("Maximum additional guests are added")
    public void maximumAdditionalGuestsAreAdded() {

        allureReportingManager.stepsScreenshots();
    }

    @Then("Remove all the additional guests")
    public void removeAllTheAdditionalGuests() {

        openKeyShareKeyScreen.removeAllAddedGuests();
        allureReportingManager.stepsScreenshots();
    }

    @And("Navigates back to the main guest to My Key Screen")
    public void navigateTheMainGuestToMyKeyScreen() {
        openKeyShareKeyScreen.navigateToMyKeyScreen();
        System.out.println("Guest navigated back to My Key Screen");
        allureReportingManager.stepsScreenshots();
    }
}