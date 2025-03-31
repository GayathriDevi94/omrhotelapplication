Feature: Verifying  Login Module

  Scenario Outline: Verifying login with valid credentials without Enter Key
    Given User is on the OMR Branch hotel page
    When User login "<User name>" and "<Password>"
    Then User should verify success message after login "Welcome Gayathri"

    Examples: 
      | User name | Password |
      | 21gayu1994@gmail.com | Lagan@2023 |
      
	
  Scenario Outline: Verifying login with valid credentials with Enter Key
    Given User is on the OMR Branch hotel page
    When User login "<User name>" and "<Password>" with enter key
    Then User should verify success message after login "Welcome Gayathri"

    Examples: 
      | User name | Password |
      | 21gayu1994@gmail.com | Lagan@2023 |
	
  Scenario Outline: Verifying login with invalid credentials
    Given User is on the OMR Branch hotel page
    When User login "<User name>" and "<Password>"
    Then User should verify error message after login "Invalid Login details or Your Password might have expired."

    Examples: 
      | User name | Password |
      | 21gayu1994@gmail.com | Lagan@2013 |
