package com.automation.bases;

import com.automation.core.DriverFactory;
import com.automation.core.DriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public abstract class BaseTest {

    @BeforeEach
    public void setUp() {
        DriverManager.setDriver(DriverFactory.createDriver());
    }

    @AfterEach
    public void tearDown() {
        DriverManager.quitDriver();
    }
}