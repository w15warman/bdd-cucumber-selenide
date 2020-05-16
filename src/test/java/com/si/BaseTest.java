package com.si;

import com.codeborne.selenide.Selenide;
import framework.config.BrowserConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseTest {

  @Before
  public static void setUp() {

    new BrowserConfig().runConfig();
  }

  @After
  public static void tearDown() {
    Selenide.clearBrowserCookies();
    Selenide.closeWebDriver();
  }
}
