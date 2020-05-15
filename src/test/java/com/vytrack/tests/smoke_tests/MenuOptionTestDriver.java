package com.vytrack.tests.smoke_tests;

import com.vytrack.base.TestBase;
import com.vytrack.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenuOptionTestDriver extends TestBase {
     /*


    5. Navigate    to Activities à Calendar Events,    verify page   title  Calendar   Events - Activities,  page
    name   Calendar   Events
     */

    @Test
    public void loginAsDriver() {
//        Test Case: Driver
//        1. Login   to Vytrack    as a  driver
        userNameBox.sendKeys(ConfigurationReader.getProperty("usernameDriver"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
        wait.until(ExpectedConditions.titleContains("Dashboard"));

        //2. Navigate    to Fleet  -> Vehicles,verify page   title  Car    - Entities - System   - Car  - Entities -
        //    System,    page   name   Cars
        WebElement fleet = driver.findElement(By.xpath("//span[@class='title title-level-1']"));
        actions.moveToElement(fleet).perform();

        WebElement vehicle= driver.findElement(By.xpath("//li[@class='dropdown-menu-single-item first']"));

        vehicle.click();

        wait.until(ExpectedConditions.titleIs("Car - Entities - System - Car - Entities - System"));
        String expected = driver.getTitle();
        String actual = "Car - Entities - System - Car - Entities - System";
        System.out.println("expected = " + expected);
        Assert.assertEquals(actual, expected);

        String cars = driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();
        Assert.assertEquals(cars,("Cars"));



//        3. Navigate    to Customers  à Accounts,    verify page   title  Accounts   - Customers,   verify page
//        name   Accounts

       WebElement customer = driver.findElement(By.xpath("//span[contains(text(),'Customer')]"));
       actions.moveToElement(customer).perform();
       WebElement accounts = driver.findElement(By.xpath("//span[contains(text(),'Accounts')]"));
        accounts.click();

        wait.until(ExpectedConditions.titleIs("Accounts - Customers"));

        String expected1 = driver.getTitle();
        String actual1 = "Accounts - Customers";
        System.out.println("expected1 = " + expected1);
        Assert.assertEquals(actual1, expected1);

        String account = driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();
        Assert.assertEquals(account,("Accounts"));

//        4. Navigate    to Customers  à Contacts,    verify page   title  Contacts - Customers,  verify page   name
//        Contacts
        customer = driver.findElement(By.xpath("//span[contains(text(),'Customer')]"));
        actions.moveToElement(customer).perform();
        WebElement contacts = driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"));
        contacts.click();

        wait.until(ExpectedConditions.titleIs("Contacts - Customers"));
        String expected2 = driver.getTitle();
        String actual2 = "Contacts - Customers";
        System.out.println("expected2 = " + expected2);
        Assert.assertEquals(actual2, expected2);

        String contacts1 = driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();
        Assert.assertEquals(contacts1,("Contacts"));

//        5. Navigate    to Activities à Calendar Events,    verify page   title  Calendar   Events - Activities,  page
//        name   Calendar   Events

        customer = driver.findElement(By.xpath("//span[contains(text(),'Activities')]"));
        actions.moveToElement(customer).perform();
        WebElement events = driver.findElement(By.xpath("//span[contains(text(),'Calendar Events')]"));
        events.click();

        wait.until(ExpectedConditions.titleIs("Calendar Events - Activities"));
        String expected3 = driver.getTitle();
        String actual3 = "Calendar Events - Activities";
        System.out.println("expected3 = " + expected3);
        Assert.assertEquals(actual3, expected3);

        String calendar = driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();
        Assert.assertEquals(calendar,("Calendar Events"));











    }
}
