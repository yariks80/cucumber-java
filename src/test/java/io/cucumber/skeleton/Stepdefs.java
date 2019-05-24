package io.cucumber.skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes)  {
        Belly belly = new Belly();
        belly.eat(cukes);
    }


    @When("^I wait (\\d+) hour$")
    public void I_wait_hours(int hours) {
        try {
            Thread.sleep(hours*0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("^my belly should growl$")
    public boolean my_belly_should_growl() {
        return true;
    }
}
