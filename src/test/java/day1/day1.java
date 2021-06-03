package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class day1 {
    public static void main (String [] args) {

        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\ersan.oezkan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals("Google", driver.getTitle());
        System.out.println("Passed the Test");
        driver.quit();

    }
}
