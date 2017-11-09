package com.sazzad.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.sazzad.stepDefinitions.DriverSetup.driver;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by hossain on 11/8/2017.
 */
public class GoogleCalculatorTest {

    static WebElement element;

    @Given("^user navigates to google$")
    public void user_navigates_to_google() {
        driver.get("http://google.com");

    }

    @Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters(String num1, String num2) {
        String input = num1 + "+" + num2;
        driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys(input);

    }

    @Then("^the output should be \"([^\"]*)\"$")
    public void the_output_should_be(String result) throws Exception {
        element = driver.findElement(By.xpath("//*[@id=\"cwtltblr\"]/div[2]"));
        String text_value = element.getText();
        assertEquals(result, text_value);
        System.out.println("Result is found and the result is" + result);
       /* if (){
            System.out.println("Result is found and the result is"+ result);
        }else{
            throw new Exception("result not found");
        }*/

    }
}