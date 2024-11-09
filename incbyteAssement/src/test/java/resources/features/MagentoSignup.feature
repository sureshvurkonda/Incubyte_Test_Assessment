Feature: User Signup on Magento Website
  As a user, I want to create an account on Magento to start shopping.

  Scenario: Successful signup with valid details
    Given I am on the Magento signup page
    When I enter the first name "John", last name "Doe", email "john.doe@example.com", password "StrongPassword123", and confirm password "StrongPassword123"
    And I click the Create an Account button
    Then I should be redirected to the account dashboard

  Scenario: Unsuccessful signup with invalid email
    Given I am on the Magento signup page
    When I enter the first name "John", last name "Doe", email "invalid-email", password "StrongPassword123", and confirm password "StrongPassword123"
    And I click the Create an Account button
    Then I should see an error message "Please enter a valid email address."

  Scenario: Unsuccessful signup with mismatched passwords
    Given I am on the Magento signup page
    When I enter the first name "John", last name "Doe", email "john.doe@example.com", password "StrongPassword123", and confirm password "MismatchPassword123"
    And I click the Create an Account button
    Then I should see an error message "The password and confirmation password do not match."
