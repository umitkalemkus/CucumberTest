package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsStepDefinitions {
    @Given("Smoke test icin hazirliklar yapildi")
    public void smokeTestIcinHazirliklarYapildi() {
    }

    @When("Smoke test calistiginda")
    public void smokeTestCalistiginda() {
        System.out.println("smoke test calisti");
    }

    @Then("Smoke test basarili olmali")
    public void smokeTestBasariliOlmali() {
    }

    @Given("Regression test icin hazirliklar yapildi")
    public void regressionTestIcinHazirliklarYapildi() {
    }

    @When("Regression test calistiginda")
    public void regressionTestCalistiginda() {
        System.out.println("Regression test calisti");

    }

    @Then("Regression basarili olmali")
    public void regressionBasariliOlmali() {
    }

    //@FindBy(xpath = "(//div [contains(text() ,'Accept all')])[2]")
}
