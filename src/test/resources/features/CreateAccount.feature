Feature: Validate Create Primary Accounts Elements
  #Scenario 1)
  #Navigate to Home page then click on Create Primary Account Button. User should navigate to
  # Create Account form page validate Form Title as Expected “Create Primary Account Holder”

  @US_2
  Scenario: Clicking on Create Primary Account Button and validating page title
    Then click on Create Primary Account Button
    And the form title should be "Create Primary Account Holder"

#Scenario 2)
#On Create primary account holder form fill up the form and click on create Account Button
#Validate user navigate to Sing up your Account page and email address shows as expected.

  @US_3
  Scenario: Filling up the sign up form validation
    Then click on Create Primary Account Button
    And the form title should be "Create Primary Account Holder"
    When enter Email Address as "Neymar@gmail.com"
    When select title as "Mr."
    When enter First Name as "Tika"
    When enter Last Name as "BBB"
    When select Gender as "Male"
    When select Marital Status as "Single"
    When enter Employment Status as "SDET"
    When enter Date Of Birth as "01/01/2021"
    Then click on Create Account
    And signUp page title should be "Sign up your account"
    Then validate created email should be "Neymar@gmail.com"

    @US_4
    Scenario: Validate error message when creating account with existing email address
      Then click on Create Primary Account Button
      And the form title should be "Create Primary Account Holder"
      When enter Email Address as "Laal@gmail.com"
      When select title as "Mr."
      When enter First Name as "Laal"
      When enter Last Name as "BBB"
      When select Gender as "Male"
      When select Marital Status as "Single"
      When enter Employment Status as "SDET"
      When enter Date Of Birth as "01/01/2021"
      Then click on Create Account
      Then validate error message using existed email in sign up page "ERROR"





