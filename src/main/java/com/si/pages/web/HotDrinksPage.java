package com.si.pages.web;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;

public class HotDrinksPage {

  private final SelenideElement pageTitle = $(byXpath("//h1[contains(text(),'Hot Drinks')]"));
  //Hot chocolates
  private final SelenideElement hotChocolateItem = $(byXpath("//a[@data-e2e='Hot Chocolate']"));

  public void selectDrink() {
    hotChocolateItem.click();
  }



}
