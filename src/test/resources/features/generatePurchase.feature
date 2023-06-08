#Author: Liz Ortega
Feature: As a user, I need to purchase the products in the page saucedemo.com

  @MakePurchaseSuccessful
  Scenario Outline: Generate a successful purchase
    Given the user wants to purchase three products
    When the user to needs his credentials for the access
      | username      | password      |
      | <srtUsername> | <srtPassword> |
    And the user has sorted the products from lowest to highest value
    And the user adds to the cart the lowest priced product, the highest priced product and another product with any price
    And the user navigates to the cart page and removes one of the products
    And the user completes the checkout process, enters the required data and continues with the purchase
      | name      | lastName      | codePostal      |
      | <srtName> | <srtLastName> | <srtCodePostal> |
    Then the user validates the total items
    And the user validates the total price
    And user validates purchase success total with a message
      | MessageFinal      |
      | <srtMessageFinal> |

    Examples:
      | srtUsername   | srtPassword  | srtName | srtLastName | srtCodePostal | srtMessageFinal           |
      | standard_user | secret_sauce | Liz     | Ortega      | 630002        | Thank you for your order! |

  @FailedLoginWhitLockedOutUser
  Scenario Outline: Generate a error authentication
    Given the user wants to purchase three products
    When the user to needs his credentials for the access
      | username      | password      |
      | <srtUsername> | <srtPassword> |
    Then the user displays the error message login
      | messageError      |
      | <srtErrorMessage> |

    Examples:
      | srtUsername     | srtPassword  | srtErrorMessage                                                           |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out.                       |
      | otherUser       | secret_sauce | Epic sadface: Username and password do not match any user in this service |

  @FailedInThePurchaseForm
  Scenario Outline: Generate a error in the purchase form
    Given the user wants to purchase three products
    When the user to needs his credentials for the access
      | username      | password      |
      | <srtUsername> | <srtPassword> |
    And the user has sorted the products from lowest to highest value
    And the user adds to the cart the lowest priced product, the highest priced product and another product with any price
    And the user navigates to the cart page and removes one of the products
    And the user completes the checkout process, enters the required data and continues with the purchase
      | name      | lastName      | codePostal      |
      | <srtName> | <srtLastName> | <srtCodePostal> |
    Then the user displays the error message
      | messageErrorForm      |
      | <srtErrorMessageForm> |

    Examples:
      | srtUsername   | srtPassword  | srtName | srtLastName | srtCodePostal | srtErrorMessageForm            |
      | standard_user | secret_sauce | Liz     | Ortega      |               | Error: Postal Code is required |
      | standard_user | secret_sauce | Liz     |             | 63002         | Error: Last Name is required   |
      | standard_user | secret_sauce |         | Ortega      | 63002         | Error: First Name is required  |