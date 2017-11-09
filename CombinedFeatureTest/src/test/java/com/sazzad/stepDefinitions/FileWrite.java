package com.sazzad.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by hossain on 11/9/2017.
 */
public class FileWrite {

    String input, sum;

    @Given("^send \"([^\"]*)\" and \"([^\"]*)\"$")
    public void send_and(String arg1, String arg2) {
        input = arg1+"+"+arg2;

    }

    @When("^find \"([^\"]*)\"$")
    public void find(String arg1) {
        sum = arg1;
    }

    @Then("^write the values and result in a csv file$")
    public void write_the_values_and_result_in_a_csv_file() {
        FileWriter fw = null;
        try {
            fw = new FileWriter("report.csv");
            fw.append("input, sum");
            fw.append("\n");
            String output = input+","+ sum;
            fw.append(output) ;




            System.out.println("CSV creation successful!");


        } catch (Exception e) {
            System.out.println("ERROR in CSV creation :( ");
        } finally {

            try {

                fw.flush();
                fw.close();

            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();

            }

        }
    }
}
