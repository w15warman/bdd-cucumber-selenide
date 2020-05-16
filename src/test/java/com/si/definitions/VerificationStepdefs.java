package com.si.definitions;

import static com.si.pages.PagePaths.HOT_CHOCOLATE_DETAILS_PAGE;
import static com.si.pages.PagePaths.HOT_DRINKS_PAGE;
import static com.si.pages.PagePaths.MENU_PAGE;
import static com.si.pages.PagePaths.STORE_MAP_PAGE;
import static org.junit.Assert.assertEquals;

import com.codeborne.selenide.WebDriverRunner;
import com.si.pages.PageCollection;
import io.cucumber.java.en.Then;

public class VerificationStepdefs {

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

  @Then("the customer checks the nutrition information")
  public void theCustomerChecksTheNutritionInformation() {
    assertEquals("500", pages.hotChocolate.getCaloriesItem().getText());
  }

  @Then("the customer sees the map of the stores")
  public void theCustomerSeesTheMapOfTheStores() {
    assertEquals(STORE_MAP_PAGE, WebDriverRunner.url());
  }
}
