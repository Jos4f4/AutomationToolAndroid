package com.automation.core;

import com.automation.utils.Configuration;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.aeonbits.owner.ConfigFactory;

import java.net.URI;
import java.time.Duration;

public final class DriverFactory {
	
    private static final Configuration CONFIG = ConfigFactory.create(Configuration.class);

    public static AndroidDriver createDriver() {
    	
        try {
            UiAutomator2Options options = new UiAutomator2Options()
                    .setPlatformName("Android")
                    .setAutomationName("UiAutomator2")
                    .setDeviceName(CONFIG.deviceName())
                    .setAppPackage(CONFIG.appPackage())
                    .setAppActivity(CONFIG.appActivity())
                    .setNoReset(true)
                    .setAutoGrantPermissions(true);

            AndroidDriver driver = new AndroidDriver(
                    URI.create(CONFIG.appiumUrl()).toURL(), options
            );
            
            driver.manage().timeouts().implicitlyWait(Duration.ZERO); 
            
            return driver;
            
        } catch (Exception e) {
            throw new RuntimeException("Falha ao inicializar UiAutomator2: " + e.getMessage(), e);
        }
    }
}