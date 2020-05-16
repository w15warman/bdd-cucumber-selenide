package com.si.pages;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;

public class StoreMapPage {

  private final SelenideElement searchField = $(byXpath("//input[@type='search']"));

  public void findStore() {
    searchField.setValue("New York");
  }

}
