package April_14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicAtributes {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://register.rediff.com/register/register.php");

        driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).sendKeys("Iana");
        driver.findElement(By.xpath("//input[starts-with(@name,'login')]")).sendKeys("1234567");
        driver.findElement(By.xpath("//input[starts-with(@name,'btn')] ")).click();

    }
}
