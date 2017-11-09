package com.sazzad.stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.sazzad.initiator.DriverSetup.driver;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by hossain on 11/9/2017.
 */
public class CreateReportSteps {

    private String input;
    private String sum_Text;
    private WebElement sum;
    private String state;

    @Given("^user navigates to google$")
    public void user_navigates_to_google() {

        System.out.println("Accessing google");
        driver.get("http://google.com");


    }

    @When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_and(String arg1, String arg2) {
        input = arg1 + "+" + arg2;
        driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys(input);
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).click();

    }

    @Then("^check the \"([^\"]*)\" and define the \"([^\"]*)\"$")
    public void check_and_define(String result, String state) {
        sum = driver.findElement(By.xpath("//*[@id=\"cwtltblr\"]/div[2]"));
        sum_Text = sum.getText();
        System.out.println(sum_Text); // stored the answer

        //match the result with expectation

        try{
            assertEquals(result, sum_Text);
            this.state = "true";

        }catch (Exception e){
            System.out.println("value mismatch");
            this.state = "false";

        }







    }

    @Then("^write to csv file$")
    public void write_to_csv_file() {



    }

}
