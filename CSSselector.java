package April_14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.duotech.io/");
        //a[@class='button w-button']

        // a.button.w-button            CSS selector
        driver.findElement(By.cssSelector("a.button.w-button")).click();
        driver.get("https://www.duotech.io/contact");
        driver.findElement(By.cssSelector("form.contact-split-form input#name")).sendKeys("Iana");
        driver.findElement(By.cssSelector("form.contact-split-form input#email")).sendKeys("1467874023@qq.com");
        driver.findElement(By.cssSelector("form.contact-split-form textarea#field")).sendKeys("Hello, I am doing test on duotech website, hope you have just received an email");
        driver.findElement(By.cssSelector("input.button.contact-button")).click();
        //   body > div.page-wrapper > div:nth-child(5) > div.wrapper.w-container > a

        for (int i = 0; i < 2; i++) {
            driver.get("https://www.duotech.io/contact");
            driver.findElement(By.cssSelector("form.contact-split-form input#name")).sendKeys("Iana");
            driver.findElement(By.cssSelector("form.contact-split-form input#email")).sendKeys("1467874023@qq.com");
            driver.findElement(By.cssSelector("form.contact-split-form textarea#field")).sendKeys("Hello, I am doing test on duotech website, hope you have just received an email");
            driver.findElement(By.cssSelector("input.button.contact-button")).click();
            Thread.sleep(800);
        }

        // CSS locator
        driver.get("https://www.duotech.io/business-systems-analyst");
        driver.findElement(By.cssSelector("a[href='/enroll-bsa'][class='button contact-ready-button w-button']")).click();

        // ^   = starts with   -> name^='Register'
        // *    = contains
        // $    = ends with
        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
       // driver.findElement(By.cssSelector("input.captcha")).sendKeys("HYT65");
        driver.findElement(By.cssSelector("input[name^='Register']")).click();


        // DIFFERENCE BETWEEN XPATH VS CSS
       /*
        1. CSS is faster
        2. Xpath allows you to search in both directions
        3. Xpath allows you to find an element based on
        4. //h1[contains(text(),'Start')]   -> CSS has simplier syntax
        */

    }
}
