package com.sazzad.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by hossain on 11/7/2017.
 */
public class DriverSetup {
    public static WebDriver driver;

    public static void setup(){
        System.setProperty("webdriver.chrome.driver","src/test/driver/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
    }

}
