package com.openkey.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/** OpenKey Guest Mobile Android App Hamburger Menu */
public class OpenKeyHamburgerMenuSteps extends BaseSteps {

    @Before
    public void setupSteps() {

        setupScreens(driver, mqttClient);
    }

    @Given("^User is on Dashboard screen$")

    public void user_is_on_dashboard_screen() {

        System.out.println("User is on Dashboard Screen");
        allureReportingManager.stepsScreenshots();
    }

    @When("^Guest clicks on Hamburger menu$")

    public void guest_clicks_on_hamburger_menu() throws InterruptedException {

        openKeyHamburgerMenuScreen.verifyHamburgerMenu();

    }

    @Then("^All menu items should appear enabled$")

    public void all_menu_items_should_appear_enabled() {

        openKeyHamburgerMenuScreen.verifyHamburgerMenuItems();

    }

    @When("^Guest clicks on 'SEARCH HOTELS' menu item$")

    public void guest_clicks_on_search_hotels_menu_item() throws InterruptedException {

        openKeyHamburgerMenuScreen.verifySearchHotelsMenuFeatures();

    }

    @Then("^'SEARCH HOTELS' screen features should be functional$")

    public void search_hotels_screen_features_should_be_functional() {

        allureReportingManager.stepsScreenshots();

    }

    @When("^Guest clicks on 'SETTINGS' menu item$")

    public void guest_clicks_on_settings_menu_item() {

        openKeyHamburgerMenuScreen.verifySettingsMenuFeatures();

    }

    @Then("^'SETTINGS' screen features should be functional$")

    public void settings_screen_features_should_be_functional() {

        allureReportingManager.stepsScreenshots();
    }


    @When("^Guest clicks on 'LEARN MORE' menu item$")

    public void guest_clicks_on_learn_more_menu_item() {

        openKeyHamburgerMenuScreen.verifyLearnMoreMenuFeatures();

    }


    @Then("^'LEARN MORE' screen features should be functional$")

    public void learn_more_screen_features_should_be_functional() {

        allureReportingManager.stepsScreenshots();

    }

    @When("^Guest clicks on 'CALL HOTEL' menu item$")

    public void guest_clicks_on_call_hotel_menu_item() {

        openKeyHamburgerMenuScreen.verifyCallHotelMenuFeatures();

    }

    @Then("^'CALL HOTEL' screen features should be functional$")

    public void call_hotel_screen_features_should_be_functional() {

        allureReportingManager.stepsScreenshots();
    }

    @When("^Guest clicks on 'PRIVACY POLICY' link$")

    public void guest_clicks_on_privacy_policy_link() {

        openKeyHamburgerMenuScreen.verifyPrivPolicyFeatures();

    }

    @Then("^'PRIVACY POLICY' link should be functional$")

    public void privacy_policy_link_should_be_functional() {

        allureReportingManager.stepsScreenshots();

    }

    @When("^Guest clicks on 'TERMS OF USE' link$")

    public void guest_clicks_on_terms_of_use_link() {

        openKeyHamburgerMenuScreen.verifyTOSFeatures();

    }

    @Then("^'TERMS OF USE' link should be functional$")

    public void terms_of_use_link_should_be_functional() {

        allureReportingManager.stepsScreenshots();

    }

}




