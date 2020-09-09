@NopCommerce
Feature: Registered User and Guest User can buy product.

  @test1
  Scenario: Registered User can buy any product

    Given User should be able to complete registration successfully
    When User selects the product
    And User fill in the payment details
    Then User should see the confirmation message

  @test2
  Scenario: Guest User should Be able to buy product.

    Given User selects the product
    And click continue as guest.
    When User fill in the payment details with name
    Then User should see the confirmation message