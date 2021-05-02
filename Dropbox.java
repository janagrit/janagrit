package April_14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropbox {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cars.com");
        WebElement stockType = driver.findElement(By.name("stockType"));
        Select select = new Select(stockType);

        select.selectByVisibleText("Used Car");


        select = new Select(driver.findElement(By.name("makeId")));

        System.out.println(select.getFirstSelectedOption().getText());

        // test case - Lamborghini

    }
}
