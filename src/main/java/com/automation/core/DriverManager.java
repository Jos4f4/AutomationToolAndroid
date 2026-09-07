package com.automation.core;

import io.appium.java_client.android.AndroidDriver;

public final class DriverManager {
	
    private static final ThreadLocal<AndroidDriver> DRIVER = new ThreadLocal<>();

    private DriverManager() {}

    public static AndroidDriver getDriver() {
        return DRIVER.get();
    }

    public static void setDriver(AndroidDriver driver) {
        DRIVER.set(driver);
    }

    public static void quitDriver() {
        if (DRIVER.get() != null) {
            DRIVER.get().quit();
            DRIVER.remove();
        }
    }
}