package com.vytrack.tests.smoke_tests;

import com.vytrack.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.chrono.ThaiBuddhistEra;
public class MenuOptionsTest extends TestBase {
    /*
    Test Case: Driver
    1. Login   to Vytrack    as a  driver
    2. Navigate    to Fleet  -> Vehicles,verify page   title  Car    - Entities - System   - Car  - Entities -
    System,    page   name   Cars
    3. Navigate    to Customers  à Accounts,    verify page   title  Accounts   - Customers,   verify page
    name   Accounts
    4. Navigate    to Customers  à Contacts,    verify page   title  Contacts - Customers,  verify page   name
    Contacts
    5. Navigate    to Activities à Calendar Events,    verify page   title  Calendar   Events - Activities,  page
    name   Calendar   Events
     */
    @Test
    public void driver() {
//TODO   Login to Vytrack    as a  driver
        userNameBox.sendKeys(ConfigurationReader.getProperty("usernameDriver"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
//TODO Navigate to Fleet->Vehicles, verify page title  Car    - Entities - System - Car - Entities -System, page name Cars
        WebElement fleet = driver.findElement(By.xpath("//span[contains(text(),'Fleet')]"));
        WebElement vehicles = driver.findElement(By.xpath("//a[.='Vehicles']"));
        BrowserUtils.waitForUIOverlay();
        actions.moveToElement(fleet).click(vehicles).perform();
        wait.until(ExpectedConditions.titleContains("Car"));
        Assert.assertEquals(driver.getTitle(),"Car - Entities - System - Car - Entities - System");
        WebElement pagename =  driver.findElement(By.xpath("(//h1)[2]"));
        Assert.assertEquals(pagename.getText().trim(), "Cars");
//TODO Navigate    to Customers-> Accounts, verify   page title Accounts - Customers, verify    page name Accounts
        WebElement customer = driver.findElement(By.xpath("//span[contains(text(),'Customer')]"));
        WebElement Accounts = driver.findElement(By.xpath("//a[.='Accounts']"));
        BrowserUtils.waitForUIOverlay();
        actions.moveToElement(customer).click(Accounts).perform();
        wait.until(ExpectedConditions.titleContains("Accounts - Customers"));
        Assert.assertEquals(driver.getTitle(),"Accounts - Customers");
        pagename =  driver.findElement(By.xpath("(//h1)[2]"));
        Assert.assertEquals(pagename.getText().trim(), "Accounts");
//TODO Navigate    to Customers-> Contacts,  verify page title Contacts - Customers, verify    page name Contacts
        customer = driver.findElement(By.xpath("//span[contains(text(),'Customer')]"));
        WebElement contacts = driver.findElement(By.xpath("//a[.='Contacts']"));
        BrowserUtils.waitForUIOverlay();
        actions.moveToElement(customer).click(contacts).perform();
        wait.until(ExpectedConditions.titleContains("Contacts - Customers"));
        Assert.assertEquals(driver.getTitle(),"Contacts - Customers");
        pagename =  driver.findElement(By.xpath("(//h1)[2]"));
        Assert.assertEquals(pagename.getText().trim(), "Contacts");
//TODO Navigate    to Activitiev->Calendar    Events, verify page title Calendar    Events - Activities, page name Calendar    Events
        WebElement activities  = driver.findElement(By.xpath("//span[contains(text(),'Activities')]"));
        WebElement calendarEvents = driver.findElement(By.xpath("//a[.='Calendar Events']"));
        BrowserUtils.waitForUIOverlay();
        actions.moveToElement(activities).click(calendarEvents).perform();
        wait.until(ExpectedConditions.titleContains("Calendar Events - Activities"));
        Assert.assertEquals(driver.getTitle(),"Calendar Events - Activities");
        pagename =  driver.findElement(By.xpath("(//h1)[2]"));
        Assert.assertEquals(pagename.getText().trim(), "Calendar Events");
    }
    /*
    Test case: store manager
    1. Login   to Vytrack    as a  store  manager
    2. Navigate    to Dashboards à Dashboard,   verify page   title  Dashboard  - Dashboards,  verify
    page   name   Dashboard
    3. Navigate    to Fleet  à Vehicles,    verify page   title  All    - Car  - Entities - System   - Car  - Entities -
    System,    page   name   All    Cars
    4. Navigate    to Customers  à Accounts,    verify page   title  All - Accounts – Customers, verify
    page   name   All    Accounts
    5. Navigate    to Customers  à Contacts,    verify page   title  All - Contacts - Customers,    verify page
    name   All    Contacts
    6. Navigate    to Sales  à Opportunities,   verify page   title  Open   Opportunities  - Opportunities    -
    Sales, verify page    name   Open   Opportunities
    7. Navigate    to Activities à Calls    verify page   title  All    - Calls - Activities,  page   name   All    Calls
    8. Navigate    to Activities à Calendar Events,    verify page   title  Calendar   Events - Activities,  page
    name   All    Calendar   Events
     */
    @Test
    public void storeManager() {
//TODO Login to    Vytrack    as a store manager
        userNameBox.sendKeys(ConfigurationReader.getProperty("usernameStoreManager"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
//TODO Navigate    to Dashboards->Dashboard, verify page title    Dashboard - Dashboards,    verify page    name Dashboard
        WebElement dashboards = driver.findElement(By.xpath("//span[contains(text(),'Fleet')]"));
        WebElement dashboard = driver.findElement(By.xpath("//a[.='Dashboard']"));
        BrowserUtils.waitForUIOverlay();
        actions.moveToElement(dashboards).click(dashboard).perform();
        wait.until(ExpectedConditions.titleContains("Dashboard - Dashboards"));
        Assert.assertEquals(driver.getTitle(),"Dashboard - Dashboards");
        WebElement pageName =  driver.findElement(By.xpath("(//h1)[2]"));
        Assert.assertEquals(pageName.getText().trim(), "Dashboard");
//TODO Navigate to Fleet  Vehicles, verify page title All - Car - Entities - System - Car - Entities - System, page name All Cars
        WebElement fleet = driver.findElement(By.xpath("//span[contains(text(),'Fleet')]"));
        WebElement vehicles = driver.findElement(By.xpath("//a[.='Vehicles']"));
        BrowserUtils.waitForUIOverlay();
        actions.moveToElement(fleet).click(vehicles).perform();
        wait.until(ExpectedConditions.titleContains("Car - Entities - System - Car - Entities - System"));
        Assert.assertEquals(driver.getTitle(),"Car - Entities - System - Car - Entities - System");
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("(//h1)[2]"),"All Cars"));
        pageName =  driver.findElement(By.xpath("(//h1)[2]"));
        Assert.assertEquals(pageName.getText().trim(), "All Cars");
//TODO Navigate to Customers  Accounts, verify page title All - Accounts – Customers, verify page name All Accounts
        WebElement customer = driver.findElement(By.xpath("//span[contains(text(),'Customer')]"));
        WebElement Accounts = driver.findElement(By.xpath("//a[.='Accounts']"));
        BrowserUtils.waitForUIOverlay();
        actions.moveToElement(customer).click(Accounts).perform();
        wait.until(ExpectedConditions.titleContains("Accounts - Customers"));
        Assert.assertEquals(driver.getTitle(),"Accounts - Customers");
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("(//h1)[2]"),"All Accounts"));
        pageName =  driver.findElement(By.xpath("(//h1)[2]"));
        Assert.assertEquals(pageName.getText().trim(), "All Accounts");
//TODO Navigate to Customers  Contacts, verify page title All - Contacts - Customers, verify page name All Contacts
        customer = driver.findElement(By.xpath("//span[contains(text(),'Customer')]"));
        WebElement contacts = driver.findElement(By.xpath("//a[.='Contacts']"));
        BrowserUtils.waitForUIOverlay();
        actions.moveToElement(customer).click(contacts).perform();
        wait.until(ExpectedConditions.titleContains("All - Contacts - Customers"));
        Assert.assertEquals(driver.getTitle(),"All - Contacts - Customers");
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("(//h1)[2]"),"All Contacts"));
        pageName =  driver.findElement(By.xpath("(//h1)[2]"));
        Assert.assertEquals(pageName.getText().trim(), "All Contacts");
