package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args){

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/login-form");
        String pageTitle = driver.getTitle();
        System.out.println("The title of the page is "+pageTitle);
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        String confirmation= driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("The confirmation message displaying of the page is "+confirmation);
        driver.close();

    }
}
