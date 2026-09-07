package com.automation.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class SettingsPage extends BasePage {

    private final By networkItem = AppiumBy.xpath("//*[@text='Rede e internet' or @text='Network & internet']");
    private final By searchBar = AppiumBy.id("com.android.settings:id/search_action_bar");

    public boolean isSearchBarVisible() {
        return waitForElement(searchBar).isDisplayed();
    }

    public void clickNetworkAndInternet() {
        click(networkItem);
    }
}