package com.automation.utils;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config.properties"})
public interface Configuration extends Config {
	
    @Key("appium.url")
    String appiumUrl();

    @Key("device.name")
    String deviceName();

    @Key("app.package")
    String appPackage();

    @Key("app.activity")
    String appActivity();

    @Key("timeout.explicit")
    @DefaultValue("10")
    int explicitTimeout();
}