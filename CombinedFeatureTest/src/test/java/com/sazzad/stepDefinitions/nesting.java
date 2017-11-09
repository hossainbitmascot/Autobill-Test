package com.sazzad.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * Created by hossain on 11/9/2017.
 */
public class nesting {

    @Given("^go to someplace$")
    public void go_to_someplace() {
        System.out.println("nesting.go_to_someplace");
    }

    @Then("^insert \"([^\"]*)\" and \"([^\"]*)\"$")
    public void insert_and(String arg1, String arg2) {
        System.out.println("nesting.insert_and");
    }

    @Then("^press search button$")
    public void press_search_button() {
        System.out.println("nesting.press_search_button");
    }

    @Then("^give output$")
    public void give_output() {

    }
}
