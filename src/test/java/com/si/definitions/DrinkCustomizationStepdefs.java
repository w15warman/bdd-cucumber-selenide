package com.si.definitions;

import com.si.pages.web.PageCollection;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class DrinkCustomizationStepdefs {

  PageCollection pages = new PageCollection();

  @When("the customer chooses a size")
  public void theCustomerChoosesASize() {
    pages.hotChocolate
        .selectSize();
  }

  @And("chooses a milk")
  public void choosesAMilk() {
    pages.hotChocolate
        .editMilk();
  }

  @And("chooses a toppings")
  public void choosesAToppings() {
    pages.hotChocolate
        .editToppings();
  }

  @And("chooses a flavors")
  public void choosesAFlavors() {
    pages.hotChocolate
        .editFlavors();
  }
}
