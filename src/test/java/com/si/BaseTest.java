package com.si;

import com.codeborne.selenide.Selenide;
import framework.config.BrowserConfig;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseTest {

  @Before
  public static void setUp() {

    new BrowserConfig().runConfig();
  }

  @After
  public static void tearDown() {
    Selenide.clearBrowserCookies();
    Selenide.closeWindow();
  }
}
