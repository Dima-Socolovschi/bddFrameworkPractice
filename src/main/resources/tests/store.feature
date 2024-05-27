Feature: Buy a phone

  Scenario Outline: Buy a phone
    Given open application
    And user click on phones category
    And user waits till the page is loaded
    And user click on "<phone>" phone
    And user waits till the page is loaded
    Then user should see "<phone>" phone page
    And user click on add to cart button
    Then user should see an alert with "Product added" message
    And user click on navigation cart button
    And user waits till the page is loaded
    And user should see "<phone>" in the cart
    And user click on Place Order button
    And user waits till the page is loaded
    And user enters the name "Vasea Pupkin"
    And user enters the country "<country>"
    And user enters the city "<city>"
    And user enters the credit card "1234567890"
    And user enters the month "02"
    And user enters the year "29"
    And user click on Purchase button
    And user waits till the page is loaded
    Then user should see order summary

    Examples:
      | phone          | city   | country   |
      | Nexus 6        | Rome   | Italy     |
      | Sony xperia z5 | Sidney | Australia |
