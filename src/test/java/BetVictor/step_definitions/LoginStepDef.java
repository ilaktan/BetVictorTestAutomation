package BetVictor.step_definitions;

import BetVictor.utilities.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
    Pages pages = new Pages();

    @Given("User open browser")
    public void userOpenBrowser() {
        pages.genericFunctions().get();
    }

    @When("User on the Exercise website homepage")
    public void userOnTheExerciseWebsiteHomepage() {
        pages.genericFunctions().userOnTheVodafoneWebsiteHomepage();
    }

    @And("User click the accept button")
    public void userClickTheAcceptButton() {
        pages.login().userClickTheAcceptButton();

    }

    @Then("User close browser")
    public void userCloseBrowser() {
        pages.genericFunctions().closeDriver();


    }
}
