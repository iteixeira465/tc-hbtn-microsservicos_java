package com.example.demo2.tapestry.integration.pages;

import org.apache.tapestry5.test.SeleniumTestCase;
import org.testng.annotations.Test;

public class NavigationTest extends SeleniumTestCase {

    @Test
    void navigationIndex() {
        navigation("Index");
    }

    @Test
    void navigationAbout() {
        navigation("About");
    }

    @Test
    void navigationLogin() {
        navigation("Login");
    }

    @Test
    void navigationError404() {
        navigation("Error404");
    }

    private void navigation(String page) {
        // given
        open(String.format("/%s", page.toLowerCase()));
        waitForPageToLoad();

        // then
        assertTrue(getTitle().startsWith(page));
    }
}
