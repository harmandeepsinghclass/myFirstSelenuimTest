package com.eviltester.webdriver;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



/**
 * Created by Harman on 12/25/2016.
 */
public class TestAmazonTest
    {


        @Before
        public void setup() throws Exception
            {
                System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.get("https:www.novelupdates.com");

            }
        @After
        public void tearDown() throws Exception
            {

            }

        @Test
        public void test()
            {

            }







    }