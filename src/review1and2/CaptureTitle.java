package review1and2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTitle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\beate\\IdeaProjects\\SeleniumReview\\Driver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");
        String pageTitle=driver.getTitle();
        System.out.println("The title of the page is : "+ pageTitle);
    }
}
