package April_14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.cars.com/");

       driver.findElement(By.name("zip")).clear();
        driver.findElement(By.name("zip")).sendKeys("20782");
        //driver.findElement(By.xpath("//input[@value='33138']")).sendKeys("20782");

    }
}
