package com.sazzad.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.sazzad.stepDefinitions.DriverSetup.driver;

/**
 * Created by hossain on 11/8/2017.
 */
public class Add {

    private static WebElement sum;
    private static String string_sum;
    private static String result;

    @Given("^go to google$")
    public void go_to_google() {
        driver.get("http://google.com");
    }

    @Then("^put \"([^\"]*)\" and \"([^\"]*)\"$")
    public void put_and(String arg1, String arg2) {
        String exp = arg1+"+"+arg2;
        driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys(exp);

    }

    @Then("^get \"([^\"]*)\"$")
    public void get(String arg1){
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).click(); // click on search
        sum = driver.findElement(By.xpath("//*[@id=\"cwtltblr\"]/div[2]"));
        string_sum = sum.getText();
        //System.out.println(string_sum);
        if(string_sum.equals(arg1)){
            result = "true";
        }

    }

    @Then("^check \"([^\"]*)\"$")
    public void check(String arg1){


        try{

            if (result.equals(arg1)){
                System.out.println("Sum is working fine and 2+2 is giving 4");
            }else{
                throw new Exception();
            }

        }catch (Exception e){
            System.out.println("Not working..ERROR!!!");
        }

    }
}
