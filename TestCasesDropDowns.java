package April_14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCasesDropDowns {

    public static void main(String[] args) {
        // Verify that the models that are avail
        //

        System.setProperty("webdriver.chrome.driver", "/Applications/1 selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cars.com");

        new Select(driver.findElement(By.name("stockType"))).selectByVisibleText("Used Cars");
        new Select(driver.findElement(By.name("makeId"))).selectByValue("20069");
        List<WebElement> makeId = new Select(driver.findElement(By.name("modelId"))).getOptions();

//        for (WebElement el: makeId) {
//            System.out.println(el.getText());
//        }

        List<String> expectedList = Arrays.asList("Aventador", "Aventador S", "Aventador SVJ",
                "Diablo", "Gallardo", "Huracan", "Huracan EVO", "Murcielago", "Urus");

        List<String> actualArraylist = new ArrayList<>();

        for (int i = 1; i < makeId.size(); i++) {
            actualArraylist.add(makeId.get(i).getText());
        }

        System.out.println(actualArraylist);
        System.out.println(expectedList);

        if(actualArraylist.equals(expectedList)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }

    }
}
