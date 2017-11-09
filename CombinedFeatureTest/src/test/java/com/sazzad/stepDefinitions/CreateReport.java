package com.sazzad.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileWriter;
import java.io.IOException;

import static com.sazzad.stepDefinitions.DriverSetup.driver;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by hossain on 11/9/2017.
 */
public class CreateReport {


    private WebElement element;
    private String text_value;
    private String status;
    private String input;



    @Given("^user navigates to google$")
    public void user_navigates_to_google() {
        driver.get("http://google.com");
    }

    @When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_and(String num1, String num2) throws InterruptedException {
        input = num1 + "+" + num2;
        driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys(input);

        driver.findElement(By.xpath("//INPUT[@value='Google Search']")).click();
        element = driver.findElement(By.xpath("//*[@id=\"cwtltblr\"]/div[2]"));
        System.out.println("Element fetched");
    }
//-----------------------------
    @Then("^check the \"([^\"]*)\" and define the \"([^\"]*)\"$")
    public void check_the_output(String result, String state) {


//        text_value = element.getText();

//        try{
//            assertEquals(result, text_value);
//            status = "true";
//
//        }catch (Exception e){
//
//            status = "false";
//        }

    }

    @Then("^^write to csv file$$")
    public void write_to_csv_file() throws IOException {

//        try{
//            FileWriter writer = new FileWriter("report.csv");
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }

    }
}