Feature: Login and buy products

  @smoke_test
  Scenario Outline: Login and buy Blue Shoes
    Given I login to AskOmDch account as "supernn"
    Then  I can see TopBar of AskOmDch
    When  I click store page button
    When  I search "<product>"
    When  I add product into my cart
    When  I click cart icon
    When  I click on checkout button
    When  I set order information
    When  I click on Place Order button
    Then  Total cost is "<cost>"
    Examples:
      | product | cost |
      | Blue Shoes | $55.00     |
#      | product    | cost |
#      | Blue Shoes | $55.00     |
