package review1and2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LunchApplication2 {
    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\beate\\IdeaProjects\\SeleniumReview\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.google.com/");




    }
}
