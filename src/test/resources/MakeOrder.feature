Feature: Order a drink

  @order
  Scenario: the customer orders a drink

    Given the customer visits the Starbucks online-cafe
    When the customer goes to the menu
    Then the customer sees the menu page
    When the customer wants to order a hot drinks
    Then the customer sees the menu page with hot drinks
    When the customer chooses the Hot Chocolate
    Then the customer sees the Hot Chocolate details page
    When the customer chooses a size
    #    Then the customer checks the nutrition information
    And chooses a milk
    And chooses a toppings
    And chooses a flavors
    And adds a drink to the order

