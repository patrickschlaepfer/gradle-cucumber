package com.icconsult.examples.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JiraStepdefs {
    @Given("a user searches for an item")
    public void aUserSearchesForAnItem() {
    }

    @And("item is unavailable\\/out of stock")
    public void itemIsUnavailableOutOfStock() {
    }

    @Given("the {string} button changes to {string}")
    public void theAddToCartButtonChangesToNotifyMeWhenInStock(String button, String buttonLabel) {
    }

    @And("Bill has a proper email address associated with his account")
    public void billHasAProperEmailAddressAssociatedWithHisAccount() {
    }

    @When("Bill selects that button")
    public void billSelectsThatButton() {
    }

    @Then("he is subscribed to be notified when item X is in-stock")
    public void heIsSubscribedToBeNotifiedWhenItemXIsInStock() {
    }
}
