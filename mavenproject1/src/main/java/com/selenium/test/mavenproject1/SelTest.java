/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selenium.test.mavenproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 *
 * @author Oisin
 */
public class SelTest {
    public static void main(String[] args){
//        System.setProperty("webdriver.firefox.marionette", "./geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Oisin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "http://www.bbc.co.uk";
        driver.get(url);
    }
}
