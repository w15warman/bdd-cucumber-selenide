Feature: Find a store

  @find_store
  Scenario: the customer chooses a store

    Given the customer visits the Starbucks online-cafe
    When the customer goes to the store map
    Then the customer sees the map of the stores
    When the customer wants to find a store in New York
