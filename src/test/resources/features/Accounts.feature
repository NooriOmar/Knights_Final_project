Feature: Verifying the Accounts page in the UI tek insurance webpage

  Background: Successful Login
    Then navigate and click login button
    Then enter username as "supervisor" and password as "tek_supervisor"
    Then navigate and click sign in button

    Scenario:Verifying the number of accounts existed in Accounts page to be 5
      Given Click on the Accounts button
      Then Verify that there is 5 row in the table

