package review4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUpload {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\beate\\IdeaProjects\\SeleniumReview\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(options);
        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@multiple]")).sendKeys("C:\\Users\\beate\\OneDrive\\Desktop\\New folder.txt");





    }


}
