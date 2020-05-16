package com.si.definitions;

import com.si.pages.web.PageCollection;
import io.cucumber.java.en.When;

public class FindStoreStepdefs {

  PageCollection pages = new PageCollection();

  @When("the customer goes to the store map")
  public void theCustomerGoesToTheStoreMap() {
    pages.homePage
        .openStoreMap();
  }

  @When("the customer wants to find a store in New York")
  public void theCustomerWantsToFindAStoreInNewYork() {
    pages.storeMapPage
        .findStore();
  }
}
