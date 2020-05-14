package com.si.pages.menus;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;

public class SideMenu {

  private final SelenideElement hotCoffees = $(byXpath("//a[contains(text(),'Hot Coffees')]"));
  private final SelenideElement hotTeas = $(byXpath("//a[contains(text(),'Hot Teas')]"));
  private final SelenideElement hotDrinks = $(byXpath("//a[contains(text(),'Hot Drinks')]"));
  private final SelenideElement frappuccinoBlendedBeverages = $(byXpath("//a[contains(text(),'Frappuccino® Blended Beverages')]"));
  private final SelenideElement coldCoffees = $(byXpath("//a[contains(text(),'Cold Coffees')]"));
  private final SelenideElement icedTeas = $(byXpath("//a[contains(text(),'Iced Teas')]"));
  private final SelenideElement coldDrinks = $(byXpath("//a[contains(text(),'Cold Drinks')]"));

}
