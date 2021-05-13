package com.icconsult.examples.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BeerMyStepdefs {
    @Given("I have {string} beer cans")
    public void iHaveBeerCans(String arg0) {
    }

    @And("I have drunk {string} beer cans")
    public void iHaveDrunkBeerCans(String arg0) {
    }

    @When("I go to my fridge")
    public void iGoToMyFridge() {
    }

    @Then("I should have {string} beer cans")
    public void iShouldHaveBeerCans(String arg0) {
    }
}
