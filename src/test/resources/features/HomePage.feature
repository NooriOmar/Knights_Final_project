Feature: Validate Home Page Elements


  #Scenario: Home Page
  # Validate When user navigate to home page title is TEK Insurance App and create Primary
  # Account Button is exist

  @US_1
  Scenario: Verify Home Page Title and Primary Account Button
    Then the page title should be "TEK Insurance App"
    And validate Create Primary Account button is "Enabled"


