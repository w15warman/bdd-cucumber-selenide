package com.si.pages.web.drink_details;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

public class HotChocolate {

  @Getter
  private final SelenideElement drinkName = $(byXpath("//h1[contains(text(),'Hot Chocolate')]"));
  private final SelenideElement doneBtn = $(byXpath("//button[@data-e2e='doneFrap']"));
  private final SelenideElement addToOrderBtn = $(
      byXpath("//button[@data-e2e='add-to-order-button']"));
  private final SelenideElement sizeSelect = $("#sizeSelector");
  //Milk editor
  private final SelenideElement milkEditBtn = $(
      byXpath("//span[contains(text(),'Milk Options')]/ancestor::button"));
  private final SelenideElement milkTypeSelect = $("#milk-choices-customization-option");
  private final SelenideElement milkTempSelect = $("#temp-customization-option");
  private final SelenideElement milkFoamSelect = $("#foam-customization-option");
  //Toppings editor
  private final SelenideElement toppingsEditBtn = $(
      byXpath("//span[contains(text(),'Toppings')]/ancestor::button"));
  private final SelenideElement cascaraToppingSelect = $("#cascara-topping-customization-option");
  private final SelenideElement cinnamonSelect = $(
      "#cinnamon-dolce-sprinkles-customization-option");
  private final SelenideElement drizzleSelect = $("#caramel-drizzle-customization-option");
  private final SelenideElement mochaDrizzleSelect = $("#mocha-drizzle-customization-option");
  private final SelenideElement chocolatePowderSelect = $("#chocolate-powder-customization-option");
  private final SelenideElement cinnamonPowderSelect = $("#cinnamon-powder-customization-option");
  private final SelenideElement nutmegPowderSelect = $("#nutmeg-powder-customization-option");
  private final SelenideElement vanillaPowderSelect = $("#vanilla-powder-customization-option");
  private final SelenideElement whippedCreamSelect = $("#whipped-cream-customization-option");
  //Flavors editor
  private final SelenideElement flavorsEditBtn = $(
      byXpath("//span[contains(text(),'Flavors')]/ancestor::button"));
  private final SelenideElement caramelSyrupPicker = $(
      byXpath("//div[contains(text(),'Caramel Syrup')]/following::button[1]"));



  public void selectSize() {
    sizeSelect.selectOptionContainingText("Venti (20 fl oz)");
  }

  public void editMilk() {
    milkEditBtn.scrollIntoView(true).click();
    milkTypeSelect.selectOptionContainingText("Almond");
    milkTempSelect.selectOptionContainingText("Extra Hot");
    milkFoamSelect.selectOptionContainingText("Extra Foam");
    doneBtn.click();
  }

  public void addToOrder() {
    addToOrderBtn.click();
  }

  public void editToppings() {
    toppingsEditBtn.scrollIntoView(true).click();
    cascaraToppingSelect.selectOption(1);
    cinnamonSelect.selectOption(1);
    drizzleSelect.selectOption(1);
    mochaDrizzleSelect.selectOption(1);
    chocolatePowderSelect.selectOption(1);
    cinnamonPowderSelect.selectOption(1);
    nutmegPowderSelect.selectOption(1);
    vanillaPowderSelect.selectOption(1);
    whippedCreamSelect.selectOption(1);
    doneBtn.click();
  }

  public void editFlavors() {
    flavorsEditBtn.scrollIntoView(true).click();
    caramelSyrupPicker.click();
    doneBtn.click();
  }

}
