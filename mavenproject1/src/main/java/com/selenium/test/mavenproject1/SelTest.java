/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selenium.test.mavenproject1;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 *
 * @author Oisin
 */
public class SelTest {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Oisin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension (1800, 1000));
        String url = "http://www.valtech.com";
        driver.get(url);
        
        String content = driver.findElement(By.tagName("body")).getText();
        Assert.assertTrue(content.contains("LATEST NEWS"));
        
        driver.findElement(By.linkText("ABOUT")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "About");
        
        driver.get(url);
        driver.findElement(By.linkText("WORK")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Work");

        driver.get(url);
        driver.findElement(By.linkText("SERVICES")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Services");
        
        driver.get(url);
        driver.findElement(By.cssSelector("i.icons.glyph")).click();
        
        int numberOfCities = driver.findElements(By.className("contactcities")).size();
        System.out.println(numberOfCities);
        
        
        
    }
}
