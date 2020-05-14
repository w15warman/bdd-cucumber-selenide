package com.si.definitions;

import static com.si.pages.web.PagePaths.*;
import static org.junit.Assert.assertEquals;

import com.codeborne.selenide.WebDriverRunner;
import com.si.pages.web.PageCollection;
import cucumber.api.java.en.Then;

public class VerificationStepDef {

  PageCollection pages = new PageCollection();

  @Then("the customer sees the menu page")
  public void theCustomerSeesTheMenuPage() {
    assertEquals(MENU_PAGE, WebDriverRunner.url());
  }

  @Then("the customer sees the menu page with hot drinks")
  public void theCustomerSeesTheMenuPageWithHotDrinks() {
    assertEquals(HOT_DRINKS_PAGE, WebDriverRunner.url());
  }

  @Then("the customer sees the Hot Chocolate details page")
  public void theCustomerSeesTheHotChocolateDetailsPage() {
    assertEquals(HOT_CHOCOLATE_DETAILS_PAGE, WebDriverRunner.url());
  }
}
