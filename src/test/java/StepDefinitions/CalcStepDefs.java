package StepDefinitions;

import Framework.Core.CoreObjects;
import Pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcStepDefs extends CoreObjects {
    MainPage mainPage = new MainPage();

    @Given("the user is on the calculator")
    public void theUserIsOnTheCalculator() {
        mainPage.openCalculator();
        mainPage.clearCalculator();
    }

    @Given("the user add the following {string}")
    public void theUserAddTheFollowingNumbers(String numbers) {
        mainPage.addNumbers(numbers);
    }

    @Then("verify the {int} is as expected")
    public void verifyTheResultIsAsExpected(Integer sum) {
        assertEquals(sum, mainPage.getResult());
    }

    @When("the user substracts the following {string}")
    public void theUserSubstractsTheFollowing(String numbers) {
        mainPage.substractNumbers(numbers);
    }

    @When("the user multiplies the following {string}")
    public void theUserMultipliesTheFollowing(String numbers) {
        mainPage.multiplyNumbers(numbers);
    }

    @When("the user divides the following {string}")
    public void theUserDividesTheFollowing(String numbers) {
        mainPage.divideNumbers(numbers);
    }
}
