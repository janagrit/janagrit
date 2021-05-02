package April_14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDowns {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.cars.com/");

        WebElement stockType = driver.findElement(By.name("stockType"));
        Select select = new Select(stockType);
        select.selectByVisibleText("Used Cars");
       // select.selectByValue("28880");

        select = new Select(driver.findElement(By.name("makeId")));
       // select.selectByValue("20069");

       // List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
        System.out.println(select.getFirstSelectedOption().getText());

//        new Select(driver.findElement(By.name("modelId"))).selectByIndex(1); // index is 0 base
//
//        new Select(driver.findElement(By.name("radius"))).selectByIndex(4); // index is 0 base
//
//        driver.findElement(By.name("zip")).clear();
//        driver.findElement(By.name("zip")).sendKeys("20782");
//
//        driver.manage().deleteAllCookies();
//        //driver.findElement(By.xpath("//input[@class='NZE2g']")).click();
//        driver.findElement(By.cssSelector(".NZE2g")).click();

    }
}
