Feature: Verify Adactin Hotel App Login Functionality

	@smoke
  Scenario Outline: As a User i Want to Login with Valid Credentials
    Given User is on Adaction Home Page
    When User Enters "<username>" and "<password>"  
    Then Click the Login button

    Examples: 
      | username   | password |
      | Sathish123 | Test123  |
      
@Regression @sanity
  Scenario Outline: As a User i Want to search the hotel
    Given User is on Adaction Search Hotel Page
    When User Enters "<location>" and "<hotel>" and "<roomtype>" and "<roomnos>"  and "<AdultsperRoom>" and "<ChildrenperRoom>"
    Then Click the Submit button

    Examples: 
      | location | hotel          | roomtype | roomnos | NumberofRooms | AdultsperRoom | ChildrenperRoom |
      | Sydney   | Hotel Sunshine | Double   | 2 - Two | 3 - Three     | 2 - Two       | 3 - Three       |

	@Regression
  Scenario: As a User i Want to search the hotel
    Given User is on Adaction Select Hotel Page
    When User Click the radio button
    Then Click the Continue button
    
@Regression
  Scenario Outline: As a User i Want to Book the Hotel
    Given User is on Adaction Book Hotel Page
    When User Enters "<firstname>" and "<lastname>" and "<address>" and "<ccnum>" and "<cctype>" and "<ccexpmonth>" and "<cc_exp_year>" and "<cvv>"
    Then Click the Submit button1

    Examples: 
      | firstname   | lastname   | address                        | ccnum            | cctype           | ccexpmonth | cc_exp_year | cvv |
      | Thiagarajan | Saminathan | no 44 TamilSangam Road Madurai | 1234567891234567 | American Express | September  |        2022 | 123 |

  @sanity
  Scenario: As a User i Want to confirm my booking
    Given User is on Adaction confirmation Page
    When User gets his order no
    Then Click the finalconfirmation button