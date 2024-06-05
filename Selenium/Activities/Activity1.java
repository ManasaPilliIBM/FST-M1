package activities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        driver.findElement(By.linkText("About Us")).click();
        String newpageTitle = driver.getTitle();
        System.out.println(newpageTitle);
        driver.quit();

    }
}