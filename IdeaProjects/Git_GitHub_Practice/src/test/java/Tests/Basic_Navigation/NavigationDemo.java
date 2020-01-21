package Tests.Basic_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class NavigationDemo {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> s = new ArrayList<>();
        List<String> l = new ArrayList<>();

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // open a website
        //  go to login page
        //enter credentila + click login buttn
        //verify that user login successfully
        driver.get("https://qa3.vytrack.com/user/login");
        driver.findElement(By.id("prependedInput")).sendKeys("user2");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");

        driver.findElement(By.id("_submit")).click();

        //verify login by title
        String expectedTitle  = "Dashboard";
        String actualTitile = driver.getTitle();

        if(expectedTitle.equals(actualTitile)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected Result --> "  +expectedTitle);
            System.out.println("Actual result -->" + actualTitile);
        }

        //verify login by URL
        String expectedURL = "https://qa3.vytrack.com/";
        String actualURL = driver.getCurrentUrl();

        if(expectedURL.equals(actualURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected URL --> "  +expectedURL);
            System.out.println("Actual URL -->" + actualURL);
        }




    }}
