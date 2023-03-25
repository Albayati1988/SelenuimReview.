package review1and2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchApplication {
    public static void main(String[] args) {
        //1- Open the Browser

        System.setProperty("webdriver.chrome.driver","C:\\Users\\beate\\IdeaProjects\\SeleniumReview\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");


    }
}
