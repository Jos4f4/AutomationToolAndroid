package com.automation.tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.automation.bases.BaseTest;
import com.automation.pages.SettingsPage;

public class SettingsTest extends BaseTest {

    @Test
    @DisplayName(
    	"Validate the opening of the settings screen and the presence of the search bar"
    )
    public void testSettingsLaunch() {
        SettingsPage settingsPage = new SettingsPage();

        assertThat(settingsPage.isSearchBarVisible())
        	.as("The settings search bar must be visible")
        	.isTrue();
    }
}