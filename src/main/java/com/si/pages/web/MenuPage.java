package com.si.pages.web;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;

public class MenuPage {

  //Drinks
  private final SelenideElement hotCoffees = $(byXpath("//div[@data-e2e='Hot Drinks']"));

  public void chooseDrinkType() {
    hotCoffees.click();
  }

}
