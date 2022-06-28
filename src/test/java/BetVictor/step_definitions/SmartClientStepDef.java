package BetVictor.step_definitions;
import BetVictor.utilities.GenericFunctions;
import BetVictor.utilities.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class SmartClientStepDef  {
    Pages pages = new Pages();
    @Then("User set animal letter {string}")
    public void user_set_animal_letter(String string) {
        pages.smartClient().user_set_animal_letter(string);

    }

    @Then("User move max life span slider from between {string} to {string} with this value {string} to {string}")
    public void userMoveMaxLifeSpanSliderFromBetweenToWithThisValueTo(String arg0, String arg1, String arg2, String arg3) {
        pages.smartClient().userMoveMaxLifeSpanSliderFromBetweenToWithThisValueTo(arg0,arg1,arg2,arg3);
    }

    @Given("User open the browser Amount Slider on the {string}")
    public void userOpenTheBrowserAmountSliderOnThe(String arg0) {
        pages.smartClient().userOpenTheBrowserAmountSliderOnThe(arg0);
    }

    @And("User click the Ascending box")
    public void userClickTheAscendingBox() {
        pages.smartClient().useClickTheAscendingBox();

    }


    @Then("User click the {string}")
    public void userClickThe(String arg0) {
        pages.smartClient().userClickThe(arg0);
    }

    @And("User sort order by {string}")
    public void userSortOrderBy(String arg0) {
        pages.smartClient().userSortOrderBy(arg0);
    }

    @And("User click the sort by")
    public void userClickTheSortBy() {
        pages.smartClient().userClickTheSortBy();
    }

    @Then("User calculate the {string}")
    public void userCalculateThe(String arg0) {
        pages.smartClient().calculateThe(arg0);

    }

    @When("User navigate to {string} URL")
    public void userNavigateToURL(String url) {
        pages.genericFunctions().openApplicationWithURL(url);
    }


    @And("User click the item")
    public void userClickTheItem() {
        pages.smartClient().userClickTheItem();

    }

    @And("User select item contains {string} units contains {string} unit cost greater then {string}")
    public void userSelectItemContainsUnitsContainsUnitCostGreaterThen(String arg0, String arg1, String arg2) {
        pages.smartClient().userSelectItemContainsUnitsContainsUnitCostGreaterThen(arg0,arg1,arg2);
    }
}
