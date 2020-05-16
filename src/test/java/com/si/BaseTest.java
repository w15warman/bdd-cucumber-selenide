package com.si;

import framework.config.BrowserConfig;
import framework.config.SelenideConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseTest {

  @Before
  public static void setUp() {
    new BrowserConfig().runConfig();
  }

  @After
  public static void tearDown() {
    new SelenideConfig().runConfig();
  }
}
