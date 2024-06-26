package activities;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class Activity15 {

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        System.out.println("Home page title: " + driver.getTitle());
        WebElement username = driver.findElement(By.xpath("//input[starts-with(@class, 'username-')]"));
        WebElement password = driver.findElement(By.xpath("//input[starts-with(@class, 'password-')]"));
        username.sendKeys("admin");
        password.sendKeys("password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + message);
        driver.quit();
    }


}
