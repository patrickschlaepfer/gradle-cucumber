@BDDSTORY-SC-2
Feature: User can subscribe to a notification when an item is in-stock
User can subscribe to be notified when an unvaialble item returns to our stock

  Background:
    Given a user searches for an item
    And item is unavailable/out of stock

  @BDDTEST-SC-3
  Scenario: user subscribes to in-stock notification successfully
  Bill is shopping for item X and it is out of stock

    Given the 'Add to cart' button changes to 'Notify me when in-stock'
    And Bill has a proper email address associated with his account
    When Bill selects that button
    Then he is subscribed to be notified when item X is in-stock

  @BDDTEST-SC-4
  Scenario: user receives proper error if subscription fails
    
