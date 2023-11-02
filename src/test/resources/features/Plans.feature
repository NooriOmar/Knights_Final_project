Feature: Validate Plans elements
#Plans
#Scenario 1)
#Navigate to Customer Service Portal with valid CSR credentials and navigate to Plans Page.
# Validate 4 row of data is present.

  Background: Successful Login
    Then navigate and click login button
    Then enter username as "supervisor" and password as "tek_supervisor"
    Then navigate and click sign in button


  @US_8
  Scenario: validate 4 row of data is present in plans page
    Then click on Plans
    Then validate plans section title as "Today's Plans Price"
    Then validate plan table headers
      | PLAN TYPE | PLANE BASE PRICE | DATE CREATED | DATE EXPIRE |
    Then validate data of 4 rows


