package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import tek.bdd.pages.AccountsPage;
import tek.bdd.utility.SeleniumUtility;

public class Accounts extends SeleniumUtility {
    @Given("Click on the Accounts button")
    public void click_on_the_accounts_button() {
        clickOnElement(AccountsPage.AccountsButton);

    }
    @Then("Verify that there is {int} row in the table")
    public void verify_that_there_is_row_in_the_table(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