//TODO Navigate to Sales  Opportunities, verify page title Open Opportunities - Opportunities - Sales, verify page name Open Opportunities
        WebElement sales  = driver.findElement(By.xpath("//span[contains(text(),'Sales')]"));
        WebElement opportunities = driver.findElement(By.xpath("//a[.='Opportunities']"));
        BrowserUtils.waitForUIOverlay();
        actions.moveToElement(sales).click(opportunities).perform();
        wait.until(ExpectedConditions.titleContains("Open Opportunities - Opportunities - Sales"));
        Assert.assertEquals(driver.getTitle(),"Open Opportunities - Opportunities - Sales");
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("(//h1)[2]"),"Open Opportunities"));
        pageName =  driver.findElement(By.xpath("(//h1)[2]"));
        Assert.assertEquals(pageName.getText().trim(), "Open Opportunities");
//TODO Navigate to Activities  Calls verify page title All - Calls - Activities, page name All Calls
        WebElement activities  = driver.findElement(By.xpath("//span[contains(text(),'Activities')]"));
        WebElement calls = driver.findElement(By.xpath("//a[.='Calls']"));
        BrowserUtils.waitForUIOverlay();
        actions.moveToElement(activities).click(calls).perform();
        wait.until(ExpectedConditions.titleContains("All - Calls - Activities"));
        Assert.assertEquals(driver.getTitle(),"All - Calls - Activities");
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("(//h1)[2]"),"All Calls"));
        pageName =  driver.findElement(By.xpath("(//h1)[2]"));
        Assert.assertEquals(pageName.getText().trim(), "All Calls");
//TODO Navigate to Activities  Calendar Events, verify page title Calendar Events - Activities, page name All Calendar Events
        activities  = driver.findElement(By.xpath("//span[contains(text(),'Activities')]"));
        WebElement calendarEvents = driver.findElement(By.xpath("//a[.='Calendar Events']"));
        BrowserUtils.waitForUIOverlay();
        actions.moveToElement(activities).click(calendarEvents).perform();
        wait.until(ExpectedConditions.titleContains("All - Calendar Events - Activities"));
        Assert.assertEquals(driver.getTitle(),"All - Calendar Events - Activities");
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("(//h1)[2]"),"All Calendar Events"));
        pageName =  driver.findElement(By.xpath("(//h1)[2]"));
        Assert.assertEquals(pageName.getText().trim(), "All Calendar Events");
    }
}