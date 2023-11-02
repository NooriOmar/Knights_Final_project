package tek.bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import tek.bdd.pages.PlansPage;
import tek.bdd.utility.SeleniumUtility;

import java.util.List;

public class PlansSteps extends SeleniumUtility {

    @Then("click on Plans")
    public void clickOnPlansButton(){
        clickOnElement(PlansPage.PLANS_BUTTON);
    }

    @Then("validate plans section title as {string}")
    public void validatePlansSectionTitle(String expectedPlansSectionTitle){
        String actualPlansSectionTitle = getElementText(PlansPage.PLANS_SECTION_TITLE);
        Assert.assertEquals("Validate Plans section title ",
                expectedPlansSectionTitle,
                actualPlansSectionTitle);
    }

    @Then("validate plan table headers")
    public void validatePlansTableHeaders(DataTable dataTable){
        List<List<String>> tableHeadersAsList = dataTable.asLists();

        List<WebElement> headerElements = getListOfElements(PlansPage.PLAN_TABLE_HEADER_ROW);

        List<String> expectedHeaders = tableHeadersAsList.get(0);

        for (int i = 0; i < headerElements.size(); i++){
            String actualHeader = headerElements.get(i).getText();
            String expectedHeader = expectedHeaders.get(i);

            Assert.assertEquals("Validate plan table header",
                    expectedHeader,
                    actualHeader);
        }

    }

    @Then("validate data of 4 rows")
    public void validateDataOf4Rows(DataTable dataTable){
        List<List<String>> tableAsList = dataTable.asLists();

        for(int row=0; row < tableAsList.size(); row++)
            for (int column = 0; column < tableAsList.size(); column++){

            }
        List<WebElement> tableElements = getListOfElements(PlansPage.getTablePlan4RowsData( + 1, + 1));
    }

}
