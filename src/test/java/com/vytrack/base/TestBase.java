package com.vytrack.base;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
public class TestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;
    protected Select select;
    protected WebElement userNameBox ;
    protected WebElement passwordBox;
    protected WebElement loginButton;
    protected String url;
    @BeforeMethod
    public void setUp(){
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 5);
        actions = new Actions(driver);
        url = ConfigurationReader.getProperty("url");
        driver.get(url);
        userNameBox = driver.findElement(By.id("prependedInput"));
        passwordBox = driver.findElement(By.id("prependedInput2"));
        loginButton = driver.findElement(By.id("_submit"));
    }
    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
}