package com.openkey.steps;

import com.openkey.setups.CapabilitiesManager;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

/** OpenKey Guest Mobile Android App Opening Door Lock Screen */
public class OpenDoorLockInOfflineModeSteps extends BaseSteps {

    @Before
    public void setupSteps() {

        setupScreens(driver, mqttClient);

    }

    @When("^Guest device does not connected with Networks$")
    public void guest_device_does_not_connected_with_etworks() {

        openDoorLockInOfflineMode.turnOffNetowrk();

    }

    @And("^Bluetooth is on$")
    public void bluetooth_is_on() {

        openDoorLockInOfflineMode.openDoorLockInOfflineModeBluetoothAlert();

    }

    @And("^Clicks on Key Icon on My Key Screen$")
    public void clicks_on_key_icon_on_my_key_screen() throws InterruptedException {

        openDoorLockInOfflineMode.openDoorLockInOfflineMode();

    }

    @And("^Scanning locks in range$")
    public void scanning_locks_in_range() {

        openDoorLockInOfflineMode.scanningLockInRange();

    }

    @Then("^Door Opened and Access Granted check mark should be displayed$")
    public void door_opened_in_offline_mode() {

        openDoorLockInOfflineMode.doorOpenedInOfflineMode();

    }

    @When("^I clicks the main key for given number of times in Offline Mode$")
    public void door_opened_in_offline_mode_multiple_times() throws InterruptedException {

        openDoorLockInOfflineMode.openMainDoorLockMultipleTimes(CapabilitiesManager.lockCounter);

    }

    @Then("^It should open the lock successfully each time in Offline Mode$")
    public void it_should_open_the_lock_successfully_each_time_in_offline_mode() {

        allureReportingManager.stepsScreenshots();

    }

    @And("^Guest navigates back to the My Key Screen$")
    public void guest_navigates_back_to_the_my_key_screen() {

        openDoorLockInOfflineMode.navigateBackToMyKeyScreen();

    }

    @And("^Verify Push Notification You can also share your key with other guests should not be triggered$")
    public void verify_push_notification_you_can_also_share_your_key_with_other_guests_should_not_be_triggered() {

        openDoorLockInOfflineMode.pushNotificationsOfShareKeyWithOtherGuestsNotTriggered();
        allureReportingManager.stepsScreenshots();

    }
}
