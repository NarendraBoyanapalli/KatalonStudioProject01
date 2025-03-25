Feature: Katalon Demo Login
  Login to Katalon Demo website

  @ValidLogin
  Scenario Outline: Katalon Demo Successful Login
    Given User is on katalon demo home page
    And User clicks on make appointment button
    When User enters <username> and <password>
    And User clicks on login button
    Then User verifies login is successful
    And User closes the browser

    Examples: 
      | username | password                         |
      | John Doe | g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM |

  @InvalidLoginWrongUsername
  Scenario Outline: Katalon Demo Unsuccessful Login- Wrong Username
    Given User is on katalon demo home page
    And User clicks on make appointment button
    When User enters <username> and <password>
    And User clicks on login button
    Then User verifies login is unsuccessful
    And User closes the browser

    Examples: 
      | username   | password                         |
      | Wrong User | g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM |

  @InvalidLoginWrongPassword
  Scenario Outline: Katalon Demo Unsuccessful Login- Wrong Password
    Given User is on katalon demo home page
    And User clicks on make appointment button
    When User enters <username> and <password>
    And User clicks on login button
    Then User verifies login is unsuccessful
    And User closes the browser

    Examples: 
      | username | password                 |
      | John Doe | b/98lgFmTtuLvynNFOQHnA== |
