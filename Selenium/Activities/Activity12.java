package activities;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class Activity12 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("Home page title: " + driver.getTitle());
        WebElement textbox = driver.findElement(By.id("input-text"));
        System.out.println("Input field is enabled: " + textbox.isEnabled());
        driver.findElement(By.id("toggleInput")).click();
        System.out.println("Input field is enabled: " + textbox.isEnabled());
        driver.close();
    }


}
