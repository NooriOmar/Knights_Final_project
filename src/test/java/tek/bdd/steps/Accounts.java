package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

    @When("change the show per page to {string}")
    public void change_the_show_per_page_to(String number) {
        enterValue(AccountsPage.showPerpage,number);

    }
    @Then("validate the table accounts to be {string}")
    public void validate_the_table_accounts_to_be(String accountNumber) {


    }

}
