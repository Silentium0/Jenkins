Feature: practice smart bear
  Background:
    Given user is already logged in and navigated to order page
  @B2G3-233 @B2G3-159  @wip
  Scenario: user should be able to place order and order should be seen in page
    When user selects product type "FamilyAlbum"
    And user enters quantity 2
    And user enters customer name "Chuck Norris"
    And user enters street "1100 Long way dr"
    And user enters city "Chantilly"
    And user enters state "Virginia"
    And user enters zip "22011"
    And user selects credit card type "American Express"
    And user enters credit car number "1111222233334444"
    And user enters expiration date "12/25"
    And user enters process order button
    Then user should see "Chuck Norris" in the first row of the table