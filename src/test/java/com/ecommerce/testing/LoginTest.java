package com.ecommerce.testing;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void testLogin() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        // Add your automation steps here (e.g., click login, enter email/password)
        
//        driver.quit();
    }
}
