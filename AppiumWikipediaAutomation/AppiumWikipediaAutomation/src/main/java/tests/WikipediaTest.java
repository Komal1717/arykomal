package tests;

import base.DriverFactory;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class WikipediaTest {
    AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        driver = DriverFactory.initializeDriver();
    }

    @Test
    public void searchTest() {
        driver.findElement(By.id("org.wikipedia:id/search_container")).click();
        driver.findElement(By.id("org.wikipedia:id/search_src_text")).sendKeys("Selenium");
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}