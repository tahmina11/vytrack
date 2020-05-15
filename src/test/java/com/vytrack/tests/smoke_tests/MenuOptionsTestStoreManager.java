package com.vytrack.tests.smoke_tests;

import com.vytrack.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MenuOptionsTestStoreManager extends TestBase {
    //    Test case: store manager
//   1. Login   to Vytrack    as a  store  manager
    @BeforeMethod
    public void loginAsManager() {
        userNameBox.sendKeys(ConfigurationReader.getProperty("usernameStoreManager"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }


    //       2. Navigate    to Dashboards à Dashboard,   verify page   title  Dashboard  - Dashboards,  verify
//    page   name   Dashboard
    @Test
    public void verifyDashboard() {
        WebElement dashboards = driver.findElement(By.xpath("//span[contains(text(),'Dashboards')]"));
        actions.moveToElement(dashboards).perform();
        WebElement dashboard = driver.findElement(By.xpath("//a[.='Dashboard']//span"));
        dashboard.click();

        wait.until(ExpectedConditions.titleIs("Dashboard - Dashboards"));
        String expected1 = driver.getTitle();
        String actual1 = "Dashboard - Dashboards";
        System.out.println("expected1 = " + expected1);
        Assert.assertEquals(actual1, expected1);

        String dash = driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();
        Assert.assertEquals(dash, ("Dashboard"));
    }

    //   3. Navigate    to Fleet  à Vehicles,    verify page   title  All    - Car  - Entities - System   - Car  - Entities -
//   System,    page   name   All    Cars
    @Test

    public void verifyFleet() {
        WebElement fleet = driver.findElement(By.xpath("//span[contains(text(),'Fleet')]"));
        actions.moveToElement(fleet).perform();
        WebElement vehicles = driver.findElement(By.xpath("//a[.='Vehicles']//span"));
        vehicles.click();

        wait.until(ExpectedConditions.titleIs("All - Car - Entities - System - Car - Entities - System"));
        String expected2 = driver.getTitle();
        String actual2 = "All - Car - Entities - System - Car - Entities - System";
        System.out.println("expected1 = " + expected2);
        Assert.assertEquals(actual2, expected2);

        String dash = driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();
        Assert.assertEquals(dash, ("All Cars"));

    }

    //   4. Navigate    to Customers  à Accounts,    verify page   title  All - Accounts – Customers, verify
//   page   name   All    Accounts
    @Test
    public void verifyAccount() {
        WebElement customers = driver.findElement(By.xpath("//span[contains(text(),'Customers')]"));
        actions.moveToElement(customers).perform();
        WebElement accounts = driver.findElement(By.xpath("//a[.='Accounts']//span"));
        accounts.click();

        wait.until(ExpectedConditions.titleIs("All - Accounts - Customers"));
        String expected3 = driver.getTitle();
        String actual3 = "All - Accounts - Customers";
        System.out.println("expected1 = " + expected3);
        Assert.assertEquals(actual3, expected3);

        String dash = driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();
        Assert.assertEquals(dash, ("All Accounts"));
    }

    //   5. Navigate    to Customers  à Contacts,    verify page   title  All - Contacts - Customers,    verify page
//   name   All    Contacts
    @Test
    public void verifyCustomers() {
        WebElement customers = driver.findElement(By.xpath("//span[contains(text(),'Customers')]"));
        actions.moveToElement(customers).perform();
        WebElement contacts = driver.findElement(By.xpath("//a[.='Contacts']//span"));
        contacts.click();

        wait.until(ExpectedConditions.titleIs("All - Contacts - Customers"));
        String expected3 = driver.getTitle();
        String actual3 = "All - Contacts - Customers";
        System.out.println("expected1 = " + expected3);
        Assert.assertEquals(actual3, expected3);

        String dash = driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();
        Assert.assertEquals(dash, ("All Contacts"));
    }

    //   6. Navigate    to Sales  à Opportunities,   verify page   title  Open   Opportunities  - Opportunities    -
//   Sales, verify page    name   Open   Opportunities
    @Test
    public void verifyOpportunities() {

        WebElement sales = driver.findElement(By.xpath("//span[contains(text(),'Sales')]"));
        actions.moveToElement(sales).perform();
        WebElement opportunities = driver.findElement(By.xpath("//a[.='Opportunities']//span"));
        opportunities.click();

        wait.until(ExpectedConditions.titleIs("Open Opportunities - Opportunities - Sales"));
        String expected3 = driver.getTitle();
        String actual3 = "Open Opportunities - Opportunities - Sales";
        System.out.println("expected3 = " + expected3);
        Assert.assertEquals(actual3, expected3);

        String dash = driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();
        Assert.assertEquals(dash, ("Open Opportunities"));
    }

    //   7. Navigate    to Activities à Calls    verify page   title
//   All    - Calls - Activities,  page   name   All    Calls
    @Test
    public void verifyActivities() {
        WebElement activities = driver.findElement(By.xpath("//span[contains(text(),'Activities')]"));
        actions.moveToElement(activities).perform();
        WebElement calls = driver.findElement(By.xpath("//a[.='Calls']//span"));
        calls.click();

        wait.until(ExpectedConditions.titleIs("All - Calls - Activities"));
        String expected3 = driver.getTitle();
        String actual3 = "All - Calls - Activities";
        System.out.println("expected3 = " + expected3);
        Assert.assertEquals(actual3, expected3);

        String dash = driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();
        Assert.assertEquals(dash, ("All Calls"));
    }

    //   8. Navigate    to Activities à Calendar Events,    verify page   title  Calendar   Events - Activities,  page
//   name   All    Calendar   Events
    @Test
    public void verifyActivitiesAndCalendarEvents() {
        WebElement activities = driver.findElement(By.xpath("//span[contains(text(),'Activities')]"));
        actions.moveToElement(activities).perform();
        WebElement calendar = driver.findElement(By.xpath("//a[.='Calendar Events']//span"));
        calendar.click();

        wait.until(ExpectedConditions.titleIs("All - Calendar Events - Activities"));
        String expected3 = driver.getTitle();
        String actual3 = "All - Calendar Events - Activities";
        System.out.println("expected3 = " + expected3);
        Assert.assertEquals(actual3, expected3);


        wait.until(ExpectedConditions.textToBe(By.xpath("//h1[@class='oro-subtitle']"), "All Calendar Events"));
        String dash = driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();
        Assert.assertEquals(dash, ("All Calendar Events"));
    }

}
