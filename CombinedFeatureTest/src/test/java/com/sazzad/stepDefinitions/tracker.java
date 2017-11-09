package com.sazzad.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import sun.security.util.PendingException;

/**
 * Created by hossain on 11/9/2017.
 */
public class tracker {
    @Given("^perform first step$")
    public void perform_first_step() {
        System.out.println("Accessed first step");
    }

    @Then("^perform next step$")
    public void perform_next_step() {
        System.out.println("Accessed next step");
        Assert.fail();
    }

    @Then("^check the result$")
    public void check_the_result(){
        System.out.println("Accessed result(final) step");
    }
}
