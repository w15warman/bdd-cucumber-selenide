package com.si.pages.web;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class HomePage extends BasePage{

  private final SelenideElement menuBtn = $(byXpath("//a[contains(text(),'Menu')]"));


  public HomePage openPage() {
    Selenide.open(getBaseUrl());
    return this;
  }

  public void openMenu() {
    menuBtn.click();
  }



}
