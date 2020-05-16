package com.si.definitions;

import com.si.pages.web.PageCollection;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MakeOrderStepdefs {

  PageCollection pages = new PageCollection();

  @Given("the customer visits the Starbucks online-cafe")
  public void theCustomerVisitsTheStarbucksOnlineCafe() {
    pages.homePage
        .openPage();
  }

  @When("the customer goes to the menu")
  public void theCustomerGoesToTheMenu() {
    pages.homePage
        .openMenu();
  }

  @When("the customer wants to order a hot drinks")
  public void theCustomerWantsToOrderAHotDrinks() {
    pages.menuPage
        .chooseDrinkType();
  }

  @When("the customer chooses the Hot Chocolate")
  public void theCustomerChoosesTheHotChocolate() {
    pages.hotDrinksPage
        .selectDrink();
  }

  @And("adds a drink to the order")
  public void addsADrinkToTheOrder() {
    pages.hotChocolate
        .addToOrder();
  }
}
