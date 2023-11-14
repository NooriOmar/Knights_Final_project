Feature: Verifying the Accounts page in the UI tek insurance webpage

  Background: Successful Login
    Then navigate and click login button
    Then enter username as "supervisor" and password as "tek_supervisor"
    Then navigate and click sign in button
    Given Click on the Accounts button


    Scenario:Verifying the number of accounts existed in Accounts page to be 5
      Then Verify that there is 5 row in the table

      Scenario Outline:Change show per page to 10, 25, 50 and validate table records per page according to selected show per page.
        When change the show per page to "<number>"
        Then validate the table accounts to be "<accountNumber>"

        Examples: |number |accountNumber|
                  |"10"   |"10"         |
                  |"25"   |"25"         |
                  |"50"   |"50"         |


