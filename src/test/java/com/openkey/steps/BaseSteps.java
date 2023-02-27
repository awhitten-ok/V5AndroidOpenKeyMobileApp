package com.openkey.steps;

import com.openkey.reporting.AllureReportingManager;
import com.openkey.screens.*;
import com.openkey.server.objects.MqttClientClass;
import com.openkey.setups.CapabilitiesManager;
import io.appium.java_client.android.AndroidDriver;

public class BaseSteps extends CapabilitiesManager {

    protected OpenKeyHomeScreen openKeyHomeScreen;
    protected OpenKeyLoginScreen openKeyLoginScreen;
    protected OpenKeyDownloadMobileKeyScreen openKeyDownloadMobileKeyScreen;
    protected OpenKeyDoorLockScreen openDoorLockScreen;
    protected OpenDoorLockInOfflineMode openDoorLockInOfflineMode;
    protected OpenKeyShareKeyScreen openKeyShareKeyScreen;
    protected OpenKeyHamburgerMenuScreen openKeyHamburgerMenuScreen;
    protected OpenKeyMoreMenuScreen openKeyMoreMenuScreen;
    protected OpenKeyWelcomeMessageScreen openKeyWelcomeMessageScreen;
    protected HostPortalLoginScreen hostPortalLogin;
    protected HostPortalDashboardScreen hostPortalDashboardScreen;
    protected HostPortalCreateSessionScreen hostPortalCreateSessionScreen;
    protected HostPortalDeleteSessionScreen hostPortalDeleteSessionScreen;
    protected OpenKeyDeleteSessionPushNotificationInApp openKeyDeleteSessionPushNotificationInApp;
    protected MqttClientClass mqttClient;

    public void setupScreens(AndroidDriver driver, MqttClientClass mqttClient) {

        openKeyHomeScreen = new OpenKeyHomeScreen(driver, mqttClient);
        openKeyLoginScreen = new OpenKeyLoginScreen(driver, mqttClient);
        openKeyDownloadMobileKeyScreen = new OpenKeyDownloadMobileKeyScreen(driver, mqttClient);
        openDoorLockScreen = new OpenKeyDoorLockScreen(driver, mqttClient);
        openDoorLockInOfflineMode = new OpenDoorLockInOfflineMode(driver, mqttClient);
        openKeyShareKeyScreen = new OpenKeyShareKeyScreen(driver, mqttClient);
        openKeyHamburgerMenuScreen = new OpenKeyHamburgerMenuScreen(driver, mqttClient);
        openKeyMoreMenuScreen = new OpenKeyMoreMenuScreen(driver, mqttClient);
        openKeyWelcomeMessageScreen = new OpenKeyWelcomeMessageScreen(driver, mqttClient);
        hostPortalLogin = new HostPortalLoginScreen(driver);
        hostPortalDashboardScreen = new HostPortalDashboardScreen(driver);
        hostPortalCreateSessionScreen = new HostPortalCreateSessionScreen(driver);
        hostPortalDeleteSessionScreen = new HostPortalDeleteSessionScreen(driver);
        openKeyDeleteSessionPushNotificationInApp = new OpenKeyDeleteSessionPushNotificationInApp(driver);

    }

}


