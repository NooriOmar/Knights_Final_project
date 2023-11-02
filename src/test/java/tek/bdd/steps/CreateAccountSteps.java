package tek.bdd.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.pages.CreateAccountPage;
import tek.bdd.utility.SeleniumUtility;

import java.time.Duration;

public class CreateAccountSteps extends SeleniumUtility {

    @Then("click on Create Primary Account Button")
    public void clickOnCPAAccount() throws InterruptedException {
        clickOnElement(CreateAccountPage.CPA_BUTTON);
        Thread.sleep(100);
    }



    @And("the form title should be {string}")
    public void validateCPAformTitle(String expectedCPATitle){
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String actualCPAformTitle = getElementText(CreateAccountPage.CPA_ACCOUNT_CREATION_PAGE_TITLE);

        Assert.assertEquals("Validatation of Creating Primary Account Form Page Title",
                expectedCPATitle,
                actualCPAformTitle);
    }

    @When("enter Email Address as {string}")
    public void enterEmailAddress(String email) {
        enterValue(CreateAccountPage.EMAIL_ADDRESS, email);
    }

    @When("select title as {string}")
    public void selectTitle(String title) {
        enterValue(CreateAccountPage.TITLE_PREFIX, title);
    }

    @When("enter First Name as {string}")
    public void enterFirstName(String firstName) {
        enterValue(CreateAccountPage.FIRST_NAME, firstName);
    }

    @When("enter Last Name as {string}")
    public void enterLastName(String lastName) {
        enterValue(CreateAccountPage.LAST_NAME, lastName);
    }

    @When("select Gender as {string}")
    public void selectGender(String gender) {
        enterValue(CreateAccountPage.GENDER, gender);
    }

    @When("select Marital Status as {string}")
    public void selectMaritalStatus(String maritalStatus) {
        enterValue(CreateAccountPage.MARITAL_STATUS, maritalStatus);
    }

    @When("enter Employment Status as {string}")
    public void enterEmploymentStatus(String employmentStatus) {
        enterValue(CreateAccountPage.EMPLOYMENT_STATUS, employmentStatus);
    }

    @When("enter Date Of Birth as {string}")
    public void enterDateOfBirth(String dateOfBirth) {
        enterValue(CreateAccountPage.DATE_OF_BIRTH, dateOfBirth);
    }

    @Then("click on Create Account")
    public void clickOnCreateAccount() {
        clickOnElement(CreateAccountPage.CREATE_ACCOUNT_BUTTON);
    }

    @Then("signUp page title should be {string}")
    public void validateSignUpPageTitle(String expectedSignUpPageTitle) throws InterruptedException {
        Thread.sleep(1000);
        String actualSignUpPageTitle = getElementText(CreateAccountPage.SIGNUP_PAGE_TITLE);

        Assert.assertEquals("Validate sign up page title",
                expectedSignUpPageTitle,
                actualSignUpPageTitle);
    }

    @Then ("validate created email should be {string}")
    public void validateCreatedEmail(String expectedCreatedEmail){
        String actualCreatedEmail = getElementText(CreateAccountPage.CREATED_EMAIL_VALIDATION);

        Assert.assertEquals("Validate created email",
                expectedCreatedEmail,
                actualCreatedEmail);
    }

    @Then("validate error message using existed email in sign up page {string}")
    public void validateErrorMessageUsingExistedEmailInSignUp(String expectedErrorMessage){
        String actualErrorMessage = getElementText(CreateAccountPage.ERROR_BANNER);

        Assert.assertEquals("Validate Error Message when creating an account with Existing email",
                expectedErrorMessage,
                actualErrorMessage);
    }


}
