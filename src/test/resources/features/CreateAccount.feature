Feature: Validate Create Primary Accounts Elements

  @US_2
  Scenario: Clicking on Create Primary Account Button and validating page title
    Then click on Create Primary Account Button
    And the form title should be "Create Primary Account Holder"

  @US_3
  Scenario: Filling up the sign up form validation
    Then click on Create Primary Account Button
    And the form title should be "Create Primary Account Holder"
    When enter Email Address as "emad.khan@gmail.com"
    When select title as "Mr."
    When enter First Name as "Emad"
    When enter Last Name as "Khan"
    When select Gender as "Male"
    When select Marital Status as "Single"
    When enter Employment Status as "Student"
    When enter Date Of Birth as "01/09/2023"
    Then click on Create Account
    And signUp page title should be "Sign up your account"
    Then validate created email should be "emad.khan@gmail.com"

    @US_4
    Scenario: Validate error message when creating account with existing email address
      Then click on Create Primary Account Button
      And the form title should be "Create Primary Account Holder"
      When enter Email Address as "Laal@gmail.com"
      When select title as "Mr."
      When enter First Name as "Lily"
      When enter Last Name as "noori"
      When select Gender as "Female"
      When select Marital Status as "Married"
      When enter Employment Status as "SDET"
      When enter Date Of Birth as "01/01/1998"
      Then click on Create Account
      Then validate error message using existed email in sign up page "ERROR"





